package fr.pearl.api.spigot.item;

import com.cryptomorin.xseries.XMaterial;
import com.cryptomorin.xseries.XPotion;
import fr.pearl.api.spigot.PearlSpigot;
import fr.pearl.api.spigot.util.MaterialUtil;
import fr.pearl.api.spigot.util.PotionUtil;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.List;

public abstract class ItemCreator<V> extends ItemStack {

    private final ItemMeta meta;

    public ItemCreator(XMaterial material) {
        this(MaterialUtil.parseItem(material));
    }

    public ItemCreator(XPotion potion) {
        this(PotionUtil.parseItem(potion));
    }

    public ItemCreator(ItemStack itemStack) {
        super(itemStack);

        this.meta = this.getItemMeta();
    }

    public final V amount(int amount) {
        this.setAmount(amount);
        return returnInstance();
    }

    public final V displayName(String displayName) {
        meta.setDisplayName(displayName);
        return returnInstance();
    }

    public final V lore(List<String> lore) {
        meta.setLore(lore);
        return returnInstance();
    }

    public final V glow(boolean glow) {
        if (glow) {
            this.addEnchantment(PearlSpigot.getInstance().getNmsManager().getNms().getGlowEnchant(), 0);
        }

        return returnInstance();
    }

    public ItemStack buildItem() {
        this.setItemMeta(this.meta);
        return this;
    }

    protected abstract V returnInstance();
}
