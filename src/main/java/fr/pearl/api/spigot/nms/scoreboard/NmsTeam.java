package fr.pearl.api.spigot.nms.scoreboard;

public interface NmsTeam<V> {

    String getPrefix();

    String getSuffix();

    V getServerTeam();
}
