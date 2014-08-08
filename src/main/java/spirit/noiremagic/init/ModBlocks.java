package spirit.noiremagic.init;

import cpw.mods.fml.common.registry.GameRegistry;
import spirit.noiremagic.block.BlockLorium;
import spirit.noiremagic.block.BlockSlime;
import spirit.noiremagic.reference.Reference;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks
{
    // Adding a lot of some blocks
    public static final BlockLorium blockLorium = new BlockLorium();
    public static final BlockSlime blockSlime = new BlockSlime();

    public static void init()
    {
        // Add blocks in Minecraft
        GameRegistry.registerBlock(blockLorium, "BlockLorium");
        GameRegistry.registerBlock(blockSlime, "BlockSlime");
    }
}

