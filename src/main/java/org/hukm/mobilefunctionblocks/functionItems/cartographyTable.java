package org.hukm.mobilefunctionblocks.functionItems;

import net.md_5.bungee.api.ChatColor;
import org.hukm.mobilefunctionblocks.utils.functionItem;

public class cartographyTable {

    static String type = "cartographyTable";
    static String name = ChatColor.DARK_AQUA + "Корманный стол картографа";
    static int customModelData = 1005;

    public static functionItem FunctionItem = new functionItem(customModelData, type, name);

}
