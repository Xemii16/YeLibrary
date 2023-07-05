package com.yecraft.library;

import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;

import java.util.*;

public class Utils {

    public static boolean equals(@NotNull String first, String second){
        return first.equalsIgnoreCase(second);
    }

    public static @NotNull String getItemName(@NotNull ItemStack item){
        return Objects.requireNonNull(item.getItemMeta()).getDisplayName();
    }

    public static @NotNull UUID getUUID(String uuid){
        return UUID.fromString(uuid);
    }

    public static String uuidToString(@NotNull UUID uuid){
        return uuid.toString();
    }

    public static List<UUID> getUUIDsFromString(String uuids){
        StringTokenizer tokenizer = new StringTokenizer(uuids, " ");
        List<UUID> list = new ArrayList<>();
        while (tokenizer.hasMoreTokens()){
            list.add(UUID.fromString(tokenizer.nextToken()));
        }
        return list;
    }
}
