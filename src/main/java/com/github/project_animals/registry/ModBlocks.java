package com.github.project_animals.registry;

import com.github.project_animals.ProjectAnimals;
import com.github.project_animals.block.CavityBlock;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.mixin.object.builder.AbstractBlockAccessor;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.MapColor;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {
    public static final Block OAK_CAVITY = register("oak_cavity", new CavityBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG).mapColor(MapColor.OAK_TAN)));

    private static Block register(String id, Block block) {
        return Registry.register(Registry.BLOCK, new Identifier(ProjectAnimals.MOD_ID, id), block);
    }

    public static void init() {
    }
}
