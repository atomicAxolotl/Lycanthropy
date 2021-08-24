package com.atomicaxolotl.lycanthropy.client;

import com.atomicaxolotl.lycanthropy.Lycanthropy;
import com.atomicaxolotl.lycanthropy.capabilities.LycanPlayer;
import com.atomicaxolotl.lycanthropy.registry.ModEntities;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendereregistry.v1.EntityRendererRegistry;
import net.minecraft.client.render.entity.EntityRenderer;

@Environment(EnvType.CLIENT)
public class LycanClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        /*
         * Registers our Cube Entity's renderer, which provides a model and texture for the entity.
         *
         * Entity Renderers can also manipulate the model before it renders based on entity context (EndermanEntityRenderer#render).
         */
        EntityRendererRegistry.INSTANCE.register(ModEntities.WEREWOLF, (dispatcher, context) -> {
            return new WerewolfEntityRenderer(dispatcher);
        });
    }
}