package spirit.noiremagic.init;

import cpw.mods.fml.common.Mod;
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
        // Shaped Recipes
        // Lorium pickaxe
        GameRegistry.addRecipe(new ItemStack(ModItems.pickaxeLorium),
                "lll", " s ", " s ",
                's', new ItemStack(Items.stick),
                'l', new ItemStack(ModItems.ingotLorium));

        // Lorium shovel
        GameRegistry.addRecipe(new ItemStack(ModItems.shovelLorium),
                " l ", " s ", " s ",
                's', new ItemStack(Items.stick),
                'l', new ItemStack(ModItems.ingotLorium));

        // Lorium axe
        GameRegistry.addRecipe(new ItemStack(ModItems.axeLorium),
                "ll ", "ls ", " s ",
                's', new ItemStack(Items.stick),
                'l', new ItemStack(ModItems.ingotLorium));

        // Lorium sword
        GameRegistry.addRecipe(new ItemStack(ModItems.swordLorium),
                " l ", " l ", " s ",
                's', new ItemStack(Items.stick),
                'l', new ItemStack(ModItems.ingotLorium));

        // Lorium hoe
        GameRegistry.addRecipe(new ItemStack(ModItems.hoeLorium),
                "ll ", " s ", " s ",
                's', new ItemStack(Items.stick),
                'l', new ItemStack(ModItems.ingotLorium));

        // Block of lorium
        GameRegistry.addRecipe(new ItemStack(ModBlocks.blockLorium),
                "lll", "lll", "lll",
                'l', new ItemStack(ModItems.ingotLorium));

        // 9 x Lorium nuggets > Lorium ingot
        GameRegistry.addRecipe(new ItemStack(ModItems.ingotLorium),
                "nnn", "nnn", "nnn",
                'n', new ItemStack(ModItems.nuggetLorium));

        // Shapeless recipes
        // Lorium ingot
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.ingotLorium),
                new ItemStack(Items.diamond),
                new ItemStack(Items.iron_ingot));

        // Block of lorium > 9 x Lorium ingot
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.ingotLorium, 9),
                new ItemStack(ModBlocks.blockLorium));

        // Lorium ingot > 9 x Lorium nuggets
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.nuggetLorium, 9),
                new ItemStack(ModItems.ingotLorium));

        // Shaped ore recipes
        // Diamond
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.diamond),
                "sss", " s ", " s ",
                's', "stickWood"));

        // Shapeless ore recipes
        // Dragon egg
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Blocks.dragon_egg),
                "gemDiamond",
                "ingotIron",
                "ingotGold"));
    }
}
