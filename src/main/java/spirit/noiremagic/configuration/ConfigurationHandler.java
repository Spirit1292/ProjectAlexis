package spirit.noiremagic.configuration;

import java.io.File;
import net.minecraftforge.common.config.Configuration;

public class ConfigurationHandler 
{
	public static void init(File configFile)
	{
		Configuration configuration = new Configuration();
		
		try
		{
			configuration.load();
			boolean configValue = configuration.get(Configuration.CATEGORY_GENERAL, "configValue = ", true, "This is example value").getBoolean(true); 
		}
		catch (Exception e)
		{
			System.out.printf("Unable load the preferences!");
		}
		finally
		{
            configuration.save();
		}
			
	}

}
