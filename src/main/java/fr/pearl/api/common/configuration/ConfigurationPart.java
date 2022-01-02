package fr.pearl.api.common.configuration;

public abstract class ConfigurationPart {

    private PearlConfiguration section;

    public PearlConfiguration getSection() {
        return section;
    }

    public void setSection(PearlConfiguration section) {
        this.section = section;
    }

    public void loaded() {}
}
