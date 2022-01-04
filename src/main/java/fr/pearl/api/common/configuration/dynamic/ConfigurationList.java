package fr.pearl.api.common.configuration.dynamic;

import java.util.ArrayList;
import java.util.List;

public abstract class ConfigurationList<V extends ConfigurationKey> extends ArrayList<V> {

    public abstract ConfigurationKey create(String key);

    public ConfigurationList(List<V> defaults) {
        super(defaults);
    }
}
