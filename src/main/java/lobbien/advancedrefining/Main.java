package lobbien.advancedrefining;

import lobbien.advancedrefining.init.ModRecipes;
import lobbien.advancedrefining.proxy.CommonProxy;
import lobbien.advancedrefining.util.Reference;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;


@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION )
public class Main {
	
	@Instance
	public static Main instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
	public static CommonProxy proxy;

	@EventHandler
	public static void PreInit(FMLPreInitializationEvent event)
	{
		
	}
	@EventHandler
	public static void PreInit(FMLInitializationEvent event)
	{
		ModRecipes.init();
	}
	@EventHandler
	public static void PreInit(FMLPostInitializationEvent event)
	{
		
	}
}
