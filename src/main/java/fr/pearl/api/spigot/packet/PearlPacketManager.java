package fr.pearl.api.spigot.packet;

import java.util.List;

public interface PearlPacketManager {

    void registerHandler(PacketHandler handler);

    List<PacketHandler> getPacketHandlers();
}
