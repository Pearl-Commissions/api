package fr.pearl.api.spigot.packet;

import org.bukkit.entity.Player;

public interface PacketHandler {

    void outboundPacket(Player player, Object packet);

    void inboundPacket(Player player, Object packet);
}
