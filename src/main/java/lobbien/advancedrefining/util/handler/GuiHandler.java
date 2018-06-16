package lobbien.advancedrefining.util.handler;
import lobbien.advancedrefining.blocks.ContainerRefiningForge;
import lobbien.advancedrefining.blocks.Refforgegui;
import lobbien.advancedrefining.blocks.TileEntityRefiningForge;
import lobbien.advancedrefining.util.Reference;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler
{
	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
	{
		if(ID == Reference.GUI_REFINING_FORGE) return new ContainerRefiningForge(player.inventory, (TileEntityRefiningForge)world.getTileEntity(new BlockPos(x,y,z)));
		return null;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) 
	{
		if(ID == Reference.GUI_REFINING_FORGE) return new Refforgegui(player.inventory, (TileEntityRefiningForge)world.getTileEntity(new BlockPos(x,y,z)));
		return null;
	}

}


