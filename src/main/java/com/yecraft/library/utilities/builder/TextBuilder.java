package com.yecraft.library.utilities.builder;

import net.md_5.bungee.api.ChatColor;

public class TextBuilder {

    private String prefix;
    private String text;
    private boolean havePrefix;
    private ChatColor color;

    public TextBuilder(String text) {
        this.prefix = "";
        this.text = text;
        this.havePrefix = false;
        this.color = ChatColor.WHITE;
    }

    public TextBuilder withPrefix(String prefix){
        this.prefix = prefix;
        this.havePrefix = true;
        return this;
    }

    public TextBuilder withTextColor(String hex){
        this.color = ChatColor.of(hex);
        return this;
    }
    public String build(){
        if (havePrefix){
            return prefix + " " + color + text;
        }
        return color + text;
    }

}
