package com.aoko.asami.serverinfo.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.jetbrains.annotations.NotNull;

public class donate implements CommandExecutor{

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {

        sender.sendMessage("---------------------------");
        sender.sendMessage("Donation Methods:");
        sender.sendMessage(" ");
        sender.sendMessage(ChatColor.AQUA + "PayPal" + ChatColor.WHITE + " (Preferred): https://paypal.com/aokoasami199");
        sender.sendMessage(ChatColor.AQUA + "PlayerDuo" + ChatColor.WHITE + " (Vietnamese): https://playerduo.com/aokoasami199");
        sender.sendMessage(ChatColor.AQUA + "Bank" + ChatColor.WHITE + " (Vietnamese): ");
        sender.sendMessage(ChatColor.AQUA + "TSR" + ChatColor.WHITE + " (Vietnamese): 0946933282 - Nguyễn Hùng Anh");
        sender.sendMessage(ChatColor.AQUA + "Card" + ChatColor.WHITE + " (Server): /napthe");
        sender.sendMessage("---------------------------");
        return true;
    }
}
