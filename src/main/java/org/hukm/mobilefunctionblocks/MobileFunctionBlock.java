package org.hukm.mobilefunctionblocks;

import org.bukkit.plugin.java.JavaPlugin;
import org.hukm.mobilefunctionblocks.events.rightClickEvent;
import org.hukm.mobilefunctionblocks.сommands.giveMobileItems;

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
