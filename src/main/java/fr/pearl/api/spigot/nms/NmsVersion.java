package fr.pearl.api.spigot.nms;

public enum NmsVersion {
    V1_8("v1_8_R3"),
    V1_9("v1_9_R2"),
    V1_10("v1_10_R1"),
    V1_11("v1_11_R1"),
    V1_12("v1_12_R1"),
    V1_13("v1_13_R2"),
    V1_14("v1_14_R1"),
    V1_15("v1_15_R1"),
    V1_16("v1_16_R3");

    private final String name;

    NmsVersion(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
