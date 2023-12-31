package com.yecraft.library.spigot.item;

import com.yecraft.library.spigot.builder.ItemBuilder;
import com.yecraft.library.utilities.PlayerInventoryItem;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import java.util.Map;

public class ItemManager implements PlayerInventoryItem {
    private Map<Integer, ItemStack> items;

    public ItemManager() {
        this.items = Map.of(
                0, new ItemBuilder(Material.COMPASS).setName("Меню").create(),
                8, new ItemBuilder(Material.NETHER_STAR).setName("Про мене").create()
        );
    }

    @Override
    public void addItem(Player player) {
        items.forEach(player.getInventory()::setItem);
    }
}
