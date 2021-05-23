package com.atomicaxolotl.lycanthropy.materials;

import com.atomicaxolotl.lycanthropy.registry.ModItems;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;

public class SilverArmorMaterial implements ArmorMaterial {

    public static final SilverArmorMaterial INSTANCE = new SilverArmorMaterial();

    @Override
    public int getDurability(EquipmentSlot slot) {
        return 300;
    }

    @Override
    public int getProtectionAmount(EquipmentSlot slot) {
        return 4;
    }

    @Override
    public int getEnchantability() {
        return 20;
    }

    @Override
    public SoundEvent getEquipSound() {
        return null;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(ModItems.SILVER_INGOT);
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public float getToughness() {
        return 2;
    }

    @Override
    public float getKnockbackResistance() {
        return 2;
    }
}
