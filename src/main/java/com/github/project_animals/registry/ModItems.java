package com.github.project_animals.registry;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    public static final Item OAK_CAVITY = register(ModBlocks.OAK_CAVITY, ItemGroup.DECORATIONS);

    private static Item register(Block block, ItemGroup group) {
        return ModItems.register(new BlockItem(block, new Item.Settings().group(group)));
    }

    private static Item register(BlockItem item) {
        return ModItems.register(item.getBlock(), item);
    }

    protected static Item register(Block block, Item item) {
        return ModItems.register(Registry.BLOCK.getId(block), item);
    }

    private static Item register(Identifier id, Item item) {
        if (item instanceof BlockItem) {
            ((BlockItem)item).appendBlocks(Item.BLOCK_ITEMS, item);
        }
        return Registry.register(Registry.ITEM, id, item);
    }

    public static void init(){}
}
