package fr.pearl.api.spigot.tag;

import org.bukkit.entity.Player;

public interface PearlTag {

    Player getPlayer();

    void setPlayer(Player player);

    void setName(String name);

    String getName();

    void setNamePrefix(String namePrefix);

    void setNameSuffix(String nameSuffix);

    String getNamePrefix();

    String getNameSuffix();

    void setListName(String listName);

    String getListName();

    void sendUpdate(Player player);

    void destroy(Player player);

    void broadcastDestroy();

    void broadcastUpdate();
}
