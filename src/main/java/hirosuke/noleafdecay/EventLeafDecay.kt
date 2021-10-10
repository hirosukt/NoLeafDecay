package hirosuke.noleafdecay

import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.block.LeavesDecayEvent

class EventLeafDecay : Listener {

    @EventHandler
    fun onLeavesDecay(e: LeavesDecayEvent) {
        e.isCancelled = true
    }
}