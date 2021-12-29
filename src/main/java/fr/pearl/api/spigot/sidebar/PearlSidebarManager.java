package fr.pearl.api.spigot.sidebar;

import org.bukkit.entity.Player;

public interface PearlSidebarManager {

    PearlSidebar createSidebar(SidebarHandler handler);

    void setSidebar(Player player, PearlSidebar sidebar);

    void removeSidebar(Player player);

    PearlSidebar getSidebar(Player player);
}
