package fr.pearl.api.spigot.menu;

import fr.pearl.api.spigot.menu.item.AbstractItem;
import org.bukkit.entity.Player;

public interface PearlMenu {

    void open(Player player);

    void setItem(int slot, AbstractItem item);

    void refreshSlots();

    void clear();
}
