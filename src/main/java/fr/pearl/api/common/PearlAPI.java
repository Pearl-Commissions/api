package fr.pearl.api.common;

public abstract class PearlAPI {

    private static PearlAPI instance;

    public static PearlAPI getInstance() {
        return instance;
    }

    protected static void setInstance(PearlAPI instance) {
        PearlAPI.instance = instance;
    }

    public abstract boolean isBungeeCord();
}
