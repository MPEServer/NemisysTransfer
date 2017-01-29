package pe.teslex.nt;

import cn.nukkit.Player;
import cn.nukkit.command.Command;
import cn.nukkit.command.CommandSender;
import cn.nukkit.plugin.PluginBase;
import org.itxtech.synapseapi.SynapsePlayer;

/**
 * Created by expexes on 22.01.2017.
 * Site: teslex.tech
 */
public class Main extends PluginBase {

    @Override
    public void onEnable() {
        this.getLogger().info("§a> §fEnabled");
        this.getLogger().info("§a> §fPlugin by §eTesLex Team");
    }

    @Override
    public void onDisable() {
        this.getLogger().info("§a> §fDisabled");
        this.getLogger().info("§a> §fPlugin by §eTesLex Team");
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (command.getLabel().equalsIgnoreCase("transfer")) {
            Player p = getServer().getPlayer(args[0]);
            String hash = args[1];
            ((SynapsePlayer) p).transfer(((SynapsePlayer) p).getSynapseEntry().getClientData().getHashByDescription(hash));
        }
        return true;
    }
}
