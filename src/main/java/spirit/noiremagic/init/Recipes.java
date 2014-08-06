package spirit.noiremagic.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

public class Recipes
{
    public static void init()
    {
        //Shaped Recipes
        //Test Pickaxe
        GameRegistry.addRecipe(new ItemStack(ModItems.testPickaxe),
                "lll", " s ", " s ",
                's', new ItemStack(Items.stick),
                'l', new ItemStack(ModItems.lorium));

        //Block of Lorium
        GameRegistry.addRecipe(new ItemStack(ModBlocks.blockOfLorium),
                "lll", "lll", "lll",
                'l', new ItemStack(ModItems.lorium));

        //Shapeless recipes
        //Lorium
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.lorium),
                new ItemStack(Items.diamond),
                new ItemStack(Items.iron_ingot));

        //Shaped ore recipes
        //Test Pickaxe
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.diamond),
                "sss", " s ", " s ",
                's', "stickWood"));

        //Shapeless ore recipes
        //Lorium
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Blocks.dragon_egg),
                "gemDiamond",
                "ingotIron",
                "ingotGold"));
    }
}
