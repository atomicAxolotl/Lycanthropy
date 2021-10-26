package net.fabricmc.lycanthropy.entity.effect;

import net.fabricmc.lycanthropy.registry.ModEffects;
import com.google.common.collect.Maps;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.AttributeContainer;
import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.entity.attribute.EntityAttributeInstance;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectType;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;

import java.util.Iterator;
import java.util.Map;
import java.util.UUID;

public class CurseEffect extends StatusEffect {
    private final Map<EntityAttribute, EntityAttributeModifier> attributeModifiers = Maps.newHashMap();
    public CurseEffect(StatusEffectType type, int color) {
        super(type, color);
    }

    public void applyUpdateEffect(LivingEntity entity, int amplifier) {
        if (this == ModEffects.BEAST_CURSE) {
            if (entity.getHealth() > 1.0F) {
                entity.damage(DamageSource.MAGIC, 1.0F);
            }

        } else {
            entity.heal((float) Math.max(4 << amplifier, 0));
        }

    }
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        int k;
        if (this == ModEffects.BEAST_CURSE) {
            k = 50 >> amplifier;
            if (k > 0) {
                return duration % k == 0;
            } else {
                return true;
            }
        } else {
            return this == StatusEffects.HUNGER;
        }
    }
   public StatusEffect addAttributeModifier(EntityAttribute attribute, String uuid, double amount, EntityAttributeModifier.Operation operation) {
    EntityAttributeModifier entityAttributeModifier = new EntityAttributeModifier(UUID.fromString(uuid), this::getTranslationKey, amount, operation);
    this.attributeModifiers.put(attribute, entityAttributeModifier);
    return this;
}

    @Environment(EnvType.CLIENT)
    public Map<EntityAttribute, EntityAttributeModifier> getAttributeModifiers() {
        return this.attributeModifiers;
    }

    public void onRemoved(PlayerEntity entity, AttributeContainer attributes, int amplifier) {
        Iterator var4 = this.attributeModifiers.entrySet().iterator();

        while(var4.hasNext()) {
            Map.Entry<EntityAttribute, EntityAttributeModifier> entry = (Map.Entry)var4.next();
            EntityAttributeInstance entityAttributeInstance = attributes.getCustomInstance((EntityAttribute)entry.getKey());
            if (entityAttributeInstance != null) {
                entityAttributeInstance.removeModifier((EntityAttributeModifier)entry.getValue());
            }
        }

    }
}