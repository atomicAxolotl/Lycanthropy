package net.fabricmc.lycanthropy.registry;

import net.fabricmc.lycanthropy.Lycanthropy;
import net.fabricmc.lycanthropy.blocks.WolfsbaneFlower;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

    public static final Block SILVER_ORE = new Block(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES,2).requiresTool().strength(3f, 10.0f).sounds(BlockSoundGroup.STONE));
    public static final Block WOLFSBANE = new WolfsbaneFlower(StatusEffects.POISON, AbstractBlock.Settings.of(Material.PLANT).noCollision().sounds(BlockSoundGroup.GRASS));

    public static void registerBlocks() {
        Registry.register(Registry.BLOCK, new Identifier(Lycanthropy.MOD_ID, "silver_ore"), SILVER_ORE);
        Registry.register(Registry.BLOCK, new Identifier(Lycanthropy.MOD_ID, "wolfsbane"), WOLFSBANE);
    }
}
