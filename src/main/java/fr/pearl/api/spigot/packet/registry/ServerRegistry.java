package fr.pearl.api.spigot.packet.registry;

import fr.pearl.api.spigot.PearlSpigot;
import fr.pearl.api.spigot.packet.PacketServer;
import fr.pearl.api.spigot.packet.registry.outbound.NmsPacketServerPlayerInfo;
import fr.pearl.api.spigot.packet.registry.outbound.NmsPacketServerScoreboardObjective;

public enum ServerRegistry {
    PLAYER_INFO(NmsPacketServerPlayerInfo.class),
    SCOREBOARD_OBJECTIVE(NmsPacketServerScoreboardObjective.class);

    private final Class<? extends PacketServer> packetClass;

    ServerRegistry(Class<? extends PacketServer> packetClass) {
        this.packetClass = packetClass;
    }

    public Class<? extends PacketServer> getPacketClass() {
        return packetClass;
    }

    public <T extends PacketServer> T getPacket() {
        return PearlSpigot.getInstance().getPacketManager().getPacket(this.packetClass);
    }
}
