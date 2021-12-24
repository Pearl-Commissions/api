package fr.pearl.api;

public abstract class PearlAPI {

    private static PearlAPI instance;

    public static PearlAPI getInstance() {
        return instance;
    }

    public void setInstance(PearlAPI instance) {
        PearlAPI.instance = instance;
    }
}
