package spirit.noiremagic;

import cpw.mods.fml.common.FMLCommonHandler;
import spirit.noiremagic.handler.ConfigurationHandler;
import spirit.noiremagic.init.ModBlocks;
import spirit.noiremagic.init.ModItems;
import spirit.noiremagic.init.Recipes;
import spirit.noiremagic.proxy.IProxy;
import spirit.noiremagic.reference.Reference;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import spirit.noiremagic.utility.LogHelper;

@Mod(modid=Reference.MOD_ID, name=Reference.MOD_NAME, version=Reference.VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)
public class NoireMagic 
{
	@Mod.Instance(Reference.MOD_ID)
	public static NoireMagic instance;
	
	@SidedProxy(clientSide=Reference.CLIENT_PROXY_CLASS, serverSide=Reference.SERVER_PROXY_CLASS)
	public static IProxy proxy;
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event)
	    {
            //Initialization of configuration file
            ConfigurationHandler.init(event.getSuggestedConfigurationFile());
            FMLCommonHandler.instance().bus().register(new ConfigurationHandler());

            //Initialization of mod items
            ModItems.init();

            //Initialization of mod blocks
            ModBlocks.init();

            LogHelper.info("Pre Initialization Complete");
	    }
	
	@Mod.EventHandler
    public void Init(FMLInitializationEvent event)
	    {
            //Initialization of mod recipes
            Recipes.init();
            LogHelper.info("Initialization Complete");

	    }
	
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event)
	    {
            LogHelper.info("Post Initialization Complete");
	    }
}
