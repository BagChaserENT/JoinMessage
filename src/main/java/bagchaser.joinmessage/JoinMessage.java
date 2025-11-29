package bagchaser.joinmessage;

import cn.nukkit.plugin.PluginBase;

public class JoinMessage extends PluginBase {

    public void onEnable(){
        this.getServer().getPluginManager().registerEvents(new EventListener(), this);
    }
}