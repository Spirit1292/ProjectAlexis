package spirit.noiremagic.init;

import cpw.mods.fml.common.registry.GameRegistry;
import spirit.noiremagic.item.*;
import spirit.noiremagic.reference.Names;
import spirit.noiremagic.reference.Reference;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems
{
    // Adding a lot of some items
    public static final ItemIngotLorium ingotLorium = new ItemIngotLorium();
    public static final ItemNuggetLorium nuggetLorium = new ItemNuggetLorium();
    public static final ToolPickaxeLorium pickaxeLorium = new ToolPickaxeLorium();
    //public static final ToolSwordLorium swordLorium = new ToolSwordLorium();
    public static final ToolAxeLorium axeLorium = new ToolAxeLorium();
    public static final ToolShovelLorium shovelLorium = new ToolShovelLorium();
    //public static final ToolHoeLorium hoeLorium = new ToolHoeLorium();

    public static void init()
    {
        // Add items in Minecraft
        GameRegistry.registerItem(ingotLorium, Names.Items.INGOT_LORIUM);
        GameRegistry.registerItem(nuggetLorium, Names.Items.NUGGET_LORIUM);
        GameRegistry.registerItem(pickaxeLorium, Names.Tools.PICKAXE_LORIUM);
        GameRegistry.registerItem(shovelLorium, Names.Tools.SHOVEL_LORIUM);
        GameRegistry.registerItem(axeLorium, Names.Tools.AXE_LORIUM);

    }
}
