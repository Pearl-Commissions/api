package fr.pearl.api.spigot.util;

import com.cryptomorin.xseries.XMaterial;
import com.cryptomorin.xseries.XPotion;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.List;

public class ItemBuilder extends ItemStack {

    private final ItemMeta meta;

    public ItemBuilder(XMaterial material) {
        this(MaterialUtil.parseItem(material));
    }

    public ItemBuilder(XPotion potion) {
        this(PotionUtil.parseItem(potion));
    }

    public ItemBuilder(ItemStack itemStack) {
        super(itemStack);

        this.meta = this.getItemMeta();
    }

    public ItemBuilder amount(int amount) {
        this.setAmount(amount);
        return this;
    }

    public ItemBuilder displayName(String displayName) {
        meta.setDisplayName(displayName);
        return this;
    }

    public ItemBuilder lore(List<String> lore) {
        meta.setLore(lore);
        return this;
    }

    public ItemStack buildItem() {
        this.setItemMeta(this.meta);
        return this;
    }
}
