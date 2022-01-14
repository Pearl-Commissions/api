package fr.pearl.api.spigot.menu.item;

import fr.pearl.api.spigot.menu.MenuHolder;
import fr.pearl.api.spigot.menu.PearlMenu;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.ClickType;
import org.bukkit.event.inventory.InventoryClickEvent;

@FunctionalInterface
public interface ItemConsumer {

    void accept(PearlMenu menu, MenuHolder holder, InventoryClickEvent event, Player player, ClickType type);
}
