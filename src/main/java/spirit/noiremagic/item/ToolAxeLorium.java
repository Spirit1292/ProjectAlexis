package spirit.noiremagic.item;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import spirit.noiremagic.item.core.ToolNM;
import spirit.noiremagic.reference.Materials;
import spirit.noiremagic.reference.Names;

import java.util.Set;

public class ToolAxeLorium extends ToolNM
{
    private static final Set blocksEffectiveAgainst = Sets.newHashSet(new Block[]
            {
                    Blocks.planks,
                    Blocks.bookshelf,
                    Blocks.log,
                    Blocks.log2,
                    Blocks.chest,
                    Blocks.pumpkin,
                    Blocks.lit_pumpkin
            });

    public ToolAxeLorium()
    {
        super(3F, Materials.Tools.LORIUM, blocksEffectiveAgainst);
        this.setUnlocalizedName(Names.Tools.AXE_LORIUM);
    }

    @Override
    public float func_150893_a(ItemStack itemStack, Block block)
    {
        return block.getMaterial() != net.minecraft.block.material.Material.wood && block.getMaterial() != net.minecraft.block.material.Material.plants && block.getMaterial() != net.minecraft.block.material.Material.vine ? super.func_150893_a(itemStack, block) : this.efficiencyOnProperMaterial;
    }

    @Override
    public Set<String> getToolClasses(ItemStack itemStack)
    {
        return ImmutableSet.of("axe");
    }
}
