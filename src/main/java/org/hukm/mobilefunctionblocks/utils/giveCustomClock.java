package org.hukm.mobilefunctionblocks.mobilefunctionblock.utils;

import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.persistence.PersistentDataType;
import org.hukm.mobilefunctionblock.MobileFunctionBlock;

public class giveCustomClock {

    public static ItemStack getItem(int CustomModelData, String typeMobileBlock) {

        ItemStack item = new ItemStack(Material.CLOCK);
        ItemMeta meta = item.getItemMeta();

        PersistentDataContainer container = meta.getPersistentDataContainer();
        NamespacedKey type = new NamespacedKey(MobileFunctionBlock.getInstance(), "typeMobileBlock");
        container.set(type, PersistentDataType.STRING, typeMobileBlock);

        meta.setCustomModelData(CustomModelData);

        item.setItemMeta(meta);

        return item;

    }

}
