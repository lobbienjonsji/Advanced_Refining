package lobbien.advancedrefining.init;

import java.util.ArrayList;
import java.util.List;

import lobbien.advancedrefining.blocks.BlockBase;
import lobbien.advancedrefining.blocks.RefiningForgeBlock;
import lobbien.advancedrefining.blocks.UnrefIronBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks 
{
	public static final  List <Block> BLOCKS = new ArrayList<Block>();
	
	
	public static final Block UNREFINED_IRON_BLOCK = new UnrefIronBlock("unrefined_iron_block", Material.IRON);
	public static final Block REFINING_FORGE = new RefiningForgeBlock("refining_forge", Material.ROCK);
	
}
