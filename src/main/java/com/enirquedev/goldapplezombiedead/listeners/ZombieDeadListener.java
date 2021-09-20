package com.enirquedev.goldapplezombiedead.listeners;

import org.bukkit.Material;
import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.inventory.ItemStack;

public class ZombieDeadListener implements Listener {
    @EventHandler
    public void onZombieDeath(EntityDeathEvent edv){
        if(edv.getEntity().getType() == EntityType.ZOMBIE_VILLAGER
        || edv.getEntity().getType() == EntityType.ZOMBIE){
            edv.getDrops().add(new ItemStack(Material.GOLDEN_APPLE, 1));
        }
    }
}
