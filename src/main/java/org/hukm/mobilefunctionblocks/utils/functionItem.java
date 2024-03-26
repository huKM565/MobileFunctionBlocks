package org.hukm.mobilefunctionblocks.functionItems;

import org.bukkit.inventory.ItemStack;
import org.hukm.mobilefunctionblocks.utils.giveCustomClock;

public class functionItem {

    private final ItemStack item;
    private final int customModelData;
    private final String type;

    public functionItem(int customModelData, String type, String name) {

        this.item = giveCustomClock.getItem(customModelData, type, name);
        this.customModelData = customModelData;
        this.type = type;

    }

    public final ItemStack getItem() {
        return item;
    }

    public final String getType() {
        return type;
    }

    public final int getCustomModelData() {
        return customModelData;
    }

}
