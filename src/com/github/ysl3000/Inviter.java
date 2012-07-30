package com.github.ysl3000;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Inviter {

	
	public static void invite(CommandSender sender, String commandLabel, String[] args, Command cmd){
		
		if(commandLabel.equalsIgnoreCase("invite") && sender.hasPermission("sst.invite")){
			
			if(args.length == 0){
				sender.sendMessage("Use /invite <player>  to invite your friends! Please write the full name!");
			}else if(args.length == 1){
				Player p = (Player) sender;
				
				p.performCommand("whitelist add "+args[0]);
				p.sendMessage("You've invited "+ args[0]);
				
			}else if(args.length == 2){
				Player p = (Player) sender;
				
				p.performCommand("whitelist add "+args[0]);
				p.performCommand("whitelist add "+args[1]);
				p.sendMesage("You've invited "+args[0]+", "+args[1]);
				
			}
		}else if(commandLabel.equalsIgnoreCase("invite") && !sender.hasPermission("sst.invite")){
			sender.sendMessage("sst.invite");
		}
	}
}