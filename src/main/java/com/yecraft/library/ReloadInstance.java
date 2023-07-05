package com.yecraft.library;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReloadInstance implements Reload {

    private List<Reload> reloadList;

    public ReloadInstance() {
        this.reloadList = new ArrayList<>();
    }

    @Override
    public void reload() {
        reloadList.forEach(Reload::reload);
    }

    public void addReloads(Reload... reloads){
        this.reloadList.addAll(Arrays.asList(reloads));
    }
}
