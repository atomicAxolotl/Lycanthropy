package net.fabricmc.lycanthropy.client;

import net.fabricmc.lycanthropy.registry.ModEntities;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendereregistry.v1.EntityRendererRegistry;

@Environment(EnvType.CLIENT)
public class LycanClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {

        EntityRendererRegistry.INSTANCE.register(ModEntities.WEREWOLF, (dispatcher, context) ->  new WerewolfEntityRenderer(dispatcher));
    }
}