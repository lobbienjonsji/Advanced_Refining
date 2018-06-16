package lobbien.advancedrefining.util.handler;

import net.minecraftforge.fml.common.registry.GameRegistry;
import lobbien.advancedrefining.blocks.TileEntityRefiningForge;

public class TileEntityHandler {
	public static void registerTileEntities()
	{
		GameRegistry.registerTileEntity(TileEntityRefiningForge.class, "refining_forge");
	}
}
