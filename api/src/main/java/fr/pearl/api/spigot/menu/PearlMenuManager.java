package fr.pearl.api.spigot.menu;

import fr.pearl.api.spigot.menu.handler.SimpleMenuHandler;
import fr.pearl.api.spigot.menu.handler.PaginatedMenuHandler;
import fr.pearl.api.spigot.menu.type.PaginatedPearlMenu;
import fr.pearl.api.spigot.menu.type.SimplePearlMenu;

public interface PearlMenuManager {

    SimplePearlMenu createMenu(SimpleMenuHandler handler);

    PaginatedPearlMenu createPaginatedMenu(PaginatedMenuHandler handler);
}
