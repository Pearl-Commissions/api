package fr.pearl.api.common.util.io.consumer;

import java.io.DataInputStream;
import java.io.IOException;

@FunctionalInterface
public interface IOReadConsumer {

    void accept(DataInputStream input) throws IOException;
}
