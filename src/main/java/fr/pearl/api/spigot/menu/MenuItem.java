package fr.pearl.api.spigot.menu;

import org.bukkit.entity.Player;
import org.bukkit.event.inventory.ClickType;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;

public interface MenuItem {

    void click(PearlMenu menu, InventoryClickEvent event, Player player, ClickType type);

    ItemStack buildItem();
}
