package net.fabricmc.lycanthropy.entity;

import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.brain.Brain;
import net.minecraft.entity.ai.brain.MemoryModuleType;
import net.minecraft.entity.ai.brain.sensor.Sensor;
import net.minecraft.entity.ai.brain.sensor.SensorType;
import net.minecraft.entity.attribute.DefaultAttributeContainer.Builder;

import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.entity.mob.PiglinEntity;
import net.minecraft.world.World;



public class WerewolfEntity extends MobEntity {

        public WerewolfEntity(EntityType<? extends MobEntity>entityType, World world) {
                super(entityType, world);
        }

        protected static final ImmutableList<SensorType<? extends Sensor<? super WerewolfEntity>>> SENSOR_TYPES;
        protected static final ImmutableList<MemoryModuleType<?>> MEMORY_MODULE_TYPES;

        public static Builder createWerewolfAttributes() {
                return MobEntity.createMobAttributes()
                        .add(EntityAttributes.GENERIC_MAX_HEALTH, 30)
                        .add(EntityAttributes.GENERIC_FOLLOW_RANGE, 20)
                        .add(EntityAttributes.GENERIC_MOVEMENT_SPEED, 0.3499999940395355D)
                        .add(EntityAttributes.GENERIC_ATTACK_DAMAGE, 10)
                        .add(EntityAttributes.GENERIC_ARMOR, 10)
                        .add(EntityAttributes.GENERIC_KNOCKBACK_RESISTANCE, 5);

        }

        protected boolean isDisallowedInPeaceful() { return false; }

        protected Brain.Profile<WerewolfEntity> createBrainProfile() {
             return Brain.createProfile(MEMORY_MODULE_TYPES, SENSOR_TYPES);
        }

        protected Brain<?> deserializeBrain(Dynamic<?> dyanamic) {
                return WereBrain.create(this, this.createBrainProfile().deserialize(dyanamic));
        }

        public Brain<WerewolfEntity> getBrain() { return (Brain<WerewolfEntity>) super.getBrain(); }

        static {
                SENSOR_TYPES = ImmutableList.of(SensorType.NEAREST_LIVING_ENTITIES, SensorType.NEAREST_PLAYERS, SensorType.NEAREST_ITEMS, SensorType.HURT_BY, SensorType.PIGLIN_SPECIFIC_SENSOR);
                MEMORY_MODULE_TYPES = ImmutableList.of(MemoryModuleType.LOOK_TARGET, MemoryModuleType.DOORS_TO_CLOSE, MemoryModuleType.MOBS, MemoryModuleType.VISIBLE_MOBS, MemoryModuleType.NEAREST_VISIBLE_PLAYER, MemoryModuleType.NEAREST_VISIBLE_TARGETABLE_PLAYER, MemoryModuleType.HURT_BY, MemoryModuleType.HURT_BY_ENTITY, MemoryModuleType.WALK_TARGET, MemoryModuleType.CANT_REACH_WALK_TARGET_SINCE, MemoryModuleType.ATTACK_TARGET, MemoryModuleType.ATTACK_COOLING_DOWN, MemoryModuleType.INTERACTION_TARGET, MemoryModuleType.PATH, MemoryModuleType.ANGRY_AT, MemoryModuleType.UNIVERSAL_ANGER, MemoryModuleType.AVOID_TARGET, MemoryModuleType.HUNTED_RECENTLY, MemoryModuleType.ATE_RECENTLY, MemoryModuleType.NEAREST_REPELLENT);
        }
}
