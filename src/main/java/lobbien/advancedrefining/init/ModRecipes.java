package lobbien.advancedrefining.init;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {
	public static void init() {
		GameRegistry.addSmelting(Items.ROTTEN_FLESH, new ItemStack(Items.SLIME_BALL),10.0f);
		
	}
}
