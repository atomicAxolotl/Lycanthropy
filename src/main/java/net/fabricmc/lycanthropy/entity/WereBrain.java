package net.fabricmc.lycanthropy.entity;
//a class dedicated to assigning tasks ig


import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.brain.Activity;
import net.minecraft.entity.ai.brain.Brain;
import net.minecraft.entity.ai.brain.task.FindInteractionTargetTask;
import net.minecraft.entity.ai.brain.task.ForgetAngryAtTargetTask;
import net.minecraft.entity.ai.brain.task.LookAroundTask;
import net.minecraft.entity.ai.brain.task.WanderAroundTask;

public class WereBrain {

    protected static Brain<?> create(WerewolfEntity werewolf, Brain<WerewolfEntity> brain) {
        addCoreActivities(brain);
        addIdleActivities(brain);
        brain.setCoreActivities(ImmutableSet.of(Activity.CORE));
        brain.setDefaultActivity(Activity.IDLE);
        return brain;
    }


    private static void addCoreActivities(Brain<WerewolfEntity> werewolf) {
        werewolf.setTaskList(Activity.CORE, 0, ImmutableList.of(new WanderAroundTask(), new LookAroundTask(40, 100), new ForgetAngryAtTargetTask<>()));
    }

    private static void addIdleActivities(Brain<WerewolfEntity> werewolf) {
        werewolf.setTaskList(Activity.IDLE, 15, ImmutableList.of(new FindInteractionTargetTask(EntityType.PLAYER, 4)));
    }
}
