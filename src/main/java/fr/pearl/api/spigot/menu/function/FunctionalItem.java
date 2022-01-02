package fr.pearl.api.spigot.menu.function;

import com.cryptomorin.xseries.XMaterial;
import com.cryptomorin.xseries.XPotion;
import fr.pearl.api.spigot.menu.MenuItem;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.ClickType;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;

public class FunctionalItem extends MenuItem {

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

    public FunctionalItem setConsumer(ItemConsumer consumer) {
        this.consumer = consumer;
        return this;
    }

    @Override
    public void click(InventoryClickEvent event, Player player, ClickType type) {
        if (this.consumer != null) this.consumer.accept(event, player, type);
    }
}
