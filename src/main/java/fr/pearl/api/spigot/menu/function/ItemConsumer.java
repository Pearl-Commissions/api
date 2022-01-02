package fr.pearl.api.spigot.menu.function;

import org.bukkit.entity.Player;
import org.bukkit.event.inventory.ClickType;
import org.bukkit.event.inventory.InventoryClickEvent;

@FunctionalInterface
public interface ItemConsumer {

    void accept(InventoryClickEvent event, Player player, ClickType type);
}
