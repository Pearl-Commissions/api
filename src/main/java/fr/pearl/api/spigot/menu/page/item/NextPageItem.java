package fr.pearl.api.spigot.menu.page.item;

import com.cryptomorin.xseries.XMaterial;
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

public class NextPageItem extends ItemCreator<NextPageItem> implements MenuItem {

    private SoundBuilder errorSound;
    private SoundBuilder successSound;

    public NextPageItem(XMaterial material) {
        super(material);
    }

    @Override
    protected NextPageItem returnInstance() {
        return this;
    }

    public NextPageItem errorSound(SoundBuilder builder) {
        this.errorSound = builder;
        return this;
    }

    public NextPageItem successSound(SoundBuilder builder) {
        this.successSound = builder;
        return this;
    }

    @Override
    public void click(PearlMenu menu, MenuHolder holder, InventoryClickEvent event, Player player, ClickType type) {
        if (menu instanceof PaginatedPearlMenu) {
            PaginatedPearlMenu paginated = (PaginatedPearlMenu) menu;
            PearlPage page = ((PageHolder) holder).getPage();
            PearlPage nextPage = paginated.open(player, page.getPageIndex() + 1);

            if (nextPage == null && this.errorSound != null) {
                this.errorSound.getSound().play(player, this.errorSound.getVolume(), this.errorSound.getPitch());
            } else if (nextPage != null && this.successSound != null) {
                this.successSound.getSound().play(player, this.successSound.getVolume(), this.successSound.getPitch());
            }
        }
    }
}
