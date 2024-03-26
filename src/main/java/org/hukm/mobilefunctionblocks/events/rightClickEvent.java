package org.hukm.mobilefunctionblocks.events;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.persistence.PersistentDataType;
import org.hukm.mobilefunctionblocks.functionItems.*;
import org.hukm.mobilefunctionblocks.utils.giveCustomClock;

public class rightClickEvent implements Listener {

    @EventHandler
    public void rightClick(PlayerInteractEvent event) {

        if(!event.hasItem()) return;
        if(!event.getAction().isRightClick()) return;

        Player player = event.getPlayer();

        ItemStack item = event.getItem();
        ItemMeta meta = item.getItemMeta();

        String craftTableTypeName = craftTable.FunctionItem.getType();
        String enderChestTypeName = enderChest.FunctionItem.getType();
        String smithingTableTypeName = smithingTable.FunctionItem.getType();
        String loomTypeName = loom.FunctionItem.getType();
        String anvilTypeName = anvil.FunctionItem.getType();
        String cartographyTableTypeName = cartographyTable.FunctionItem.getType();
        String grindStoneTypeName = grindStone.FunctionItem.getType();
        String stoneCutterTypeName = stoneCutter.FunctionItem.getType();

        try{

            PersistentDataContainer container = meta.getPersistentDataContainer();
            String typeName = container.get(giveCustomClock.typeKey, PersistentDataType.STRING);

            if(typeName.equals(craftTableTypeName)) {
                player.openWorkbench(null, true);
            }else if(typeName.equals(enderChestTypeName)) {
                player.openInventory(player.getEnderChest());
            }else if(typeName.equals(smithingTableTypeName)) {
                player.openSmithingTable(null, true);
            }else if(typeName.equals(loomTypeName)) {
                player.openLoom(null, true);
            }else if(typeName.equals(anvilTypeName)) {
                player.openAnvil(null, true);
            }else if(typeName.equals(cartographyTableTypeName)) {
                player.openCartographyTable(null, true);
            }else if(typeName.equals(grindStoneTypeName)) {
                player.openGrindstone(null, true);
            }else if(typeName.equals(stoneCutterTypeName)) {
                player.openStonecutter(null, true);
            }
        }catch (NullPointerException ignore){}

    }
}
