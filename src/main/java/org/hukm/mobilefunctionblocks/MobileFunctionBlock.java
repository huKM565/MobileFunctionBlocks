package org.hukm.mobilefunctionblocks.mobilefunctionblock;

import org.bukkit.plugin.java.JavaPlugin;
import org.hukm.mobilefunctionblock.events.rightClickEvent;
import org.hukm.mobilefunctionblock.сommands.giveMobileItems;

public final class MobileFunctionBlock extends JavaPlugin {

    private static MobileFunctionBlock plugin;

    @Override
    public void onEnable() {

        plugin = this;

        getServer().getPluginManager().registerEvents(new rightClickEvent(), this);

        getCommand("giveitems").setExecutor(new giveMobileItems());

    }

    public static MobileFunctionBlock getInstance() {
        return plugin;
    }


}
