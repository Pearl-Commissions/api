package fr.pearl.api.spigot.menu.page.item;

import com.cryptomorin.xseries.XMaterial;
import com.cryptomorin.xseries.XPotion;
import fr.pearl.api.spigot.item.ItemCreator;
import fr.pearl.api.spigot.menu.MenuHolder;
import fr.pearl.api.spigot.menu.MenuItem;
import fr.pearl.api.spigot.menu.PearlMenu;
import fr.pearl.api.spigot.menu.holder.PageHolder;
import fr.pearl.api.spigot.menu.page.PearlPage;
import fr.pearl.api.spigot.menu.type.PaginatedPearlMenu;
import fr.pearl.api.spigot.sound.SoundBuilder;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.ClickType;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;

public class PreviousPageItem extends ItemCreator<PreviousPageItem> implements MenuItem {

    private SoundBuilder errorSound;
    private SoundBuilder successSound;

    public PreviousPageItem(XMaterial material) {
        super(material);
    }

    public PreviousPageItem(XPotion potion) {
        super(potion);
    }

    public PreviousPageItem(ItemStack itemStack) {
        super(itemStack);
    }

    public PreviousPageItem errorSound(SoundBuilder builder) {
        this.errorSound = builder;
        return this;
    }

    public PreviousPageItem successSound(SoundBuilder builder) {
        this.successSound = builder;
        return this;
    }

    @Override
    protected PreviousPageItem returnInstance() {
        return this;
    }

    @Override
    public void click(PearlMenu menu, MenuHolder holder, InventoryClickEvent event, Player player, ClickType type) {
        if (menu instanceof PaginatedPearlMenu) {
            PaginatedPearlMenu paginated = (PaginatedPearlMenu) menu;
            PearlPage page = ((PageHolder) holder).getPage();
            PearlPage previousPage = paginated.open(player, page.getPageIndex() - 1);
            if (previousPage == null && this.errorSound != null) {
                this.errorSound.getSound().play(player, this.errorSound.getVolume(), this.errorSound.getPitch());
            } else if (previousPage != null && this.successSound != null) {
                this.successSound.getSound().play(player, this.successSound.getVolume(), this.successSound.getPitch());
            }
        }
    }
}
