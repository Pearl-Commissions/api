package fr.pearl.api.common.configuration.dynamic;

public abstract class ConfigurationKey extends ConfigurationPart {

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
