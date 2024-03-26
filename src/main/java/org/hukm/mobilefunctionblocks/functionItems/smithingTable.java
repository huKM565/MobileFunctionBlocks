package org.hukm.mobilefunctionblocks.functionItems;

import net.md_5.bungee.api.ChatColor;
import org.hukm.mobilefunctionblocks.utils.functionItem;

public class smithingTable {

    static String type = "smithingTable";
    static String name = ChatColor.GRAY + "Корманный стол кузнеца";
    static int customModelData = 1002;

    public static functionItem FunctionItem = new functionItem(customModelData, type, name);

}
