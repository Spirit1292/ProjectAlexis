package spirit.noiremagic.init;

import cpw.mods.fml.common.registry.GameRegistry;
import spirit.noiremagic.block.BlockLoriumBlock;
import spirit.noiremagic.reference.Reference;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks
{
    public static final BlockLoriumBlock blockOfLorium = new BlockLoriumBlock();

    public static void init()
    {
        GameRegistry.registerBlock(blockOfLorium, "BlockOfLorium");
    }
}

