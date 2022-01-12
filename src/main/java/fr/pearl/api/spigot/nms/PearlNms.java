package fr.pearl.api.spigot.nms;

import fr.pearl.api.spigot.nms.scoreboard.NmsScoreboard;
import io.netty.channel.ChannelHandler;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public interface PearlNms<V> {

    void registerChannel(Player player, String baseName, String name, ChannelHandler handler);

    void removeChannel(Player player, String name);

    void sendPacket(Player player, Object packet);

    void setListName(Player player, String listName);

    NmsScoreboard<?> createScoreboard();

    V getEntityPlayer(Player player);

    Enchantment getGlowEnchant();

    default void setUnbreakable(ItemMeta meta, boolean unbreakable) {
        meta.setUnbreakable(unbreakable);
    }
}
