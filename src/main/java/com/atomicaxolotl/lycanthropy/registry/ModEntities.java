package com.atomicaxolotl.lycanthropy.registry;


import com.atomicaxolotl.lycanthropy.entity.WerewolfEntity;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModEntities implements ModInitializer {

    public static final EntityType<WerewolfEntity> WEREWOLF = Registry.register(
            Registry.ENTITY_TYPE,
            new Identifier("lycanthropy", "werewolf"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, WerewolfEntity::new).dimensions(EntityDimensions.fixed(0.75f, 0.75f)).build()
    );


    @Override
    public void onInitialize() {
        FabricDefaultAttributeRegistry.register(WEREWOLF, WerewolfEntity.createMobAttributes());

    }
}
