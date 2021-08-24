package com.atomicaxolotl.lycanthropy.entity;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.world.World;


public class WerewolfEntity extends MobEntity {

        public WerewolfEntity(EntityType<?extends MobEntity>entityType, World world) {
                super(entityType, world);
        }
}
