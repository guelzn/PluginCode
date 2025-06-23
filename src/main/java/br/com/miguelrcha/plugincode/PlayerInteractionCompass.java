package br.com.miguelrcha.plugincode;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.event.block.Action;
import org.bukkit.Location;

public class PlayerInteractionCompass implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent e) {
        Player player = e.getPlayer();

        ItemStack compass = new ItemStack(Material.COMPASS);
        ItemMeta meta = compass.getItemMeta();
        meta.setDisplayName("Selecione o modo de jogo");
        compass.setItemMeta(meta);

        player.getInventory().setItem(4, compass);
    }

    @EventHandler
    public void onInteract(PlayerInteractEvent e) {
        Player player = e.getPlayer();
        ItemStack item = e.getItem();

        if (item != null &&
                item.getType() == Material.COMPASS &&
                item.getItemMeta() != null &&
                item.getItemMeta().getDisplayName().equals("Selecione o modo de jogo") &&
                (e.getAction() == Action.RIGHT_CLICK_AIR || e.getAction() == Action.RIGHT_CLICK_BLOCK)) {

            e.setCancelled(true);
            openBedWarsMenu(player);
        }
    }

    public void openBedWarsMenu(Player player) {
        Inventory menu = Bukkit.createInventory(null, 27, "Admin teste");

        ItemStack bed = new ItemStack(Material.RED_BED);
        ItemMeta meta = bed.getItemMeta();
        meta.setDisplayName("Bed Wars");
        bed.setItemMeta(meta);

        menu.setItem(13, bed);  // Location material in GUI
        player.openInventory(menu);
    }

    @EventHandler
    public void onInventoryClick(InventoryClickEvent e) {
        if (e.getView().getTitle().equals("Admin teste")) {
            e.setCancelled(true);

            Player player = (Player) e.getWhoClicked();
            ItemStack clicked = e.getCurrentItem();

            if (clicked != null && clicked.getType() == Material.RED_BED) {
                player.sendMessage("§aVocê entrou no modo BedWars!");
                player.closeInventory();

                World bedw = Bukkit.getWorld("bedwars");
                if (bedw == null) {
                    player.sendMessage("§cErro: o mundo 'bedwars' não foi encontrado ou não está carregado.");
                    return;
                }

                // Teleport to Coordenates
                player.teleport(new Location(bedw, -119, 72, -290));
            }
        }
    }
}

