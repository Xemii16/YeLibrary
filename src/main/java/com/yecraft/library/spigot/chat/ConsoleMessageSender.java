package com.yecraft.library.spigot.chat;

import net.md_5.bungee.api.ChatColor;

import java.util.logging.Logger;

public class ConsoleMessageSender {

    private final Logger logger;

    public ConsoleMessageSender(Logger logger) {
        this.logger = logger;
    }

    public void info(String message){
        logger.info(ChatColor.of("#0099ff") + message);
    }

    public void warning(String message){
        logger.info(ChatColor.of("#ff6600") + message);
    }

    public void error(String message){
        logger.info(ChatColor.of("#ff0000") + message);
    }
}
