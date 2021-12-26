package fr.pearl.api.spigot.nms.scoreboard;

public interface NmsObjective<V> {

    V getServerObjective();

    void setDisplayName(String displayName);

    String getCurrentDisplayName();
}
