package com.yecraft.library.button;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public abstract class ItemButton implements Button{

    private final String name;
    private final ItemStack itemStack;
    private final Material material;

    public ItemButton(ItemStack itemStack) {
        this.itemStack = itemStack;
        this.name = itemStack.getItemMeta().getDisplayName();
        this.material = itemStack.getType();
    }

    @Override
    public boolean isPressed(String name, Material material) {
        return this.name.equalsIgnoreCase(name) & this.material.equals(material);
    }

    public String getName() {
        return name;
    }

    public ItemStack getItemStack() {
        return itemStack;
    }

    public Material getMaterial() {
        return material;
    }
}
