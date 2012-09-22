package com.github.ysl3000;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.entity.Player;

public class Questioner {

	public static void quest(Player player, String commandLabel, String[] args,
			Command cmd) {

		if (commandLabel.equalsIgnoreCase("answer") && player.hasPermission("sst.answer")) {
			if (args.length == 0) {
				player.sendMessage("Use /answer <answer>  to unlock your rights");
			} else if (args.length == 1) {

				if (args[0].equalsIgnoreCase(ConfigLoader.getAnswer())) {

					try {

						player.performCommand("manuadd " + player.getName()
								+ " " + ConfigLoader.getDGN());

						// manuadd ysl3000 Builder
						// Groupmanager

					} catch (Exception e) {

						player.performCommand("pex user " + player.getName()
								+ " group set " + ConfigLoader.getDGN());

						// pex user <user> group set <group>
						// Permissions EX

					}
				}
			}
		}

	}
	public static void ask(Player player){
		
		
		player.sendMessage(ChatColor.GREEN+"[Question]"+ChatColor.WHITE+ ConfigLoader.getQuestion());
	}
}