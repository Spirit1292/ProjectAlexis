package spirit.noiremagic.item.core;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;
import spirit.noiremagic.creativetab.CreativeTabNM;
import spirit.noiremagic.reference.Textures;
import spirit.noiremagic.utility.LogHelper;

import java.util.Set;

public class ToolNM extends ItemTool
{
    public ToolNM(float damageVsEntity, ItemTool.ToolMaterial toolMaterial, Set blocksEffectiveAgainst)
    {
        super(damageVsEntity,toolMaterial, blocksEffectiveAgainst);
        this.setCreativeTab(CreativeTabNM.NM_TAB);
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
        LogHelper.info("Icon for tools : " + itemIcon.getIconName());
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
        return true;
    }

    @Override
    public double getDurabilityForDisplay(ItemStack itemStack)
    {
        return 1d;
    }
}

