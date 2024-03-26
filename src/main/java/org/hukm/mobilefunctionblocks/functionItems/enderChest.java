package org.hukm.mobilefunctionblocks.mobilefunctionblock.functionItems;

import org.bukkit.inventory.ItemStack;
import org.hukm.mobilefunctionblock.utils.giveCustomClock;

public class enderChest {

    static ItemStack item = giveCustomClock.getItem(1000, "enderChest");

    public static ItemStack getItem() {
        return item;
    }
}
