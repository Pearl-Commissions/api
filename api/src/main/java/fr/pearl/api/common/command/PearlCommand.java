package fr.pearl.api.common.command;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public abstract class PearlCommand {

    private static final String defaultPermissionMessage = "§cYou don't have the permission.";

    private final Map<String, PearlCommand> argumentMap = new LinkedHashMap<>();
    private final Map<String, PearlCommand> aliasMap = new LinkedHashMap<>();
    private final String name;
    private boolean playersOnly;
    private String permission;
    private String permissionMessage = defaultPermissionMessage;
    private String[] aliases;

    public PearlCommand(String name) {
        this.name = name;
    }

    public abstract void execute(PearlSender sender, String label, String[] args);

    public List<String> tabComplete(PearlSender sender, String label, String[] args) {
        return null;
    }

    public final void addArgument(String name, PearlCommand argument) {
        this.argumentMap.put(name.toLowerCase(), argument);
        if (argument.getAliases() != null) {
            for (String alias : argument.getAliases()) {
                this.aliasMap.put(alias.toLowerCase(), argument);
            }
        }
    }

    public String getName() {
        return name;
    }

    public boolean isPlayersOnly() {
        return playersOnly;
    }

    public String getPermission() {
        return permission;
    }

    public String[] getAliases() {
        return aliases;
    }

    public final void setPlayersOnly(boolean playersOnly) {
        this.playersOnly = playersOnly;
    }

    public final void setPermission(String permission) {
        this.permission = permission;
    }

    public final void setAliases(List<String> aliases) {
        String[] strings = new String[aliases.size()];
        for (int i = 0; i < aliases.size(); i++) {
            strings[i] = aliases.get(i);
        }
        this.aliases = strings;
    }

    public void setAliases(String... aliases) {
        this.aliases = aliases;
    }

    public String getPermissionMessage() {
        return permissionMessage;
    }

    public void setPermissionMessage(String permissionMessage) {
        this.permissionMessage = permissionMessage;
    }

    public final Map<String, PearlCommand> getArgumentMap() {
        return argumentMap;
    }

    public final Map<String, PearlCommand> getAliasMap() {
        return aliasMap;
    }
}
