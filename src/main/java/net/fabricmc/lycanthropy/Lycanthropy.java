package net.fabricmc.lycanthropy;

import net.fabricmc.lycanthropy.registry.ModEffects;
import net.fabricmc.lycanthropy.registry.ModBlocks;
import net.fabricmc.lycanthropy.registry.ModEntities;
import net.fabricmc.lycanthropy.registry.ModItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class Lycanthropy implements ModInitializer {

	public static final String MOD_ID = "lycanthropy";

	public static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder.create(
			new Identifier(MOD_ID, "general"))
			.icon(() -> new ItemStack(ModItems.WOLFSBANE))
			.appendItems(stacks -> {
				stacks.add(new ItemStack(ModItems.WOLFSBANE));
				stacks.add(new ItemStack(ModItems.SILVER_ORE));
				stacks.add(new ItemStack(ModItems.SILVER_INGOT));
				stacks.add(new ItemStack(ModItems.SILVER_SWORD));
				stacks.add(new ItemStack(ModItems.SILVER_PICKAXE));
				stacks.add(new ItemStack(ModItems.SILVER_AXE));
				stacks.add(new ItemStack(ModItems.SILVER_SHOVEL));
				stacks.add(new ItemStack(ModItems.SILVER_HOE));
				stacks.add(new ItemStack(ModItems.SILVER_HELMET));
				stacks.add(new ItemStack(ModItems.SILVER_CHESTPLATE));
				stacks.add(new ItemStack(ModItems.SILVER_LEGGINGS));
				stacks.add(new ItemStack(ModItems.SILVER_BOOTS));
				stacks.add(new ItemStack(ModEntities.WEREWOLF_SPAWN_EGG));

			})
		.build();

	@Override
	public void onInitialize() {
		ModItems.registerItems();
		ModBlocks.registerBlocks();
		ModEffects.registerEffects();
		ModEntities.registerEntities();

	}
}
