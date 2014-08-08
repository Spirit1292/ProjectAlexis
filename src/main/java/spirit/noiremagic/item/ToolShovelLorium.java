package spirit.noiremagic.item;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import spirit.noiremagic.item.core.ToolNM;
import spirit.noiremagic.reference.Materials;
import spirit.noiremagic.reference.Names;
import net.minecraft.block.Block;
import java.util.Set;

public class ToolShovelLorium extends ToolNM
{
    private static final Set blocksEffectiveAgainst = Sets.newHashSet(new Block[]
            {
                    Blocks.grass,
                    Blocks.dirt,
                    Blocks.sand,
                    Blocks.gravel,
                    Blocks.snow_layer,
                    Blocks.snow,
                    Blocks.clay,
                    Blocks.farmland,
                    Blocks.soul_sand,
                    Blocks.mycelium
            });

    public ToolShovelLorium() {
        super(2f, Materials.Tools.LORIUM, blocksEffectiveAgainst);
        this.setUnlocalizedName(Names.Tools.SHOVEL_LORIUM);
    }

    @Override
    public boolean func_150897_b(Block block)
    {
        return block == Blocks.snow_layer ? true : block == Blocks.snow;
    }

    @Override
    public Set<String> getToolClasses(ItemStack itemStack)
    {
        return ImmutableSet.of("shovel");
    }

}
