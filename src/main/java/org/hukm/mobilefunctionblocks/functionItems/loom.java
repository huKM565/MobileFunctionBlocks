package org.hukm.mobilefunctionblocks.functionItems;

import net.md_5.bungee.api.ChatColor;
import org.hukm.mobilefunctionblocks.utils.functionItem;

public class loom {

    static String type = "loom";
    static String name = ChatColor.WHITE + "Корманный ткацкий станок";
    static int customModelData = 1003;

    public static functionItem FunctionItem = new functionItem(customModelData, type, name);

}
