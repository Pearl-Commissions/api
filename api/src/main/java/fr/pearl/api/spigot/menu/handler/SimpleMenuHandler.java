package fr.pearl.api.spigot.menu.handler;

import fr.pearl.api.spigot.menu.MenuItem;
import fr.pearl.api.spigot.menu.PearlMenu;
import fr.pearl.api.spigot.menu.type.SimplePearlMenu;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryType;

import java.util.Map;

public interface SimpleMenuHandler {

    String title();

    Map<Integer, MenuItem> itemMap();

    default InventoryType inventoryType() {
        return InventoryType.CHEST;
    }

    default int lines() {
        return 9;
    }

    default void onOpen(SimplePearlMenu menu, Player player) {}
}
