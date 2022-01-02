package fr.pearl.api.spigot.menu;

import com.cryptomorin.xseries.XMaterial;
import com.cryptomorin.xseries.XPotion;
import fr.pearl.api.spigot.util.MaterialUtil;
import fr.pearl.api.spigot.util.PotionUtil;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.ClickType;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.List;

public abstract class MenuItem extends ItemStack {

    private final ItemMeta meta;

    public MenuItem(XMaterial material) {
        this(MaterialUtil.parseItem(material));
    }

    public MenuItem(XPotion potion) {
        this(PotionUtil.parseItem(potion));
    }

    public MenuItem(ItemStack itemStack) {
        super(itemStack);

        this.meta = this.getItemMeta();
    }

    public MenuItem amount(int amount) {
        this.setAmount(amount);
        return this;
    }

    public MenuItem displayName(String displayName) {
        meta.setDisplayName(displayName);
        return this;
    }

    public MenuItem lore(List<String> lore) {
        meta.setLore(lore);
        return this;
    }

    public ItemStack buildItem() {
        this.setItemMeta(this.meta);
        return this;
    }

    public abstract void click(InventoryClickEvent event, Player player, ClickType type);
}
