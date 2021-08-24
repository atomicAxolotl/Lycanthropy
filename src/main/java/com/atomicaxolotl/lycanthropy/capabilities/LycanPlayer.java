package com.atomicaxolotl.lycanthropy.capabilities;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.MixinEnvironment;

public class LycanPlayer implements IWereCap {
    private boolean isTransformed;
    private boolean isWere;
    private int lycanType;
    private boolean isSprinting;
    private String getModelName;
    private String getTextureName;
    private int texture;
    private int model;

    public LycanPlayer() {
        this.isTransformed = false;
        this.isWere = false;
        this.lycanType = 0;
        this.isSprinting = false;
        this.getModelName = null;
        this.getTextureName = null;
        this.texture = 0;
        this.model = 0;

    }

    @Override
    public boolean isTransformed() {
        return false;
    }

    @Override
    public boolean isWere() {
        return false;
    }

    @Override
    public int lycanType() {
        return 0;
    }

    @Override
    public boolean isSprinting() {
        return false;
    }

    @Override
    public void getModel() {

    }

    @Override
    public void setModel(int p0, MixinEnvironment.Side p1, PlayerEntity p2) {

    }

    @Override
    public String getModelName() {
        return null;
    }

    @Override
    public void getTexture() {

    }

    @Override
    public void setTexture(int p0, MixinEnvironment.Side p1, PlayerEntity p2) {

    }

    @Override
    public String getTextureName() {
        return null;
    }

    @Override
    public float getModelHeight() {
        return 0;
    }

    @Override
    public void tryTransformed(PlayerEntity p0) {

    }

    @Override
    public void setTransformed(boolean p0, boolean p1, MixinEnvironment.Side p2, PlayerEntity p3) {

    }

    @Override
    public void setTransformedServer(boolean p0, PlayerEntity p1) {

    }
}
