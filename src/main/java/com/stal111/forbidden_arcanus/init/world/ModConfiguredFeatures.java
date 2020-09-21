package com.stal111.forbidden_arcanus.init.world;

import com.google.common.collect.ImmutableSet;
import com.stal111.forbidden_arcanus.block.EdelwoodLogBlock;
import com.stal111.forbidden_arcanus.config.WorldGenConfig;
import com.stal111.forbidden_arcanus.init.ModBlocks;
import com.stal111.forbidden_arcanus.init.NewModBlocks;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.gen.Heightmap;
import net.minecraft.world.gen.blockplacer.ColumnBlockPlacer;
import net.minecraft.world.gen.blockplacer.SimpleBlockPlacer;
import net.minecraft.world.gen.blockstateprovider.SimpleBlockStateProvider;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.feature.template.BlockMatchRuleTest;
import net.minecraft.world.gen.feature.template.RuleTest;
import net.minecraft.world.gen.foliageplacer.AcaciaFoliagePlacer;
import net.minecraft.world.gen.foliageplacer.FancyFoliagePlacer;
import net.minecraft.world.gen.placement.AtSurfaceWithExtraConfig;
import net.minecraft.world.gen.placement.IPlacementConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraft.world.gen.trunkplacer.FancyTrunkPlacer;
import net.minecraft.world.gen.trunkplacer.ForkyTrunkPlacer;

import java.util.OptionalInt;

public class ModConfiguredFeatures {

    public static final ConfiguredFeature<?, ?> ARCANE_CRYSTAL_ORE = register("ore_arcane_crystal", Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.field_241882_a, States.ARCANE_CRYSTAL_ORE, WorldGenConfig.ARCANE_CRYSTAL_ORE_MAX_VEIN_SIZE.get())).func_242733_d(WorldGenConfig.ARCANE_CRYSTAL_ORE_MAX_HEIGHT.get()).func_242728_a().func_242731_b(WorldGenConfig.ARCANE_CRYSTAL_ORE_COUNT.get()));
    public static final ConfiguredFeature<?, ?> RUNESTONE = register("ore_rune", Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.field_241882_a, States.RUNESTONE, WorldGenConfig.RUNESTONE_MAX_VEIN_SIZE.get())).func_242733_d(WorldGenConfig.RUNESTONE_MAX_HEIGHT.get()).func_242728_a().func_242731_b(WorldGenConfig.RUNESTONE_COUNT.get()));
    public static final ConfiguredFeature<?, ?> DARKSTONE = register("ore_darkstone", Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.field_241882_a, States.DARKSTONE, WorldGenConfig.DARKSTONE_MAX_VEIN_SIZE.get())).func_242733_d(WorldGenConfig.DARKSTONE_MAX_HEIGHT.get()).func_242728_a().func_242731_b(WorldGenConfig.DARKSTONE_COUNT.get()));
    public static final ConfiguredFeature<?, ?> ARCANE_GILDED_DARKSTONE = register("ore_arcane_gilded_darkstone", Feature.ORE.withConfiguration(new OreFeatureConfig(FillerBlockTypes.DARKSTONE, States.ARCANE_GILDED_DARKSTONE, WorldGenConfig.ARCANE_CRYSTAL_ORE_MAX_VEIN_SIZE.get())).func_242733_d(WorldGenConfig.ARCANE_GILDED_DARKSTONE_MAX_HEIGHT.get()).func_242728_a().func_242731_b(WorldGenConfig.ARCANE_GILDED_DARKSTONE_COUNT.get()));
    public static final ConfiguredFeature<?, ?> DARK_RUNESTONE = register("ore_dark_rune", Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.field_241882_a, States.DARK_RUNESTONE, WorldGenConfig.DARK_RUNESTONE_MAX_VEIN_SIZE.get())).func_242733_d(WorldGenConfig.DARK_RUNESTONE_MAX_HEIGHT.get()).func_242728_a().func_242731_b(WorldGenConfig.DARK_RUNESTONE_COUNT.get()));
    public static final ConfiguredFeature<?, ?> STELLA_ARCANUM = register("ore_stella_arcanum", Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.field_241882_a, States.STELLA_ARCANUM, WorldGenConfig.STELLA_ARCANUM_MAX_VEIN_SIZE.get())).func_242733_d(WorldGenConfig.STELLA_ARCANUM_MAX_HEIGHT.get()).func_242728_a().func_242731_b(WorldGenConfig.STELLA_ARCANUM_COUNT.get()));
    public static final ConfiguredFeature<?, ?> XPETRIFIED_ORE = register("ore_xpetrified", Feature.EMERALD_ORE.withConfiguration(new ReplaceBlockConfig(States.STONE, States.XPETRIFIED_ORE)).withPlacement(Placement.EMERALD_ORE.configure(IPlacementConfig.NO_PLACEMENT_CONFIG)));
    public static final ConfiguredFeature<?, ?> CHERRYWOOD = register("cherrywood", Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.CHERRYWOOD_LOG), new SimpleBlockStateProvider(States.CHERRYWOOD_LEAVES), new AcaciaFoliagePlacer(FeatureSpread.func_242252_a(2), FeatureSpread.func_242252_a(0)), new ForkyTrunkPlacer(5, 2, 2), new TwoLayerFeature(1, 0, 2))).setIgnoreVines().build()).withPlacement(Placement.field_242902_f.configure(new AtSurfaceWithExtraConfig((int) 0.3F, 0.1F, 1))));
    public static final ConfiguredFeature<?, ?> MYSTERYWOOD = register("mysterywood", Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.MYSTERYWOOD_LOG), new SimpleBlockStateProvider(States.MYSTERYWOOD_LEAVES), new FancyFoliagePlacer(FeatureSpread.func_242252_a(2), FeatureSpread.func_242252_a(4), 4), new FancyTrunkPlacer(3, 11, 0), new TwoLayerFeature(0, 0, 0, OptionalInt.of(4)))).setIgnoreVines().func_236702_a_(Heightmap.Type.MOTION_BLOCKING).build()).withPlacement(Placement.field_242902_f.configure(new AtSurfaceWithExtraConfig((int) 0.8F, 0.1F, 1))));
    public static final ConfiguredFeature<?, ?> YELLOW_ORCHID = register("flower_yellow_orchid", Feature.FLOWER.withConfiguration(Configs.YELLOW_ORCHID).withPlacement(Features.Placements.VEGETATION_PLACEMENT).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).func_242731_b(14));
    public static final ConfiguredFeature<?, ?> EDELWOOD_LOG = register("edelwood_log", Feature.RANDOM_PATCH.withConfiguration(Configs.EDELWOOD_LOG).func_242731_b(3));
    public static final ConfiguredFeature<?, ?> PETRIFIED_ROOT = register("petrified_root", ModFeatures.PETRIFIED_ROOT.get().withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG).func_242733_d(50).func_242728_a().func_242731_b(50));

    private static <FC extends IFeatureConfig> ConfiguredFeature<FC, ?> register(String name, ConfiguredFeature<FC, ?> configuredFeature) {
        return Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, name, configuredFeature);
    }

    public static final class Configs {
        public static final BlockClusterFeatureConfig YELLOW_ORCHID = (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(States.YELLOW_ORCHID), SimpleBlockPlacer.PLACER)).tries(10).build();
        public static final BlockClusterFeatureConfig EDELWOOD_LOG = (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(States.EDELWOOD_LOG), new ColumnBlockPlacer(2, 1))).tries(3).whitelist(ImmutableSet.of(States.GRASS_BLOCK.getBlock())).xSpread(0).ySpread(0).zSpread(0).build();
    }

    public static final class FillerBlockTypes {
        protected static final RuleTest DARKSTONE = new BlockMatchRuleTest(NewModBlocks.DARKSTONE.get());
    }

    public static final class States {
        protected static final BlockState GRASS_BLOCK = Blocks.GRASS_BLOCK.getDefaultState();
        protected static final BlockState STONE = Blocks.STONE.getDefaultState();
        protected static final BlockState ARCANE_CRYSTAL_ORE = ModBlocks.ARCANE_CRYSTAL_ORE.getBlock().getDefaultState();
        protected static final BlockState RUNESTONE = ModBlocks.RUNESTONE.getBlock().getDefaultState();
        protected static final BlockState DARKSTONE = NewModBlocks.DARKSTONE.get().getDefaultState();
        protected static final BlockState ARCANE_GILDED_DARKSTONE = NewModBlocks.ARCANE_GILDED_DARKSTONE.get().getDefaultState();
        protected static final BlockState DARK_RUNESTONE = ModBlocks.DARK_RUNESTONE.getBlock().getDefaultState();
        protected static final BlockState STELLA_ARCANUM = ModBlocks.STELLA_ARCANUM.getBlock().getDefaultState();
        protected static final BlockState XPETRIFIED_ORE = ModBlocks.XPETRIFIED_ORE.getBlock().getDefaultState();
        protected static final BlockState CHERRYWOOD_LOG = ModBlocks.CHERRYWOOD_LOG.getBlock().getDefaultState();
        protected static final BlockState CHERRYWOOD_LEAVES = ModBlocks.CHERRYWOOD_LEAVES.getBlock().getDefaultState();
        protected static final BlockState MYSTERYWOOD_LOG = ModBlocks.MYSTERYWOOD_LOG.getBlock().getDefaultState();
        protected static final BlockState MYSTERYWOOD_LEAVES = ModBlocks.MYSTERYWOOD_LEAVES.getBlock().getDefaultState();
        protected static final BlockState YELLOW_ORCHID = ModBlocks.YELLOW_ORCHID.getBlock().getDefaultState();
        protected static final BlockState EDELWOOD_LOG = ModBlocks.EDELWOOD_LOG.getBlock().getDefaultState().with(EdelwoodLogBlock.LEAVES, true);
    }
}
