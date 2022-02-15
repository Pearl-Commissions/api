package fr.pearl.api.spigot.util;

import fr.pearl.api.spigot.PearlSpigot;
import fr.pearl.api.spigot.sidebar.PearlSidebar;
import fr.pearl.api.spigot.sidebar.PearlSidebarList;
import fr.pearl.api.spigot.sidebar.SidebarHandler;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerJoinEvent;

public class SidebarHandlerExample implements SidebarHandler {

    @Override
    public void setSlots(PearlSidebarList list) {
        list.addSlot("First line of my scoreboard");
        list.addSlot("Empty line");
        list.addSlot("Your name: ", (player, text) -> text + player.getName());
        list.addSlot(
                "Your display name: ",
                (player, text) -> text + player.getDisplayName(),
                5L
        );
    }

    @Override
    public String getDisplayName() {
        return "§c§lMy Scoreboard";
    }

    private final PearlSidebar sidebar = PearlSpigot.getInstance().getSidebarManager()
            .createSidebar(new SidebarHandlerExample());

    @EventHandler
    public void onJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();
        PearlSpigot.getInstance().getSidebarManager().setSidebar(player, this.sidebar);
    }
}
