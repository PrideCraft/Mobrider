package me.notarin.mobrider;

import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEntityEvent;

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
