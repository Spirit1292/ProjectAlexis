package spirit.noiremagic.handler;

import java.io.File;

import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.Configuration;
import spirit.noiremagic.reference.Reference;

public class ConfigurationHandler 
{
    public static Configuration configuration;
    public static boolean testValue = false;

    public static void init(File configFile)
	{
		if (configuration == null)
        {
            configuration = new Configuration(configFile);
        }
	}

    @SubscribeEvent
    public void onConfigurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event)
        {
            if (event.modID.equalsIgnoreCase(Reference.MOD_ID))
            {
                loadConfiguration();
            }
        }

    public void loadConfiguration()
    {
        testValue = configuration.getBoolean("ConfigValue",Configuration.CATEGORY_GENERAL, false, "This is just test of configuration value");

        if (configuration.hasChanged())
        {
            configuration.save();
        }
    }
}