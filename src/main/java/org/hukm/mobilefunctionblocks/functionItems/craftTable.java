package org.hukm.mobilefunctionblocks.mobilefunctionblock.functionItems;

import org.bukkit.inventory.ItemStack;
import org.hukm.mobilefunctionblock.utils.giveCustomClock;

public class craftTable {

    static ItemStack item = giveCustomClock.getItem(1001, "craftTable");

    public static ItemStack getItem() {
        return item;
    }

}
