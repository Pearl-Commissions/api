package fr.pearl.api.spigot.sidebar;

import org.bukkit.entity.Player;

import java.util.Collection;

public interface PearlSidebar {

    void apply(Player player);

    void remove(Player player);

    void updateSlot(int slot);

    void updateSlot(PearlSidebarSlot slot);

    SidebarHandler getHandler();

    Collection<? extends Player> getViewers();

    boolean hasViewers();
}
