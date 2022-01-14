package fr.pearl.api.spigot.sidebar;

import org.bukkit.entity.Player;

import java.util.List;
import java.util.function.BiFunction;

public interface PearlSidebarList {

    PearlSidebarSlot addSlot(String text);

    PearlSidebarSlot addSlot(String text, BiFunction<Player, String, String> updater);

    PearlSidebarSlot addSlot(String text, BiFunction<Player, String, String> updater, long updateTime);

    List<PearlSidebarSlot> getList();
}
