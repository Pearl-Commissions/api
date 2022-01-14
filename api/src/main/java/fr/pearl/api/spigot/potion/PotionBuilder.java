package fr.pearl.api.spigot.potion;

import com.cryptomorin.xseries.XPotion;
import org.apache.commons.lang.Validate;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.PotionMeta;
import org.bukkit.potion.Potion;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.potion.PotionType;

public class PotionBuilder {

    private static final boolean isOld = Material.getMaterial("SPLASH_POTION") == null;

    private final XPotion potion;

    private boolean splash;
    private boolean extended;
    private boolean upgraded;

    public PotionBuilder(XPotion potion) {
        this.potion = potion;
    }

    public PotionBuilder setSplash(boolean splash) {
        this.splash = splash;
        return this;
    }

    public PotionBuilder setExtended(boolean extended) {
        this.extended = extended;
        return this;
    }

    public PotionBuilder setUpgraded(boolean upgraded) {
        this.upgraded = upgraded;
        return this;
    }

    @SuppressWarnings("deprecation")
    public ItemStack builtItem() {
        Validate.notNull(this.potion, "XPotion cannot be null");

        PotionEffectType type = this.potion.parsePotionEffectType();
        PotionType potionType = PotionType.getByEffect(type);
        if (isOld) {
            if (potionType == null) return new ItemStack(Material.POTION, 1);
            Potion potion = new Potion(potionType, this.upgraded ? 2 : 1, this.splash);
            potion.setHasExtendedDuration(this.extended);
            return potion.toItemStack(1);
        } else {
            Material material = this.splash ? Material.POTION : Material.SPLASH_POTION;
            ItemStack itemStack = new ItemStack(material);
            if (potionType == null) {
                return itemStack;
            }
            org.bukkit.potion.PotionData data = new org.bukkit.potion.PotionData(potionType, this.extended, this.upgraded);
            PotionMeta meta = (PotionMeta) itemStack.getItemMeta();
            if (meta == null) return itemStack;
            meta.setBasePotionData(data);
            itemStack.setItemMeta(meta);
            return itemStack;
        }
    }
}
