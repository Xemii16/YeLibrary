package com.yecraft.library.spigot.event;

import com.yecraft.library.utilities.Registry;
import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class EventRegistry implements Registry {

    private List<Listener> events;
    private JavaPlugin plugin;
    private Logger logger;

    public EventRegistry(JavaPlugin plugin, Listener... events) {
        this.events = new ArrayList<>();
        this.plugin = plugin;
        this.logger = plugin.getLogger();
        this.events.addAll(List.of(events));
    }

    @Override
    public void register() {
        for (Listener event : this.events){
            Bukkit.getPluginManager().registerEvents(event, plugin);
        }
        logger.info(this.events.size() + " events initialization");
    }
}
