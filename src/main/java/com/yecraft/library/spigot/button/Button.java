package com.yecraft.library.spigot.button;

import org.bukkit.Material;
import org.bukkit.entity.Player;

public interface Button {

    void afterPressed(Player player);

    boolean isPressed(String name, Material material);
}
