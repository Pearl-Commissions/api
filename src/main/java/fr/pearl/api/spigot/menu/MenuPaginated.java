package fr.pearl.api.spigot.menu;

import org.bukkit.event.inventory.InventoryType;

import java.util.List;
import java.util.Map;

public abstract class MenuPaginated implements MenuHandler {

    @Override
    public final Map<Integer, MenuItem> itemMap() {
        return null;
    }

    @Override
    public final InventoryType inventoryType() {
        return InventoryType.CHEST;
    }

    public abstract List<MenuItem> allItems();

    public int horizontalSize() {
        return 9;
    }

    public int verticalSize() {
        return 4;
    }

    public int startSlot() {
        return 9;
    }
}
