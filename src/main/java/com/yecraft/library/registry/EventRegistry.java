package com.yecraft.library.registry;

import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class EventRegistry {

    private List<Listener> events;
    private JavaPlugin plugin;
    private Logger logger;

    public EventRegistry(JavaPlugin plugin) {
        this.events = new ArrayList<>();
        this.plugin = plugin;
        this.logger = plugin.getLogger();
    }

    public void addEvents(Listener... events){
        this.events.addAll(List.of(events));
    }

    public void initEvents(){
        for (Listener event : this.events){
            Bukkit.getPluginManager().registerEvents(event, plugin);
        }
        logger.info(this.events.size() + " events initialization");
    }


}
