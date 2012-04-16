package me.wphf123.Scuba;
import java.util.logging.Logger;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;
public class Scuba extends JavaPlugin{
	public static Scuba plugin;
	public final Logger logger = Logger.getLogger("Minecraft");	
	public void onDisable() {
		PluginDescriptionFile pdfFile = this.getDescription();
		this.logger.info(pdfFile.getName() + " has been disabled");
	}
	public void onEnable() {
		PluginDescriptionFile pdfFile = this.getDescription();
		this.logger.info(pdfFile.getName() + " has been enabled");
	}
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
		if (commandLabel.equalsIgnoreCase("sgon")) {
			Player player = (Player) sender;
			player.setRemainingAir(999999999);
			player.sendMessage(ChatColor.AQUA + "You have put your scuba gear on");
		}
		else if (commandLabel.equalsIgnoreCase("sgoff")) {
			Player player = (Player) sender;
			player.setRemainingAir(100);
			player.sendMessage(ChatColor.AQUA + "You have taken off your scuba gear");
		}
		return false;
	}
}

