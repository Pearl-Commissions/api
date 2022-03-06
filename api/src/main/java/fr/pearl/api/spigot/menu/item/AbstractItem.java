package fr.pearl.api.spigot.menu.item;

import com.cryptomorin.xseries.XMaterial;
import fr.pearl.api.spigot.item.ItemCreator;
import fr.pearl.api.spigot.menu.MenuItem;
import fr.pearl.api.spigot.potion.PotionBuilder;
import fr.pearl.api.spigot.util.MaterialUtil;
import org.bukkit.inventory.ItemStack;

public abstract class AbstractItem extends ItemCreator<AbstractItem> implements MenuItem {


    public AbstractItem(XMaterial material) {
        this(MaterialUtil.parseItem(material));
    }

    public AbstractItem(PotionBuilder potion) {
        this(potion.builtItem());
    }

    public AbstractItem(ItemStack itemStack) {
        super(itemStack);
    }

    @Override
    protected AbstractItem returnInstance() {
        return this;
    }
}
