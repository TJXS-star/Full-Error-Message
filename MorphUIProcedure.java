package net.mcreator.morphmod.procedures;

import net.mcreator.morphmod.MorphMod;
import net.minecraft.client.gui.widget.Widget;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;


public class MorphUIProcedure {
  // This procedure will handle the process of creating the morph GUI
  public static void createMorphGUI() {
    // First, we create the "Morphs" button and add it to the health bar GUI
    Widget morphsButton = MorphMod.createButton("Morphs", "blue");
    MorphMod.addToHealthBarGUI(morphsButton);
    // When the "Morphs" button is clicked, we will show the "Players" and "Mobs" buttons
    morphsButton.onPress = () -> {
      Widget playersButton = MorphMod.createButton("Players", "blue");
      Widget mobsButton = MorphMod.createButton("Mobs", "blue");
      MorphMod.addToHealthBarGUI(playersButton);
      MorphMod.addToHealthBarGUI(mobsButton);
      // When the "Players" button is clicked, we will morph the player into a player
      playersButton.onPress = () -> MorphPProcedure.morphIntoEntity("player");
      // When the "Mobs" button is clicked, we will morph the player into a mob
      mobsButton.onPress = () -> MorphPProcedure.morphIntoEntity("mob");
    };
  }
}
