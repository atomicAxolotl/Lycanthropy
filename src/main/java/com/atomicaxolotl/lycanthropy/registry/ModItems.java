package com.atomicaxolotl.lycanthropy.registry;

import com.atomicaxolotl.lycanthropy.Lycanthropy;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    //items
    public static final Item WOLFSBANE = new Item(new Item.Settings().group(ItemGroup.DECORATIONS));

    //block items
    public static final BlockItem SILVER_ORE = new BlockItem(ModBlocks.SILVER_ORE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));

    public static void registerItems() {
        Registry.register(Registry.ITEM, new Identifier(Lycanthropy.MOD_ID, "wolfsbane"), WOLFSBANE);
        Registry.register(Registry.ITEM, new Identifier(Lycanthropy.MOD_ID, "silver_ore"), SILVER_ORE);
    }
}
