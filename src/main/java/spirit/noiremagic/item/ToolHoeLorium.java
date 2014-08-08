package spirit.noiremagic.item;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemStack;
import spirit.noiremagic.creativetab.CreativeTabNM;
import spirit.noiremagic.reference.Materials;
import spirit.noiremagic.reference.Names;
import spirit.noiremagic.reference.Textures;

public class ToolHoeLorium extends ItemHoe
{
    public ToolHoeLorium()
    {
        super(Materials.Tools.LORIUM);
        this.setCreativeTab(CreativeTabNM.NM_TAB);
        this.setUnlocalizedName(Names.Tools.HOE_LORIUM);
        this.maxStackSize = 1;
    }

    @Override
    public String getUnlocalizedName()
    {
        return String.format("tool.%s%s", Textures.RESOURCE_PREFIX, getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    public String getUnlocalizedName(ItemStack itemStack)
    {
        return String.format("tool.%s%s", Textures.RESOURCE_PREFIX, getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister iconRegister)
    {
        itemIcon = iconRegister.registerIcon(this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
    }

    protected String getUnwrappedUnlocalizedName(String unlocalizedName)
    {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }

    @Override
    public boolean getShareTag()
    {
        return true;
    }

    @Override
    public boolean showDurabilityBar(ItemStack itemStack)
    {
        return false;
    }

    /**
     @Override
     public double getDurabilityForDisplay(ItemStack itemStack)
     {

     }
     */
}
