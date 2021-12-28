package fr.pearl.api.spigot.nms.scoreboard;

import org.bukkit.entity.Player;

import java.util.Set;

public interface NmsTeam<V> {

    void setName(String name);

    String getName();

    String getTeamPrefix();

    String getTeamSuffix();

    void setTeamPrefix(String prefix);

    void setTeamSuffix(String suffix);

    void setPlayer(Player player); // Creates a singleton list

    Set<String> getPlayerNameSet();

    void addPlayer(Player player);

    void removePlayer(Player player);

    V getServerTeam();
}
