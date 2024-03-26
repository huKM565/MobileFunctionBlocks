package org.hukm.mobilefunctionblocks.mobilefunctionblock.functionItems;

import org.bukkit.inventory.ItemStack;
import org.hukm.mobilefunctionblock.utils.giveCustomClock;

public class smithingTable {

    static ItemStack item = giveCustomClock.getItem(1002, "smithingTable");

    public static ItemStack getItem() {
        return item;
    }
    
}
