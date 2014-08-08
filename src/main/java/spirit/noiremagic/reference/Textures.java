package spirit.noiremagic.reference;

import net.minecraft.util.ResourceLocation;
import spirit.noiremagic.utility.ResourceLocationHelper;

public final class Textures
{
    public static final String RESOURCE_PREFIX = Reference.MOD_ID.toLowerCase() + ":";

    public static final class Armor
    {
        private static final String ARMOR_SHEET_LOCATION = "textures/armor/";
    }

    public static final class Blocks
    {
        private static final String BLOCKS_LOCATION = "textures/blocks";
        public static final ResourceLocation BLOCK_LORIUM =
                ResourceLocationHelper.getResourceLocation(BLOCKS_LOCATION + "blockLorium.png");
    }

    public static final class Effects
    {
        private static final String EFFECTS_LOCATION = "textures/effects";
    }

    public static final class Gui
    {
        private static final String GUI_SHEET_LOCATION = "textures/gui";
    }

    public static final class Items
    {
        private static final String ITEMS_LOCATION = "textures/items";
        public static final ResourceLocation INGOT_LORIUM =
                ResourceLocationHelper.getResourceLocation(ITEMS_LOCATION + "ingotLorium.png");
    }

    public static final class Model
    {
        private static final String MODEL_TEXTURE_LOCATION = "textures/models/";
    }
}
