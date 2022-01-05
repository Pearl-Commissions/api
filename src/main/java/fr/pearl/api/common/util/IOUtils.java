package fr.pearl.api.common.util;

import java.io.File;
import java.io.IOException;

public class IOUtils {

    public static File getOrCreate(File file) {
        if (!file.exists()) {
            if (file.getParentFile() != null && !file.getParentFile().exists()) {
                file.getParentFile().mkdirs();
            }

            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }

            return null;
        }

        return file;
    }
}
