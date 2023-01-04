package net.mcreator.morphmod.procedures;

import net.mcreator.morphmod.MorphMod;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.client.gui.widget.Widget;


public class PlayerInfoProcedure {
  // This procedure will handle the process of updating the tab list and chat name when morphing into a player
  public static void updatePlayerMorph(Entity playerEntity) {
    // We will update the player's tab list name to match the name of the player they are morphing into
    MorphMod.setTabListName(playerEntity.getName());
    // We will also update the player's chat name to match the name of the player they are morphing into
    MorphMod.setChatName(playerEntity.getName());
    // When the player leaves the game, we will set the join game message to show that they have joined as the player they are morphing into
    MorphMod.onPlayerLeave(() -> MorphMod.setJoinGameMessage(playerEntity.getName() + " left the game"));
  }
}
