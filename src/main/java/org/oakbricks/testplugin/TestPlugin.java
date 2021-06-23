package org.oakbricks.testplugin;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

public final class TestPlugin extends JavaPlugin {

    //config related shit
    JavaPlugin plugin;
    FileConfiguration config = plugin.getConfig();

    @Override
    public void onEnable() {
        // Plugin startup logic
        this.saveDefaultConfig();
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
