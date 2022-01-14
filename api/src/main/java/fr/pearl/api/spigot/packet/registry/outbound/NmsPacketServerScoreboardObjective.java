package fr.pearl.api.spigot.packet.registry.outbound;

import fr.pearl.api.spigot.nms.scoreboard.NmsObjective;
import fr.pearl.api.spigot.packet.PacketServer;

public interface NmsPacketServerScoreboardObjective extends PacketServer {

    void setObjective(NmsObjective<?> objective);

    void setType(int type);
}
