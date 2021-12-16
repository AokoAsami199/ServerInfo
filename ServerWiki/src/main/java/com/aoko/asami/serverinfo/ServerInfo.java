package com.aoko.asami.serverinfo;

import com.aoko.asami.serverinfo.commands.*;
import org.bukkit.plugin.java.JavaPlugin;

public final class ServerInfo extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        this.getCommand("wiki").setExecutor(new wiki());
        this.getCommand("discord").setExecutor(new discord());
        this.getCommand("ip").setExecutor(new ip());
        this.getCommand("owner").setExecutor(new owner());
        this.getCommand("donate").setExecutor(new donate());
        this.getCommand("rule").setExecutor(new rules());
        this.getCommand("rules").setExecutor(new rules());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
