package bagchaser.joinmessage;

import cn.nukkit.event.Listener;
import cn.nukkit.event.player.PlayerJoinEvent;
import cn.nukkit.event.player.PlayerQuitEvent;

public class EventListener implements Listener {

    public void onJoin(PlayerJoinEvent event){
        event.setJoinMessage(event.getPlayer().getName() + " joined the game!");
    } 

    public void onQuit(PlayerQuitEvent event){
        event.setQuitMessage(event.getPlayer().getName() + " left the game!");
    }
}