package fr.pearl.api.common.util.io.consumer;

import java.io.DataOutputStream;
import java.io.IOException;

@FunctionalInterface
public interface IOWriteConsumer {

    void accept(DataOutputStream output) throws IOException;
}
