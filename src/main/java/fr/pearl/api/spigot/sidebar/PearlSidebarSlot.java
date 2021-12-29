package fr.pearl.api.spigot.sidebar;

import fr.pearl.api.spigot.nms.scoreboard.NmsScore;
import fr.pearl.api.spigot.nms.scoreboard.NmsTeam;
import org.bukkit.entity.Player;

import java.util.function.BiFunction;

public interface PearlSidebarSlot {

    String getText();

    void setText(String text);

    BiFunction<Player, String, String> getUpdater();

    long updateTime();

    NmsScore<?> getScore();

    NmsTeam<?> getTeam();
}
