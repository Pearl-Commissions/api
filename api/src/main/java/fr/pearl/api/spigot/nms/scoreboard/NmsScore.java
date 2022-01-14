package fr.pearl.api.spigot.nms.scoreboard;

import org.bukkit.entity.Player;

public interface NmsScore<V> {

    void setName(String name);

    String getName();

    void setScore(int score);

    int getScore();

    V getServerScore();
}
