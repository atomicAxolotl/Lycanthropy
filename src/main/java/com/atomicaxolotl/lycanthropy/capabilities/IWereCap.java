package com.atomicaxolotl.lycanthropy.capabilities;

import net.minecraft.entity.player.PlayerEntity;
import org.spongepowered.asm.mixin.MixinEnvironment;

public interface IWereCap {
    boolean isTransformed();
    boolean isWere();
    int lycanType();
    boolean isSprinting();
    void getModel();
    void setModel(final int p0, final MixinEnvironment.Side p1, final PlayerEntity p2);
    String getModelName();
    void getTexture();
    void setTexture(final int p0, final MixinEnvironment.Side p1, final PlayerEntity p2);
    String getTextureName();
    float getModelHeight();
    void tryTransformed(final PlayerEntity p0);
    void setTransformed(final boolean p0, final boolean p1, final MixinEnvironment.Side p2, final PlayerEntity p3);
    void setTransformedServer(final boolean p0, final PlayerEntity p1);


}
