package fr.pearl.api.common.command;

import fr.pearl.api.common.PearlAPI;

import java.util.UUID;

public interface PearlSender {

    String getName();

    UUID getUniqueId();

    void sendMessage(String message);

    boolean hasPermission(String permission);

    org.bukkit.entity.Player getBukkitPlayer();

    net.md_5.bungee.api.connection.ProxiedPlayer getProxyPlayer();

    org.bukkit.command.CommandSender getBukkitSender();

    net.md_5.bungee.api.CommandSender getProxySender();
    
    default boolean isPlayer() {
        return PearlAPI.getInstance().isBungeeCord() ? this.getProxyPlayer() != null : this.getBukkitPlayer() != null;
    }
}
