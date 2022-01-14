package fr.pearl.api.spigot.packet;

import fr.pearl.api.spigot.PearlSpigot;
import org.bukkit.entity.Player;

import java.util.Collection;

public interface PacketServer {

    Object getPacket();

    Class<?> packetClass();

    default void send(Player player) {
        PearlSpigot.getInstance().getNmsManager().getNms().sendPacket(player, this.getPacket());
    }

    default void send(Collection<? extends Player> players) {
        Object packet = this.getPacket();
        for (Player player : players) {
            PearlSpigot.getInstance().getNmsManager().getNms().sendPacket(player, packet);
        }
    }

    default void setValues(Object packet) {}
}
