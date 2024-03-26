package org.hukm.mobilefunctionblocks.functionItems;

import net.md_5.bungee.api.ChatColor;
import org.hukm.mobilefunctionblocks.utils.functionItem;

public class stoneCutter {

    static String type = "anvil";
    static String name = ChatColor.GRAY + "Корманный камнерез";
    static int customModelData = 1007;

    public static functionItem FunctionItem = new functionItem(customModelData, type, name);

}
