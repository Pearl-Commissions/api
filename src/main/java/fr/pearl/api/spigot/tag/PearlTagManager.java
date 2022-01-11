package fr.pearl.api.spigot.tag;

import fr.pearl.api.spigot.nms.scoreboard.NmsObjective;
import fr.pearl.api.spigot.nms.scoreboard.NmsScoreboard;
import org.bukkit.entity.Player;

public interface PearlTagManager {

    PearlTag createTag(String name, Player player);

    NmsScoreboard<?> getMainScoreboard();

    NmsObjective<?> getMainObjective();
}
