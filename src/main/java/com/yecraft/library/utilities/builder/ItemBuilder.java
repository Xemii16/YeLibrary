package com.yecraft.library.utilities.builder;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class ItemBuilder {

    private ItemStack item;
    private ItemMeta meta;

    public ItemBuilder(ItemStack item) {
        this.item = item;
        this.meta = item.getItemMeta();
    }

    public ItemBuilder(Material material) {
        this.item = new ItemStack(material);
        this.meta = item.getItemMeta();
    }

    public ItemStack create(){
        this.item.setItemMeta(meta);
        return this.item;
    }

    public ItemBuilder setName(String name){
        meta.setDisplayName(name);
        return this;
    }

    public ItemBuilder appendLore(String lore){
        meta.getLore().add(lore);
        return this;
    }

    public ItemBuilder setLore(String... lore){
        for (String text : lore) {
            appendLore(text);
        }
        return this;
    }
}
