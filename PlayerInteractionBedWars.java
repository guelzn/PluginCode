package br.com.miguelrcha.plugincode;

import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

public class PlayerInteractionBedWars implements Listener {
    @EventHandler
    public void onBlockBreak(BlockBreakEvent e) {

        Player player = e.getPlayer();

        Block block = e.getBlock();

        World world = player.getWorld();

        if (block.getType() == Material.RED_BED) {
            world.strikeLightning(block.getLocation(block.getLocation()));

            player.playSound(player.getLocation(), Sound.ENTITY_CAT_BEG_FOR_FOOD, 5, 5);

            player.sendMessage(" ");
            player.sendMessage("§lCAMA DESTRUÍDA >§r " + player.getName() + " destruiu a §cCama do Vermelho§r!");
            player.sendMessage(" ");


        } else if (block.getType() == Material.BLUE_BED) {
            world.strikeLightning(block.getLocation(block.getLocation()));

            player.playSound(player.getLocation(), Sound.ENTITY_CAT_BEG_FOR_FOOD, 5, 5);

            player.sendMessage(" ");
            player.sendMessage("§lCAMA DESTRUÍDA >§r " + player.getName() + " destruiu a §1Cama do Azul§r!");
            player.sendMessage(" ");

        } else if (block.getType() == Material.GREEN_BED) {
            world.strikeLightning(block.getLocation(block.getLocation()));

            player.playSound(player.getLocation(), Sound.ENTITY_CAT_BEG_FOR_FOOD, 5, 5);

            player.sendMessage(" ");
            player.sendMessage("§lCAMA DESTRUÍDA >§r " + player.getName() + " destruiu a §2Cama do Verde§r!");
            player.sendMessage(" ");

        } else if (block.getType() == Material.YELLOW_BED) {
            world.strikeLightning(block.getLocation(block.getLocation()));

            player.playSound(player.getLocation(), Sound.ENTITY_CAT_BEG_FOR_FOOD, 5, 5);

            player.sendMessage(" ");
            player.sendMessage("§lCAMA DESTRUÍDA >§r " + player.getName() + " destruiu a §eCama do Amarelo§r!");
            player.sendMessage(" ");

        } else if (block.getType() == Material.CYAN_BED) {
            world.strikeLightning(block.getLocation(block.getLocation()));

            player.playSound(player.getLocation(), Sound.ENTITY_CAT_BEG_FOR_FOOD, 5, 5);

            player.sendMessage(" ");
            player.sendMessage("§lCAMA DESTRUÍDA >§r " + player.getName() + " destruiu a §bCama do Ciano§r!");
            player.sendMessage(" ");

        } else if (block.getType() == Material.WHITE_BED) {
            world.strikeLightning(block.getLocation(block.getLocation()));

            player.playSound(player.getLocation(), Sound.ENTITY_CAT_BEG_FOR_FOOD, 5, 5);

            player.sendMessage(" ");
            player.sendMessage("§lCAMA DESTRUÍDA >§r " + player.getName() + " destruiu a Cama do Branco§r!");
            player.sendMessage(" ");

        } else if (block.getType() == Material.PINK_BED) {
            world.strikeLightning(block.getLocation(block.getLocation()));

            player.playSound(player.getLocation(), Sound.ENTITY_CAT_BEG_FOR_FOOD, 5, 5);

            player.sendMessage(" ");
            player.sendMessage("§lCAMA DESTRUÍDA >§r " + player.getName() + " destruiu a §dCama do Rosa§r!");
            player.sendMessage(" ");

        } else if (block.getType() == Material.GRAY_BED) {
            world.strikeLightning(block.getLocation(block.getLocation()));

            player.playSound(player.getLocation(), Sound.ENTITY_CAT_BEG_FOR_FOOD, 5, 5);

            player.sendMessage(" ");
            player.sendMessage("§lCAMA DESTRUÍDA >§r " + player.getName() + " destruiu a §8Cama do Ciano§r!");
            player.sendMessage(" ");

        }
    }
}
