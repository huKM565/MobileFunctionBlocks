package org.hukm.mobilefunctionblocks.functionItems;

import net.md_5.bungee.api.ChatColor;
import org.hukm.mobilefunctionblocks.utils.functionItem;

public class anvil {

    static String type = "anvil";
    static String name = ChatColor.BLACK + "Корманная наковальня";
    static int customModelData = 1004;

    public static functionItem FunctionItem = new functionItem(customModelData, type, name);

}
