package fr.pearl.api.spigot.menu;

import org.bukkit.event.inventory.InventoryType;

import java.util.Map;

public interface MenuHandler {

    String title();

    Map<Integer, MenuItem> itemMap();

    default InventoryType inventoryType() {
        return InventoryType.CHEST;
    }

    default int lines() {
        return 9;
    }
}
