package spirit.noiremagic.creativetab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import spirit.noiremagic.init.ModBlocks;
import spirit.noiremagic.init.ModItems;
import spirit.noiremagic.reference.Reference;

public class CreativeTabNM
{
    public static final CreativeTabs NM_TAB = new CreativeTabs(Reference.MOD_ID.toLowerCase())
    {
        @Override
        public Item getTabIconItem()
        {
            return ModItems.ingotLorium;
        }
    };
}
