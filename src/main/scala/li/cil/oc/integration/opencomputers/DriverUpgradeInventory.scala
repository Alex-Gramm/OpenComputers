package li.cil.oc.integration.opencomputers

import li.cil.oc.api
import li.cil.oc.api.driver.EnvironmentHost
import li.cil.oc.api.driver.item.HostAware
import li.cil.oc.api.driver.item.Inventory
import li.cil.oc.common.Slot
import net.minecraft.item.ItemStack

object DriverUpgradeInventory extends Item with Inventory with HostAware {
  override def worksWith(stack: ItemStack) =
    isOneOf(stack, api.Items.get("inventoryUpgrade"))

  override def createEnvironment(stack: ItemStack, host: EnvironmentHost) = null

  override def slot(stack: ItemStack) = Slot.Upgrade

  override def inventoryCapacity(stack: ItemStack) = 16
}
