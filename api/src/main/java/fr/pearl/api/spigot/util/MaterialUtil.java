package fr.pearl.api.spigot.util;

import com.cryptomorin.xseries.XMaterial;
import org.apache.commons.lang.Validate;
import org.bukkit.inventory.ItemStack;

public class MaterialUtil {

    public static ItemStack parseItem(XMaterial material) {
        ItemStack item = material.parseItem();
        Validate.notNull(item, "ItemStack cannot be null");
        return item;
    }
}
