package com.atomicaxolotl.lycanthropy;

import com.atomicaxolotl.lycanthropy.registry.ModBlocks;
import com.atomicaxolotl.lycanthropy.registry.ModItems;
import net.fabricmc.api.ModInitializer;

public class Lycanthropy implements ModInitializer {

	public static final String MOD_ID = "lycanthropy";

	@Override
	public void onInitialize() {
		ModItems.registerItems();
		ModBlocks.registerBlocks();

	}
}
