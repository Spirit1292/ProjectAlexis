package spirit.noiremagic.reference;

import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;

public class Materials
{
    public static final class Tools
    {
        public static final Item.ToolMaterial LORIUM = EnumHelper.addToolMaterial(Names.Materials.LORIUM, 3, 500, 6F, 2F, 7);
        //LORIUM(2, 500, 6F, 2, 14);
    }

    public static final class Armor
    {
        public static final ItemArmor.ArmorMaterial LORIUM = EnumHelper.addArmorMaterial(Names.Materials.LORIUM, 0, new int[]{2, 6, 4 ,2}, 0);
    }
}
