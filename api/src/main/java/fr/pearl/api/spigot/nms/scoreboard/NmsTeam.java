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

    void setPlayerName(String playerName); // Creates a singleton list

    Set<String> getPlayerNameSet();

    void addName(String playerName);

    void removeName(String playerName);

    V getServerTeam();
}
