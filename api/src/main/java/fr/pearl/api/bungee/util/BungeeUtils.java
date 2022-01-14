package fr.pearl.api.bungee.util;

import net.md_5.bungee.BungeeCord;
import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.chat.BaseComponent;
import net.md_5.bungee.api.chat.ComponentBuilder;
import net.md_5.bungee.api.chat.TextComponent;
import net.md_5.bungee.api.connection.ProxiedPlayer;

import java.util.List;
import java.util.function.Predicate;

public class BungeeUtils {

    public static String getIp(String ip) {
        return ip.replace("/", "").split(":")[0];
    }

    public static void sendMessage(CommandSender sender, String message) {
        BaseComponent[] components = TextComponent.fromLegacyText(message);
        sender.sendMessage(components);
    }

    public static void sendMessage(CommandSender sender, List<String> messages) {
        for (String message : messages) {
            sendMessage(sender, message);
        }
    }

    public static void sendMessage(CommandSender sender, String... messages) {
        for (String message : messages) {
            sendMessage(sender, message);
        }
    }

    public static void kickPlayer(ProxiedPlayer player, String message) {
        player.disconnect(new TextComponent(message));
    }

    public static void log(String message, String permission) {
        broadcast(message, player -> player.hasPermission(permission));
    }

    public static void log(CommandSender sender, String message, String permission) {
        broadcast(message, player -> !player.equals(sender) && player.hasPermission(permission));
    }

    public static void broadcast(List<String> messages) {
        for (String message : messages) {
            broadcast(message, null);
        }
    }

    public static void broadcast(String message, Predicate<ProxiedPlayer> predicate) {
        BaseComponent[] components = TextComponent.fromLegacyText(message);
        for (ProxiedPlayer player : BungeeCord.getInstance().getPlayers()) {
            if (predicate == null || predicate.test(player)) {
                player.sendMessage(components);
            }
        }

        sendMessage(BungeeCord.getInstance().getConsole(), message);
    }

    public static void kickPlayer(ProxiedPlayer player, List<String> messages) {
        TextComponent[] components = new TextComponent[messages.size()];
        for (int i = 0; i < messages.size(); i++) {
            components[i] = new TextComponent(messages.get(i) + "\n");
        }
        player.disconnect(components);
    }
}