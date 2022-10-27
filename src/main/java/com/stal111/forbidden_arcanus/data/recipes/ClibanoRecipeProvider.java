package com.stal111.forbidden_arcanus.data.recipes;

import com.stal111.forbidden_arcanus.common.block.entity.clibano.ClibanoFireType;
import com.stal111.forbidden_arcanus.common.recipe.ClibanoRecipe;
import com.stal111.forbidden_arcanus.core.init.ModBlocks;
import com.stal111.forbidden_arcanus.core.init.ModItems;
import com.stal111.forbidden_arcanus.data.recipes.builder.ClibanoRecipeBuilder;
import com.stal111.forbidden_arcanus.data.recipes.builder.CombineResiduesRecipeBuilder;
import com.stal111.forbidden_arcanus.util.ModTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Blocks;
import net.valhelsia.valhelsia_core.core.data.DataProviderInfo;
import net.valhelsia.valhelsia_core.data.recipes.ValhelsiaRecipeProvider;

/**
 * @author stal111
 * @since 2022-06-26
 */
public class ClibanoRecipeProvider extends ValhelsiaRecipeProvider {

    public static final double CHANCE_65 = 0.65D;
    public static final double CHANCE_33 = 0.33D;
    public static final double CHANCE_20 = 0.2D;
    public static final double CHANCE_10 = 0.1D;
    public static final double CHANCE_05 = 0.05D;

    public ClibanoRecipeProvider(DataProviderInfo info) {
        super(info);
    }

    @Override
    protected void registerRecipes() {
        this.add(ClibanoRecipeBuilder.of(ModItems.ARCANE_CRYSTAL.get(), Ingredient.of(ModTags.Items.ARCANE_CRYSTAL_ORES), 1.0F, 100, new ClibanoRecipe.ResidueInfo("arcane_crystal", CHANCE_33)).unlockedBy("has_item", has(ModTags.Items.ARCANE_CRYSTAL_ORES)));
        this.add(ClibanoRecipeBuilder.of(ModItems.ARCANE_CRYSTAL_DUST.get(), Ingredient.of(ModItems.ARCANE_CRYSTAL.get()), 0.4F, 80, new ClibanoRecipe.ResidueInfo("arcane_crystal", CHANCE_10)).unlockedBy("has_item", has(ModItems.ARCANE_CRYSTAL.get())));
        this.add(ClibanoRecipeBuilder.of(ModItems.RUNE.get(), Ingredient.of(ModTags.Items.RUNIC_STONES), 0.5F, 100, new ClibanoRecipe.ResidueInfo("rune", CHANCE_10)).unlockedBy("has_item", has(ModTags.Items.RUNIC_STONES)));

        this.add(ClibanoRecipeBuilder.of(Items.IRON_INGOT, Ingredient.of(ItemTags.IRON_ORES), 0.35F, 100, new ClibanoRecipe.ResidueInfo("iron", CHANCE_33)).unlockedBy("has_item", has(ItemTags.IRON_ORES)));
        this.add(ClibanoRecipeBuilder.of(Items.GOLD_INGOT, Ingredient.of(ItemTags.GOLD_ORES), 0.5F, 100, new ClibanoRecipe.ResidueInfo("gold", CHANCE_20)).unlockedBy("has_item", has(ItemTags.GOLD_ORES)));
        this.add(ClibanoRecipeBuilder.of(Items.COPPER_INGOT, Ingredient.of(ItemTags.COPPER_ORES), 0.35F, 100, new ClibanoRecipe.ResidueInfo("copper", CHANCE_33)).unlockedBy("has_item", has(ItemTags.COPPER_ORES)));
        this.add(ClibanoRecipeBuilder.of(Items.LAPIS_LAZULI, Ingredient.of(ItemTags.LAPIS_ORES), 0.1F, 100, new ClibanoRecipe.ResidueInfo("lapis_lazuli", CHANCE_20)).unlockedBy("has_item", has(ItemTags.LAPIS_ORES)));
        this.add(ClibanoRecipeBuilder.of(Items.DIAMOND, Ingredient.of(ItemTags.DIAMOND_ORES), 0.5F, 100, new ClibanoRecipe.ResidueInfo("diamond", CHANCE_10)).unlockedBy("has_item", has(ItemTags.DIAMOND_ORES)));
        this.add(ClibanoRecipeBuilder.of(Items.EMERALD, Ingredient.of(ItemTags.EMERALD_ORES), 0.5F, 100, new ClibanoRecipe.ResidueInfo("emerald", CHANCE_10)).unlockedBy("has_item", has(ItemTags.EMERALD_ORES)));
        this.add(ClibanoRecipeBuilder.of(Items.NETHERITE_SCRAP, Ingredient.of(Blocks.ANCIENT_DEBRIS), 1.0F, 100, new ClibanoRecipe.ResidueInfo("netherite", CHANCE_05)).unlockedBy("has_item", has(Blocks.ANCIENT_DEBRIS)));

        this.add(ClibanoRecipeBuilder.of(ModItems.DEORUM_NUGGET.get(), Ingredient.of(ModBlocks.GILDED_DARKSTONE.get()), 1.0F, 150, new ClibanoRecipe.ResidueInfo("deorum", CHANCE_65), ClibanoFireType.BLUE_FIRE).unlockedBy("has_item", has(ModBlocks.GILDED_DARKSTONE.get())));

        this.combineResidue("arcane_crystal", 9, ModBlocks.ARCANE_CRYSTAL_BLOCK.get());
        this.combineResidue("rune", 9, ModBlocks.RUNE_BLOCK.get());

        this.combineResidue("iron", 9, Blocks.IRON_BLOCK);
        this.combineResidue("gold", 9, Blocks.GOLD_BLOCK);
        this.combineResidue("copper", 9, Blocks.COPPER_BLOCK);
        this.combineResidue("lapis_lazuli", 9, Blocks.LAPIS_BLOCK);
        this.combineResidue("diamond", 9, Blocks.DIAMOND_BLOCK);
        this.combineResidue("emerald", 9, Blocks.EMERALD_BLOCK);
        this.combineResidue("netherite", 9, Blocks.NETHERITE_BLOCK);

        this.combineResidue("deorum", 1, ModItems.DEORUM_NUGGET.get(), 2);
    }

    private void combineResidue(String name, int amount, ItemLike result) {
        this.add(CombineResiduesRecipeBuilder.of(name, amount, result));
    }

    private void combineResidue(String name, int amount, ItemLike result, int count) {
        this.add(CombineResiduesRecipeBuilder.of(name, amount, result, count));
    }
}
