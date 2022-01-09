package fr.pearl.api.spigot.menu;

import org.bukkit.entity.Player;

public interface PearlMenu {

    void open(Player player);

    void setItem(int slot, MenuItem item);

    void refreshSlots();

    void clear();

    boolean isPaginated();
}
