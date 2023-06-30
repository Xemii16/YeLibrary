package com.yecraft.library.utilities.registry;

import com.yecraft.library.utilities.registry.Registry;
import com.yecraft.library.utilities.command.BaseCommand;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CommandRegistry implements Registry {

    private List<BaseCommand> baseCommands;

    public CommandRegistry() {
        this.baseCommands = new ArrayList<>();
    }

    public void addCommands(BaseCommand... baseCommands){
        this.baseCommands.addAll(Arrays.asList(baseCommands));
    }

    @Override
    public void register() {
        this.baseCommands.forEach(baseCommand -> baseCommand.onCommand().register());
    }
}
