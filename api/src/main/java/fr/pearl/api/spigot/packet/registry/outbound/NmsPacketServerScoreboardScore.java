package fr.pearl.api.spigot.packet.registry.outbound;

import fr.pearl.api.spigot.nms.scoreboard.NmsScore;
import fr.pearl.api.spigot.packet.PacketServer;
import fr.pearl.api.spigot.packet.registry.enums.ScoreAction;

public interface NmsPacketServerScoreboardScore extends PacketServer {

    void setScore(NmsScore<?> score);

    void setAction(ScoreAction action);
}
