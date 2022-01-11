package fr.pearl.api.spigot.menu.type;

import fr.pearl.api.spigot.menu.MenuItem;
import fr.pearl.api.spigot.menu.PearlMenu;
import org.bukkit.entity.Player;

public interface SimplePearlMenu extends PearlMenu {

    void setItem(int slot, MenuItem item);

    void clear();

    void open(Player player);
}
