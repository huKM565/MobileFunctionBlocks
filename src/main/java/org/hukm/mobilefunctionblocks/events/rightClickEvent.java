package org.hukm.mobilefunctionblocks.mobilefunctionblock.events;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.hukm.mobilefunctionblock.functionItems.craftTable;
import org.hukm.mobilefunctionblock.functionItems.enderChest;
import org.hukm.mobilefunctionblock.functionItems.smithingTable;

public class rightClickEvent implements Listener {

    @EventHandler
    public void rightClick(PlayerInteractEvent event) {

        if(!event.hasItem()) return;
        if(!event.getAction().isRightClick()) return;

        Player player = event.getPlayer();
        ItemStack item = event.getItem();

        if(item == craftTable.getItem()) {
            player.openWorkbench(null, true);
        }else if(item == smithingTable.getItem()) {
            player.openSmithingTable(null, true);
        }else if(item == enderChest.getItem()) {
            player.openInventory(player.getEnderChest());
        }

    }
}
