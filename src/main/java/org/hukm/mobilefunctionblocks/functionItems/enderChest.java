package org.hukm.mobilefunctionblocks.functionItems;

import net.md_5.bungee.api.ChatColor;
import org.hukm.mobilefunctionblocks.utils.functionItem;

public class enderChest {

    static String type = "enderChest";
    static String name = ChatColor.BLUE + "Корманный эндер-сундук";
    static int customModelData = 1001;

    public static functionItem FunctionItem = new functionItem(customModelData, type, name);

}
