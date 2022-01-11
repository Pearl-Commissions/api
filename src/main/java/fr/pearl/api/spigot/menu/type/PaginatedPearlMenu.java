package fr.pearl.api.spigot.menu.type;

import fr.pearl.api.spigot.menu.PearlMenu;
import fr.pearl.api.spigot.menu.page.PearlPage;
import org.bukkit.entity.Player;

import java.util.List;

public interface PaginatedPearlMenu extends PearlMenu {

    List<PearlPage> getPageList();

    int getPageSize();

    PearlPage open(Player player, int page);

    PearlPage open(Player player);
}
