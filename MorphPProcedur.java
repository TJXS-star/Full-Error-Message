package net.mcreator.morphmod.procedures;

import java.util.List;
import net.mcreator.morphmod.MorphMod;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.client.gui.widget.Widget;


public class MorphPProcedure {
  // This procedure will handle the process of morphing into a specific entity
  public static void morphIntoEntity(String entityType) {
    // First, we check if the entity type is "player" or "mob"
    if (entityType.equals("player")) {
      // If it's a player, we will prompt the user to enter the name of the player they want to morph into
      String playerName = MorphMod.getInput("Enter the name of the player you want to morph into: ");
      // Then, we will retrieve the player entity with the specified name
      PlayerEntity playerEntity = MorphMod.getPlayerByName(playerName);
      // If the player entity is not found, we will display an error message
      if (playerEntity == null) {
        MorphMod.showError("Player not found");
        return;
      }
      // Otherwise, we will morph the player into the specified player entity
      MorphMod.morphPlayerIntoEntity(playerEntity);
      // We will also update the player's name tag to match the name of the player they are morphing into
      MorphMod.setPlayerNameTag(playerEntity.getName());
    } else if (entityType.equals("mob")) {
      // If it's a mob, we will prompt the user to enter the name of the mob they want to morph into
      String mobName = MorphMod.getInput("Enter the name of the mob you want to morph into: ");
      // Then, we will retrieve the mob entity with the specified name
      Entity mobEntity = MorphMod.getMobByName(mobName);
      // If the mob entity is not found, we will display an error message
      if (mobEntity == null) {
        MorphMod.showError("Mob not found");
        return;
      }
      // Otherwise, we will morph the player into the specified mob entity
      MorphMod.morphPlayerIntoEntity(mobEntity);
      // We will also hide the player's name tag while they are in mob form
      MorphMod.hidePlayerNameTag();
    }
  }
}
