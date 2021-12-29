package fr.pearl.api.spigot.nms.scoreboard;

public interface NmsScoreboard<V> {

    V getScoreboardServer();

    NmsObjective<?> createObjective(String name, String criteria);

    NmsTeam<?> createNewTeam(String name);

    NmsScore<?> createScore(NmsScoreboard<?> scoreboard, NmsObjective<?> objective, String name, int initialScore);
}
