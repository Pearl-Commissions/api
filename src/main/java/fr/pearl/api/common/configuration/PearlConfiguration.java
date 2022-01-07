package fr.pearl.api.common.configuration;

import fr.pearl.api.common.PearlAPI;

import java.io.File;
import java.io.InputStream;
import java.util.*;

public interface PearlConfiguration extends PearlSection {

    void load();

    void save();

    File getFile();
}
