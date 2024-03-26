package org.hukm.mobilefunctionblocks.utils;

import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.persistence.PersistentDataType;
import org.hukm.mobilefunctionblocks.MobileFunctionBlock;

public class giveCustomClock {

    public static NamespacedKey typeKey = new NamespacedKey(MobileFunctionBlock.getInstance(), "typeMobileBlock");

    public static ItemStack getItem(int customModelData, String typeMobileBlock, String name) {

        ItemStack item = new ItemStack(Material.CLOCK);
        ItemMeta meta = item.getItemMeta();

        PersistentDataContainer container = meta.getPersistentDataContainer();
        container.set(typeKey, PersistentDataType.STRING, typeMobileBlock);

        meta.setDisplayName(name);
        meta.setCustomModelData(customModelData);

        item.setItemMeta(meta);

        return item;

    }

}
