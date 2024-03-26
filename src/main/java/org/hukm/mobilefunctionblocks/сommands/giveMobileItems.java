package org.hukm.mobilefunctionblocks.сommands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.hukm.api.Api;
import org.hukm.mobilefunctionblocks.functionItems.craftTable;
import org.hukm.mobilefunctionblocks.functionItems.enderChest;
import org.hukm.mobilefunctionblocks.functionItems.smithingTable;
import org.jetbrains.annotations.NotNull;

public class giveMobileItems implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, @NotNull String s, @NotNull String[] strings) {

        if(commandSender instanceof Player) {

            Player player = (Player) commandSender;

            Api.giveItem(craftTable.FunctionItem.getItem(), player);
            Api.giveItem(enderChest.FunctionItem.getItem(), player);
            Api.giveItem(smithingTable.FunctionItem.getItem(), player);

        }

        return true;
    }
}
