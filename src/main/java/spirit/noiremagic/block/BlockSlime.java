package spirit.noiremagic.block;

public class BlockSlime extends BlockNM
{
    public BlockSlime()
    {
        super();
        this.setBlockName("blockSlime");
        this.setHarvestLevel("pickaxe", 2);
    }

    public String getBreakSound()
    {
        return "dig.wool";
    }

}
