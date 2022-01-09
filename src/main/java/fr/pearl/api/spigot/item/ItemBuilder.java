package fr.pearl.api.spigot.item;

import com.cryptomorin.xseries.XMaterial;
import com.cryptomorin.xseries.XPotion;
import org.bukkit.inventory.ItemStack;

public class ItemBuilder extends ItemCreator<ItemBuilder> {

    public ItemBuilder(XMaterial material) {
        super(material);
    }

    public ItemBuilder(XPotion potion) {
        super(potion);
    }

    public ItemBuilder(ItemStack itemStack) {
        super(itemStack);
    }

    @Override
    public ItemBuilder returnInstance() {
        return this;
    }
}
