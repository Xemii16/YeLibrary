package com.yecraft.library.spigot.command;

import com.yecraft.library.utilities.Registry;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CommandRegistry implements Registry {

    private List<BaseCommand> baseCommands;

    public CommandRegistry(BaseCommand... commands) {
        this.baseCommands = new ArrayList<>();
        this.baseCommands.addAll(Arrays.asList(commands));
    }

    @Override
    public void register() {
        this.baseCommands.forEach(baseCommand -> baseCommand.command().register());
    }
}
