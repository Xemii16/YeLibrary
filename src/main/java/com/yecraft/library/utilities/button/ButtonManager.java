package com.yecraft.library.utilities.button;

import com.yecraft.library.utilities.button.Button;
import com.yecraft.library.utilities.button.ItemButton;

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
