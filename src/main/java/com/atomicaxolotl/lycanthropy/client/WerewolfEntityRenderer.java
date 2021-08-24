package com.atomicaxolotl.lycanthropy.client;

import com.atomicaxolotl.lycanthropy.entity.WerewolfEntity;
import com.atomicaxolotl.lycanthropy.entity.models.WerewolfModel;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;

public class WerewolfEntityRenderer extends MobEntityRenderer<WerewolfEntity, WerewolfModel> {

    public WerewolfEntityRenderer(EntityRenderDispatcher entityRenderDispatcher) {
        super(entityRenderDispatcher, new WerewolfModel(), 0.5f);
    }

    @Override
    public Identifier getTexture(WerewolfEntity entity) {
        return new Identifier("lycanthropy", "textures/entity/cube/cube.png");
    }
}