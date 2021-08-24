package com.atomicaxolotl.lycanthropy.materials;

import com.atomicaxolotl.lycanthropy.registry.ModItems;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

public class SilverArmorMaterial implements ArmorMaterial {

    private static final int[] DURABILITY = {420, 476, 556, 420};
    private static final int[] PROTECTION = {4, 5, 8, 4};

    public static final SilverArmorMaterial INSTANCE = new SilverArmorMaterial();

    @Override
    public int getDurability(EquipmentSlot slot) {
        return DURABILITY[slot.getEntitySlotId()];
    }

    @Override
    public int getProtectionAmount(EquipmentSlot slot) {
        return PROTECTION[slot.getEntitySlotId()];
    }

    @Override
    public int getEnchantability() {
        return 20;
    }

    @Override
    public SoundEvent getEquipSound() {
        return SoundEvents.ITEM_ARMOR_EQUIP_GOLD;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(ModItems.SILVER_INGOT);
    }

    @Override
    public String getName() {
        return "silver";
    }

    @Override
    public float getToughness() {
        return 4f;
    }

    @Override
    public float getKnockbackResistance() {
        return 2f;
    }
}
