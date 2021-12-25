package fr.pearl.api.spigot.nms;

import io.netty.channel.ChannelHandler;
import org.bukkit.entity.Player;

public interface PearlNms<V> {

    void registerChannel(Player player, String baseName, String name, ChannelHandler handler);

    void removeChannel(Player player, String name);

    void sendPacket(Player player, Object packet);

    void setListName(Player player, String listName);

    V getEntityPlayer(Player player);
}
