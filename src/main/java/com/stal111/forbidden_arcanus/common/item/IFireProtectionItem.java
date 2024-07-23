package com.stal111.forbidden_arcanus.common.item;

import net.minecraft.world.item.ItemStack;

public interface IFireProtectionItem {

    // Normal entity gap time is much too long
    final long damageGapTime = 10L;

    long lastDamageStamp = 0L;

    // Technically not necessary, but this interface makes the skull and shield more modular

    static int getCounterValue(ItemStack stack) {
        if (stack.getOrCreateTag().contains("Counter")) {
            return stack.getOrCreateTag().getInt("Counter");
        }
        // Just a dummy value for incorrect skulls
        else return 9999;
    }

}
