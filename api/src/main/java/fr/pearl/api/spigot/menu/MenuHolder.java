package fr.pearl.api.spigot.menu;

import org.bukkit.inventory.InventoryHolder;

import java.util.Map;

public interface MenuHolder extends InventoryHolder {

    Map<Integer, MenuItem> getItemMap();

    PearlMenu getMenu();
}
