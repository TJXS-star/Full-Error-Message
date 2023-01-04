package net.mcreator.morphmod.procedures;

import java.util.ArrayList;
import java.util.List;

import net.mcreator.morphmod.MorphMod;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.client.gui.widget.Widget;


public class UnmorphPProcedure {
// This procedure will handle the process of reverting the player back to their original form
public static void revertPlayer() {
// We will retrieve the player's original entity data
Entity originalEntityData = MorphMod.getOriginalEntityData();
// Then, we will morph the player back into their original form
MorphMod.morphPlayerIntoEntity(originalEntityData);
// We will also show the player's name tag and reset their chat and tab list names to their original values
MorphMod.showPlayerNameTag();
MorphMod.setChatName(originalEntityData.getName());
MorphMod.setTabListName(originalEntityData.getName());
// Finally, we will reset the join game message to the default value
MorphMod.setJoinGameMessage("%player% joined the game");
}

// This function will return a list of all mobs in the game
public static List<String> getMobList() {
// We will create a list to store the mob names
List<String> mobList = new ArrayList<>();
// Then, we will loop through all of the available mob types
for (int i = 0; i < MorphMod.getMobTypes().size(); i++) {
// We will add the name of each mob type to the list
mobList.add(MorphMod.getMobTypes().get(i).getName());
}
// Finally, we will return the list of mob names
return mobList;
}

// This function will return a list of all players who have ever been on the server
public static List<String> getPlayerList() {
// We will create a list to store the player names
List<String> playerList = new ArrayList<>();
// Then, we will loop through all of the available player data entries
for (int i = 0; i < MorphMod.getPlayerData().size(); i++) {
// We will add the name of each player to the list
playerList.add(MorphMod.getPlayerData().get(i).getName());
}
// Finally, we will return the list of player names
return playerList;
}

static {
// We will create the morph GUI when the player joins the game
MorphMod.onPlayerJoin(() -> MorphUIProcedure.createMorphGUI());
// We will add a chat command that allows the player to revert back to their original form
MorphMod.registerChatCommand("revert", () -> UnmorphPProcedure.revertPlayer());
}
}
