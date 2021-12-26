package fr.pearl.api.spigot.packet.registry.outbound;

import fr.pearl.api.spigot.packet.PacketServer;
import fr.pearl.api.spigot.packet.registry.enums.PlayerInfoType;
import org.bukkit.entity.Player;

import java.util.Collection;

public interface NmsPacketServerPlayerInfo extends PacketServer {

    void setPlayerInfoType(PlayerInfoType infoType);

    void setPlayers(Player... players);

    void setPlayers(Collection<? extends Player> players);
}
