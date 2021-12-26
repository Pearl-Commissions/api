package fr.pearl.api.spigot.util;

import com.cryptomorin.xseries.XPotion;
import org.apache.commons.lang3.Validate;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.PotionMeta;
import org.bukkit.potion.PotionEffectType;

public class PotionUtil {

    public static ItemStack parseItem(XPotion xPotion) {
        final PotionEffectType type = xPotion.parsePotionEffectType();
        Validate.notNull(type, "Cannot create from null effect type");
        @SuppressWarnings("deprecation")
        ItemStack potion = Material.getMaterial("SPLASH_POTION") == null ?
                new ItemStack(Material.POTION, 1, (short) 16398) :
                new ItemStack(Material.SPLASH_POTION);
        PotionMeta meta = (PotionMeta) potion.getItemMeta();
        if (meta == null) throw new IllegalArgumentException("Cannot create potion, potion meta is null");
        meta.setColor(type.getColor());
        potion.setItemMeta(meta);
        return potion;
    }
}