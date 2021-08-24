package com.atomicaxolotl.lycanthropy.registry;

import com.atomicaxolotl.lycanthropy.entity.effect.CurseEffect;
import net.minecraft.entity.effect.StatusEffectType;
import net.minecraft.util.registry.Registry;

public class ModEffects {

    public static final CurseEffect BEAST_CURSE = new CurseEffect(StatusEffectType.NEUTRAL, 000000);

    public static void registerEffects() {
        Registry.register(Registry.STATUS_EFFECT,666, "beast_curse", BEAST_CURSE);
    }
}
