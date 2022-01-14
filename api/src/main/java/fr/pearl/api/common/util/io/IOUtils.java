package fr.pearl.api.common.util.io;

import fr.pearl.api.common.util.io.consumer.IOReadConsumer;
import fr.pearl.api.common.util.io.consumer.IOWriteConsumer;

import java.io.*;

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

    public static void readFile(File file, IOReadConsumer consumer) {
        try (DataInputStream input = new DataInputStream(new BufferedInputStream(new FileInputStream(file)))) {
            consumer.accept(input);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeFile(File file, IOWriteConsumer consumer) {
        try (DataOutputStream output = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(file)))) {
            consumer.accept(output);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
