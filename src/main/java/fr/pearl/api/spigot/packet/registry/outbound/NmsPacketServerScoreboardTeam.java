package fr.pearl.api.spigot.packet.registry.outbound;

import fr.pearl.api.spigot.nms.scoreboard.NmsTeam;
import fr.pearl.api.spigot.packet.PacketServer;

public interface NmsPacketServerScoreboardTeam extends PacketServer {

    void setTeam(NmsTeam<?> team);

    void setType(int type);

    int getType();
}
