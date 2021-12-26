package fr.pearl.api.spigot.nms.scoreboard;

public interface NmsScoreboard<V> {

    V getScoreboardServer();

    NmsObjective<?> createObjective(String name, String criteria);

    NmsTeam<?> createTeam(String name);
}
