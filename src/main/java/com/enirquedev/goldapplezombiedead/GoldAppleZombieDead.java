package com.enirquedev.goldapplezombiedead;

import com.enirquedev.goldapplezombiedead.listeners.ZombieDeadListener;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Logger;

public final class GoldAppleZombieDead extends JavaPlugin {

    @Override
    public void onEnable() {
        Logger logger = this.getLogger();
        logger.info("Esooo Tilin, vamos Tilin");
        getServer().getPluginManager().registerEvents(new ZombieDeadListener(), this);
    }

    @Override
    public void onDisable() {
        Logger logger = this.getLogger();
        logger.info("Tilin nooooo");
    }
}
