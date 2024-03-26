package org.hukm.mobilefunctionblocks.functionItems;

import net.md_5.bungee.api.ChatColor;
import org.hukm.mobilefunctionblocks.utils.functionItem;

public class craftTable {

    static String type = "craftTable";
    static String name = ChatColor.YELLOW + "Корманный верстак";
    static int customModelData = 1000;

    public static functionItem FunctionItem = new functionItem(customModelData, type, name);

}
