package fr.pearl.api.spigot.menu.function;

import fr.pearl.api.spigot.menu.PearlMenu;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.ClickType;
import org.bukkit.event.inventory.InventoryClickEvent;

@FunctionalInterface
public interface ItemConsumer {

    void accept(PearlMenu menu, InventoryClickEvent event, Player player, ClickType type);
}
