package fr.pearl.api.spigot.menu.item;

import com.cryptomorin.xseries.XMaterial;
import com.cryptomorin.xseries.XPotion;
import fr.pearl.api.spigot.item.ItemCreator;
import fr.pearl.api.spigot.menu.MenuHolder;
import fr.pearl.api.spigot.menu.MenuItem;
import fr.pearl.api.spigot.menu.PearlMenu;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.ClickType;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;

public class FunctionalItem extends ItemCreator<FunctionalItem> implements MenuItem {

    private ItemConsumer consumer;

    public FunctionalItem(XPotion potion) {
        super(potion);
    }

    public FunctionalItem(XMaterial material) {
        super(material);
    }

    public FunctionalItem(ItemStack itemStack) {
        super(itemStack);
    }

    @Override
    protected FunctionalItem returnInstance() {
        return this;
    }

    public FunctionalItem setConsumer(ItemConsumer consumer) {
        this.consumer = consumer;
        return this;
    }

    @Override
    public void click(PearlMenu menu, MenuHolder holder, InventoryClickEvent event, Player player, ClickType type) {
        if (this.consumer != null) this.consumer.accept(menu, holder, event, player, type);
    }
}
