package com.github.ysl3000;

import java.util.ArrayList;
import java.util.HashMap;
import org.bukkit.Location;
import org.bukkit.entity.Player;

public class HashmapHandler {
	private static ArrayList<Player> Ap;
	private static ArrayList<Player> isMod;
	private static HashMap<Player, Location> LastL;
	private static HashMap<Player, Location> currentL = new HashMap<Player, Location>();
	private static HashMap<Player, Boolean> isGod = new HashMap<Player, Boolean>();
	private static HashMap<Player, Boolean> isFly = new HashMap<Player, Boolean>();
	private static HashMap<Player, Boolean> isHidden = new HashMap<Player, Boolean>();
	private static HashMap<String, String> Channel = new HashMap<String, String>();

	public HashmapHandler(SmartServerTool plugin) {
		Ap = new ArrayList<Player>();
		isMod = new ArrayList<Player>();
		LastL = new HashMap<Player, Location>();
		currentL = new HashMap<Player, Location>();
		isGod = new HashMap<Player, Boolean>();
		isFly = new HashMap<Player, Boolean>();
		isHidden = new HashMap<Player, Boolean>();
		Channel = new HashMap<String, String>();
	}

	public static boolean isInArray(Player p) {
		return Ap.contains(p);
	}

	public static void addPlayerToAp(Player p) {
		Ap.add(p);
	}

	public static void removePlayerFromAp(Player p) {
		Ap.remove(p);
	}

	public static boolean getIsMod(Player p) {
		return isMod.contains(p);
	}

	public static void setIsMOD(Player p) {
		isMod.add(p);
	}

	public static void removeIsMOD(Player p) {
		isMod.remove(p);
	}

	public static void removePlayerMOD(Player p) {
		isMod.remove(p);
	}

	public static Location getLastLocation(Player p) {
		return LastL.get(p);
	}

	public static void setLastLocation(Player p, Location last) {
		LastL.put(p, last);
	}

	public static Location getCurrentLocation(Player p) {
		return currentL.get(p);
	}

	public static void setCurrentLocation(Player p, Location current) {
		currentL.put(p, current);
	}

	public static boolean isGod(Player p) {
		return isGod.get(p);
	}

	public static void setGod(Player p, boolean god) {
		isGod.put(p, god);
	}

	public static boolean isFlyStatus(Player p) {
		return isFly.containsKey(p);
	}

	public static void setFlyStatus(Player p, boolean fly) {
		isFly.put(p, fly);
	}

	public static boolean isHiddenStatus(Player p) {
		return isHidden.containsKey(p);
	}

	public static void setHiddenStatus(Player p, boolean hidden) {
		isHidden.put(p, hidden);
	}

	public static String getChannel(String name) {
		return HashmapHandler.Channel.get(name);
	}

	public static void setChannel(String name, String Channel) {
		HashmapHandler.Channel.put(name, Channel);

	}
}
