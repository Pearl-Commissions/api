package fr.pearl.api.common.configuration;

import fr.pearl.api.common.PearlAPI;

import java.io.File;
import java.util.*;

public interface PearlConfiguration {

    void load();

    void save();

    File getFile();

    <T> void set(String path, T value);

    <T> T get(String path, T defaultValue);

    default PearlConfiguration getSection(String path) {
        return getSection(path, null);
    }

    PearlConfiguration getSection(String path, Map<String, Object> defaultEntries);

    default String getString(String path, String defaultValue) {
        return get(path, defaultValue);
    }

    default boolean getBoolean(String path, boolean defaultValue) {
        return get(path, defaultValue);
    }

    default int getInteger(String path, int defaultValue) {
        return get(path, defaultValue);
    }

    default double getDouble(String path, double defaultValue) {
        return get(path, defaultValue);
    }

    default float getFloat(String path, float defaultValue) {
        return get(path, defaultValue);
    }

    default <T> List<T> getList(String path, List<T> defaultValue) {
        return get(path, defaultValue);
    }

    default List<String> getStringList(String path, List<String> defaultValue) {
        return get(path, defaultValue);
    }

    default List<String> getColoredList(String path, List<String> defaultValue) {
        List<String> list = getStringList(path, defaultValue);
        List<String> coloredList = new ArrayList<>(list.size());
        for (String value : list) {
            if (PearlAPI.getInstance().isBungeeCord()) {
                value = org.bukkit.ChatColor.translateAlternateColorCodes('&', value);
            } else {
                value = net.md_5.bungee.api.ChatColor.translateAlternateColorCodes('&', value);
            }

            coloredList.add(value);
        }

        return coloredList;
    }

    Set<String> getKeys();
}
