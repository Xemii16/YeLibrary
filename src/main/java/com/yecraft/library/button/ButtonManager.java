package com.yecraft.library.button;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ButtonManager {
    private final List<ItemButton> itemButtons;

    public ButtonManager() {
        this.itemButtons = new ArrayList<>();
    }

    public void addButtons(ItemButton... itemButtons){
       this.itemButtons.addAll(Arrays.asList(itemButtons));
    }

    public List<ItemButton> getButtonItems() {
        return itemButtons;
    }
}
