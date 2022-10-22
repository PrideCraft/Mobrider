package me.notarin.mobrider;

import org.bukkit.plugin.java.JavaPlugin;

@SuppressWarnings("SpellCheckingInspection")
public final class Mobrider extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getConsoleSender().sendMessage("§5MOBRIDAAAAAH");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
