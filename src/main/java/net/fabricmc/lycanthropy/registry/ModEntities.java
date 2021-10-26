package net.fabricmc.lycanthropy.registry;


import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.lycanthropy.Lycanthropy;
import net.fabricmc.lycanthropy.entity.WerewolfEntity;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModEntities {

    public static final EntityType<WerewolfEntity> WEREWOLF = Registry.register(
            Registry.ENTITY_TYPE,
            new Identifier("lycanthropy", "werewolf"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE,
                    WerewolfEntity::new).dimensions(EntityDimensions.fixed(1.25f, 2.5f)).build()
    );
    public static final SpawnEggItem WEREWOLF_SPAWN_EGG = new SpawnEggItem(WEREWOLF, 8545340, 4139806, new FabricItemSettings().group(Lycanthropy.ITEM_GROUP).fireproof().maxCount(64));

    public static void registerEntities() {
        FabricDefaultAttributeRegistry.register(WEREWOLF, net.fabricmc.lycanthropy.entity.WerewolfEntity.createWerewolfAttributes());
        Registry.register(Registry.ITEM, new Identifier(Lycanthropy.MOD_ID, "werewolf_spawn_egg"), WEREWOLF_SPAWN_EGG);

    }
}
