package me.notarin.mobrider;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

@SuppressWarnings("SpellCheckingInspection")
public final class Mobrider extends JavaPlugin {

    @Override
    public void onEnable() {
        Bukkit.getPluginManager().registerEvents(new Events(), this);
        getServer().getConsoleSender().sendMessage("§5MOBRIDAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAH");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public class Events implements Listener {
        @EventHandler
        public void onInteract(PlayerInteractEntityEvent e) {
            Player p = e.getPlayer();
            Entity en = e.getRightClicked();
            if(!(en instanceof ArmorStand) && !(en instanceof Player)) {
                en.addPassenger(p);
            }
        }
    }

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        Player p = (Player) sender;
        if (Objects.equals(command.toString(), "togglemobriding")) {
            p.sendMessage("test");
        }
        return false;
    }
}
