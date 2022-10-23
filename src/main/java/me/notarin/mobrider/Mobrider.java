package me.notarin.mobrider;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.bukkit.plugin.java.JavaPlugin;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("SpellCheckingInspection")
public final class Mobrider extends JavaPlugin {

    static final List<String> toggles = new ArrayList<>();

    @Override
    public void onEnable() {
        Bukkit.getPluginManager().registerEvents(new Events(), this);
        getServer().getConsoleSender().sendMessage("§5MOBRIDAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAH");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public static class Events implements Listener {
        @EventHandler
        public void onInteract(PlayerInteractEntityEvent e) {
            Player p = e.getPlayer();
            Entity en = e.getRightClicked();
            if(!(en instanceof ArmorStand) && !(en instanceof Player) && !(toggles.contains(String.valueOf(p)))) {
                en.addPassenger(p);
            }
        }
    }

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        Player p = (Player) sender;
        if (command.getName().equals("togglemobriding")) {
            if (!toggles.contains(String.valueOf(p))) {
                p.sendMessage(ChatColor.YELLOW + "Mobriding off");
                toggles.add(String.valueOf(p));
            } else {
                p.sendMessage(ChatColor.YELLOW + "Mobriding on");
                toggles.remove(String.valueOf(p));
            }
        }
        return false;
    }
}
