package net.fabricmc.lycanthropy.client;

import net.fabricmc.lycanthropy.entity.WerewolfEntity;
import net.fabricmc.lycanthropy.entity.models.WerewolfModel;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;

public class WerewolfEntityRenderer extends MobEntityRenderer<WerewolfEntity, WerewolfModel> {

    public WerewolfEntityRenderer(EntityRenderDispatcher entityRenderDispatcher) {
        super(entityRenderDispatcher, new WerewolfModel(), 0.5f);
    }

    @Override
    public Identifier getTexture(WerewolfEntity entity) {
        return new Identifier("lycanthropy", "textures/entity/werewolf/werewoof.png");
    }

    protected void scale(WerewolfEntity werewolfEntity, MatrixStack matrixStack, float f) {
        matrixStack.scale(0.77F, 0.77F, 0.77F);
        super.scale(werewolfEntity, matrixStack, f);
    }
}