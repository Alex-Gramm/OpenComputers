package li.cil.oc.integration.tcon

import cpw.mods.fml.common.event.FMLInterModComms
import li.cil.oc.integration.ModProxy
import li.cil.oc.integration.Mods
import net.minecraftforge.common.MinecraftForge

object ModTinkersConstruct extends ModProxy {
  override def getMod = Mods.TinkersConstruct

  override def initialize() {
    FMLInterModComms.sendMessage(Mods.IDs.OpenComputers, "registerToolDurabilityProvider", "li.cil.oc.integration.tcon.EventHandlerTinkersConstruct.getDurability")

    MinecraftForge.EVENT_BUS.register(EventHandlerTinkersConstruct)
  }
}
