package spirit.noiremagic.init;

import cpw.mods.fml.common.registry.GameRegistry;
import spirit.noiremagic.item.ItemLorium;
import spirit.noiremagic.item.ItemTestPickaxe;
import spirit.noiremagic.reference.Reference;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems
{
    public static final ItemLorium lorium = new ItemLorium();
    public static final ItemTestPickaxe testPickaxe = new ItemTestPickaxe();

    public static void init()
    {
        GameRegistry.registerItem(lorium, "Lorium");
        GameRegistry.registerItem(testPickaxe, "TestPickaxe");
    }
}
