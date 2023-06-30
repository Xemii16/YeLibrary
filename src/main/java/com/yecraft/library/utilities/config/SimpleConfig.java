package com.yecraft.library.utilities.config;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;
import java.io.IOException;

public abstract class SimpleConfig {

    private JavaPlugin plugin;
    private File file;
    private FileConfiguration configuration;

    public SimpleConfig(JavaPlugin plugin, String fileName) {
        this.plugin = plugin;
        this.file = new File(plugin.getDataFolder(), fileName);
    }
    public void setup() {
        if (!file.exists()){
            try {
                file.createNewFile();
                defaults();
                configuration.options().copyDefaults(true);
                save();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        configuration = YamlConfiguration.loadConfiguration(file);
    }

    public abstract void defaults();

    public FileConfiguration get(){
        return configuration;
    }

    public void save(){
        try{
            configuration.save(file);
        }catch (IOException e){
            System.out.println("Couldn't save file");
        }
    }

    public void reload(){
        configuration = YamlConfiguration.loadConfiguration(file);
    }
}
