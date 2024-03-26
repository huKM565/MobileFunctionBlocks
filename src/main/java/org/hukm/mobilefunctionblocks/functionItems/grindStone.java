package org.hukm.mobilefunctionblocks.functionItems;

import net.md_5.bungee.api.ChatColor;
import org.hukm.mobilefunctionblocks.utils.functionItem;

public class grindStone {

    static String type = "cartographyTable";
    static String name = ChatColor.GRAY + "Корманное точило";
    static int customModelData = 1006;

    public static functionItem FunctionItem = new functionItem(customModelData, type, name);

}
