package fr.pearl.api.bungee;

import net.md_5.bungee.api.plugin.Plugin;

public abstract class PearlBungee extends Plugin {

    private static PearlBungee instance;

    public static PearlBungee getInstance() {
        return instance;
    }

    protected static void setInstance(PearlBungee instance) {
        PearlBungee.instance = instance;
    }
}
