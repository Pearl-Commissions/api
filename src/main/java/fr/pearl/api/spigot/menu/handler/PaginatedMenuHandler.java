package fr.pearl.api.spigot.menu.handler;

import com.cryptomorin.xseries.XMaterial;
import com.cryptomorin.xseries.XSound;
import fr.pearl.api.spigot.menu.MenuItem;
import fr.pearl.api.spigot.menu.page.PearlPage;
import fr.pearl.api.spigot.menu.page.item.NextPageItem;
import fr.pearl.api.spigot.menu.page.item.PreviousPageItem;
import fr.pearl.api.spigot.menu.util.PagePatternUtil;
import fr.pearl.api.spigot.sound.SoundBuilder;
import org.bukkit.entity.Player;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface PaginatedMenuHandler {

    String title();

    default Map<Integer, MenuItem> itemsPerPage() {
        Map<Integer, MenuItem> itemMap = new HashMap<>();
        SoundBuilder successSound = new SoundBuilder(XSound.BLOCK_NOTE_BLOCK_PLING);
        PreviousPageItem previous = new PreviousPageItem(XMaterial.ARROW).displayName("§bPrevious Page").successSound(successSound);
        NextPageItem next = new NextPageItem(XMaterial.ARROW).displayName("§aNext Page").successSound(successSound);
        itemMap.put(0, previous);
        itemMap.put(8, next);
        itemMap.put(45, previous);
        itemMap.put(53, next);
        return itemMap;
    }

     List<MenuItem> allItems();

    default void onPageOpened(Player player, PearlPage page) {}

    default int[] itemsPattern() {
        return PagePatternUtil.squarePattern(0, 9, 1, 5);
    }

    default int linesPerPage() {
        return 6;
    }

}
