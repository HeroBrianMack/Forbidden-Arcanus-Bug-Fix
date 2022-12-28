package com.stal111.forbidden_arcanus.core.init.world;

import com.stal111.forbidden_arcanus.ForbiddenArcanus;
import com.stal111.forbidden_arcanus.common.world.structure.NipaPieces;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.levelgen.structure.pieces.StructurePieceType;
import net.minecraftforge.registries.RegistryObject;
import net.valhelsia.valhelsia_core.core.registry.RegistryClass;
import net.valhelsia.valhelsia_core.core.registry.helper.MappedRegistryHelper;

/**
 * Mod Structure Pieces
 * Forbidden Arcanus - com.stal111.forbidden_arcanus.init.world.ModStructurePieces
 *
 * @author stal111
 * @since 2021-04-12
 */
public class ModStructurePieces implements RegistryClass {

    public static final MappedRegistryHelper<StructurePieceType> HELPER = ForbiddenArcanus.REGISTRY_MANAGER.getMappedHelper(Registries.STRUCTURE_PIECE);


    public static final RegistryObject<StructurePieceType> NIPA = HELPER.register("nipa", () -> NipaPieces.Piece::new);
}
