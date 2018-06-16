package lobbien.advancedrefining.blocks;

import lobbien.advancedrefining.blocks.TileEntityRefiningForge;

import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class slotfuel extends Slot {

	public slotfuel(IInventory inventory, int index, int x, int y) {
		super(inventory, index, x, y);
		
	}
	public boolean isItemValid(ItemStack stack)
	{
		return TileEntityRefiningForge.isItemFuel(stack);
	}
	public int getItemStackLimit(ItemStack stack)
	{
		return super.getItemStackLimit(stack);
	}
}
