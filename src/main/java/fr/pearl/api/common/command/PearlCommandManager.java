package fr.pearl.api.common.command;

public interface PearlCommandManager {

    void registerCommands(String fallbackPrefix, PearlCommand... commands);
}
