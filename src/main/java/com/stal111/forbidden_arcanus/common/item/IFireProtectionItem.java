package com.stal111.forbidden_arcanus.common.item;

import com.stal111.forbidden_arcanus.core.init.ModItems;
import net.minecraft.core.NonNullList;
import net.minecraft.tags.DamageTypeTags;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.item.ItemStack;

// Technically not necessary, but this interface makes the skull and shield more modular
public interface IFireProtectionItem {

    // Normal entity gap time is too long
    long damageGapTime = 10L;

    // The amount of time in ticks that the fire protection protects for
    int protectionTime = 600;

    static int getCounterValue(ItemStack stack) {
        if (stack.getOrCreateTag().contains("Counter")) {
            return stack.getOrCreateTag().getInt("Counter");
        }
        // Just a dummy value for incorrect skulls
        else return 9999;
    }

    static ItemStack getSkullWithHighestCounter(Inventory inventory) {
        ItemStack skull = ItemStack.EMPTY;
        for (NonNullList<ItemStack> nonNullList : inventory.compartments) {
            for (ItemStack stack : nonNullList) {
                if (!stack.isEmpty() && (stack.is(ModItems.OBSIDIAN_SKULL.get()) || stack.is(ModItems.OBSIDIAN_SKULL_SHIELD.get()))) {
                    if (skull.isEmpty() || isSkullCounterGreater(skull, stack)) {
                        skull = stack;
                    }
                }
            }
        }
        return skull;
    }

    static boolean isSkullCounterGreater(ItemStack skull, ItemStack compareSkull) {
        if (getCounterValue(compareSkull) >= protectionTime) {
            return false;
        }
        if (getCounterValue(skull) >= protectionTime) {
            return true;
        }
        return (getCounterValue(compareSkull) > getCounterValue(skull));
    }

    static boolean shouldProtectFromDamage(DamageSource damageSource, Inventory inventory) {
        if (!damageSource.is(DamageTypeTags.IS_FIRE)) {
            return false;
        }

        if (inventory.contains(ModItems.Stacks.ETERNAL_OBSIDIAN_SKULL)) {
            return true;
        }

        ItemStack stack = IFireProtectionItem.getSkullWithHighestCounter(inventory);

        if (stack.isEmpty()) {
            return false;
        }

        return getCounterValue(stack) < protectionTime;
    }

}
