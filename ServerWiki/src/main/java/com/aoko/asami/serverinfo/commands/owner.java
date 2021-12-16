package com.aoko.asami.serverinfo.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.jetbrains.annotations.NotNull;

public class owner implements CommandExecutor{

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {

        sender.sendMessage("---------------------------");
        sender.sendMessage(ChatColor.RED + "Owner: AokoAsami199");
        sender.sendMessage("---------------------------");
        return true;
    }
}
