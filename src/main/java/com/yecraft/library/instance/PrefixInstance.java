package com.yecraft.library.instance;

import net.md_5.bungee.api.ChatColor;

public class PrefixInstance {

    private final String prefix;
    private final ChatColor color;

    public PrefixInstance(ChatColor color, String prefix) {
        this.prefix = prefix;
        this.color = color;
    }

    public String instance(){
        return color + prefix;
    }
}
