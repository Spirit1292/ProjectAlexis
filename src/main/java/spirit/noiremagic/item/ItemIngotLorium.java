package spirit.noiremagic.item;

import spirit.noiremagic.item.core.ItemNM;
import spirit.noiremagic.reference.Names;

public class ItemIngotLorium extends ItemNM
{
    public ItemIngotLorium()
    {
        super();
        this.setUnlocalizedName(Names.Items.INGOT_LORIUM);
        this.maxStackSize = 64;
    }
}
