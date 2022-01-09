package fr.pearl.api.spigot.menu.item;

import com.cryptomorin.xseries.XMaterial;
import com.cryptomorin.xseries.XPotion;
import fr.pearl.api.spigot.item.ItemCreator;
import fr.pearl.api.spigot.menu.MenuItem;
import fr.pearl.api.spigot.menu.PearlMenu;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.ClickType;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;

public class MovableItem extends ItemCreator<MovableItem> implements MenuItem {

    public MovableItem(XMaterial material) {
        super(material);
    }

    public MovableItem(XPotion potion) {
        super(potion);
    }

    public MovableItem(ItemStack itemStack) {
        super(itemStack);
    }

    @Override
    protected MovableItem returnInstance() {
        return this;
    }

    @Override
    public void click(PearlMenu menu, InventoryClickEvent event, Player player, ClickType type) {
        event.setCancelled(false);
    }
}
