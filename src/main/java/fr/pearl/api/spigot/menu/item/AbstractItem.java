package fr.pearl.api.spigot.menu.item;

import com.cryptomorin.xseries.XMaterial;
import com.cryptomorin.xseries.XPotion;
import fr.pearl.api.spigot.item.ItemCreator;
import fr.pearl.api.spigot.menu.MenuItem;
import fr.pearl.api.spigot.util.MaterialUtil;
import fr.pearl.api.spigot.util.PotionUtil;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public abstract class AbstractItem extends ItemCreator<AbstractItem> implements MenuItem {

    private final ItemMeta meta;

    public AbstractItem(XMaterial material) {
        this(MaterialUtil.parseItem(material));
    }

    public AbstractItem(XPotion potion) {
        this(PotionUtil.parseItem(potion));
    }

    public AbstractItem(ItemStack itemStack) {
        super(itemStack);

        this.meta = this.getItemMeta();
    }

    public ItemStack buildItem() {
        this.setItemMeta(this.meta);
        return this;
    }

    @Override
    protected AbstractItem returnInstance() {
        return this;
    }
}
