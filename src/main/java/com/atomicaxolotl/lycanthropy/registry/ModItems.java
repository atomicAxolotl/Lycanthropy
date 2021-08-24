package com.atomicaxolotl.lycanthropy.registry;

import com.atomicaxolotl.lycanthropy.Lycanthropy;
import com.atomicaxolotl.lycanthropy.items.SilverAxe;
import com.atomicaxolotl.lycanthropy.items.SilverHoe;
import com.atomicaxolotl.lycanthropy.items.SilverPickaxe;
import com.atomicaxolotl.lycanthropy.materials.SilverArmorMaterial;
import com.atomicaxolotl.lycanthropy.materials.SilverToolMaterial;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class ModItems {

    //items
    public static final Item SILVER_INGOT = new Item(new Item.Settings().group(Lycanthropy.ITEM_GROUP));

    //block items
    public static final BlockItem SILVER_ORE = new BlockItem(ModBlocks.SILVER_ORE, new Item.Settings().group(Lycanthropy.ITEM_GROUP));
    public static final BlockItem WOLFSBANE = new BlockItem(ModBlocks.WOLFSBANE,new Item.Settings().group(Lycanthropy.ITEM_GROUP));

    //tools
    public static final ToolItem SILVER_SWORD = new SwordItem(SilverToolMaterial.INSTANCE, 6, 1f, new Item.Settings().group(Lycanthropy.ITEM_GROUP));
    public static final ToolItem SILVER_SHOVEL = new ShovelItem(SilverToolMaterial.INSTANCE, 2f, 2f, new Item.Settings().group(Lycanthropy.ITEM_GROUP));
    public static final ToolItem SILVER_PICKAXE = new SilverPickaxe(SilverToolMaterial.INSTANCE, 4, 1.5f, new Item.Settings().group(Lycanthropy.ITEM_GROUP));
    public static final ToolItem SILVER_AXE = new SilverAxe(SilverToolMaterial.INSTANCE, 7, 1.7f, new Item.Settings().group(Lycanthropy.ITEM_GROUP));
    public static final ToolItem SILVER_HOE = new SilverHoe(SilverToolMaterial.INSTANCE, 2, 2, new Item.Settings().group(Lycanthropy.ITEM_GROUP));

    //armor
    public static final ArmorItem SILVER_HELMET = new ArmorItem(SilverArmorMaterial.INSTANCE, EquipmentSlot.HEAD, new Item.Settings().group(Lycanthropy.ITEM_GROUP));
    public static final ArmorItem SILVER_CHESTPLATE = new ArmorItem(SilverArmorMaterial.INSTANCE, EquipmentSlot.CHEST, new Item.Settings().group(Lycanthropy.ITEM_GROUP));
    public static final ArmorItem SILVER_LEGGINGS = new ArmorItem(SilverArmorMaterial.INSTANCE, EquipmentSlot.LEGS, new Item.Settings().group(Lycanthropy.ITEM_GROUP));
    public static final ArmorItem SILVER_BOOTS = new ArmorItem(SilverArmorMaterial.INSTANCE, EquipmentSlot.FEET, new Item.Settings().group(Lycanthropy.ITEM_GROUP));


    public static void registerItems() {
        Registry.register(Registry.ITEM, new Identifier(Lycanthropy.MOD_ID, "wolfsbane"), WOLFSBANE);
        Registry.register(Registry.ITEM, new Identifier(Lycanthropy.MOD_ID, "silver_ore"), SILVER_ORE);
        Registry.register(Registry.ITEM, new Identifier(Lycanthropy.MOD_ID, "silver_ingot"), SILVER_INGOT);
        Registry.register(Registry.ITEM, new Identifier(Lycanthropy.MOD_ID, "silver_sword"), SILVER_SWORD);
        Registry.register(Registry.ITEM, new Identifier(Lycanthropy.MOD_ID, "silver_shovel"), SILVER_SHOVEL);
        Registry.register(Registry.ITEM, new Identifier(Lycanthropy.MOD_ID, "silver_pickaxe"), SILVER_PICKAXE);
        Registry.register(Registry.ITEM, new Identifier(Lycanthropy.MOD_ID, "silver_axe"), SILVER_AXE);
        Registry.register(Registry.ITEM, new Identifier(Lycanthropy.MOD_ID, "silver_hoe"), SILVER_HOE);
        Registry.register(Registry.ITEM, new Identifier(Lycanthropy.MOD_ID, "silver_helmet"), SILVER_HELMET);
        Registry.register(Registry.ITEM, new Identifier(Lycanthropy.MOD_ID, "silver_chestplate"), SILVER_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier(Lycanthropy.MOD_ID, "silver_leggings"), SILVER_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier(Lycanthropy.MOD_ID, "silver_boots"), SILVER_BOOTS);

    }
}
