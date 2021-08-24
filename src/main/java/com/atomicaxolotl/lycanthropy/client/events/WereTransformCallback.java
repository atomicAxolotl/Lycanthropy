package com.atomicaxolotl.lycanthropy.client.events;

import net.fabricmc.fabric.api.event.Event;
import net.fabricmc.fabric.api.event.EventFactory;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.ActionResult;

public interface WereTransformCallback {
    Event<WereTransformCallback> EVENT = EventFactory.createArrayBacked(WereTransformCallback.class,
            (listeners) -> (player) -> {
                for (WereTransformCallback listener : listeners) {
                    ActionResult result = listener.interact(player);

                    if (result != ActionResult.PASS) {
                        return result;
                    }
                }
                return ActionResult.PASS;
            });
    ActionResult interact(PlayerEntity player);
}
