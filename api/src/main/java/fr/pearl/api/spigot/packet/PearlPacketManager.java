package fr.pearl.api.spigot.packet;

import java.util.List;

public interface PearlPacketManager {

    void registerHandler(PacketHandler handler);

    List<PacketHandler> getPacketHandlers();

    <T extends PacketServer> T getPacket(Class<? extends PacketServer> clazz);

    <T extends PacketServer> T convertPacket(Object packet);

    <T extends PacketServer> T convertPacket(Object packet, boolean fillValues);
}
