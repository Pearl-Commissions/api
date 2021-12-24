package fr.pearl.api.spigot;

import fr.pearl.api.spigot.nms.PearlNmsManager;
import org.bukkit.plugin.java.JavaPlugin;

public abstract class PearlSpigot extends JavaPlugin {

    private static PearlSpigot instance;

    public static PearlSpigot getInstance() {
        return instance;
    }

    protected static void setInstance(PearlSpigot instance) {
        PearlSpigot.instance = instance;
    }

    public abstract PearlNmsManager getNmsManager();
}
