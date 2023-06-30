package com.yecraft.library.utilities.config;

import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class DirectoryManager {

    private JavaPlugin plugin;
    private List<File> files;

    public DirectoryManager(JavaPlugin plugin) {
        this.plugin = plugin;
        if (!plugin.getDataFolder().exists()) plugin.getDataFolder().mkdir();
        this.files = new ArrayList<>();
    }

    public void addDirectory(String... directory){
        for (String file : directory){
            files.add(new File(plugin.getDataFolder(), file));
        }
    }

    public void init(){
        files.stream().filter(file -> !file.exists()).forEach(File::mkdir);
    }


}
