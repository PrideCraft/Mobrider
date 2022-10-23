package me.notarin.mobrider;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

@SuppressWarnings("SpellCheckingInspection")
public final class Mobrider extends JavaPlugin {

    @Override
    public void onEnable() {
        registerEvents();
        getServer().getConsoleSender().sendMessage("§5MOBRIDAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAH");
    }

    private void registerEvents() {
        Bukkit.getPluginManager().registerEvents(new Events(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
