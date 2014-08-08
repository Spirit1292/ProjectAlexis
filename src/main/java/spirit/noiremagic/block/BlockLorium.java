package spirit.noiremagic.block;

public class BlockLorium extends BlockNM
{
    public BlockLorium()
    {
        super();
        this.setBlockName("blockLorium");
        /**
         *      0 = wood/gold
         *      1 = stone
         *      2 = iron
         *      3 = diamond
         */
        this.setHarvestLevel("pickaxe", 2) ;
        this.setHardness(5);
    }

    public String getBreakSound()
    {
        return "dig.iron";
    }
}

