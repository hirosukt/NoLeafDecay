package hirosuke.noleafdecay;

import org.bukkit.plugin.java.JavaPlugin

class Noleafdecay : JavaPlugin() {

    override fun onEnable() {
        logger.info("plugin has loaded.")
        this.server.pluginManager.registerEvents(EventLeafDecay(), this)
    }

    override fun onDisable() {
        logger.info("plugin has unloaded.")
    }
}
