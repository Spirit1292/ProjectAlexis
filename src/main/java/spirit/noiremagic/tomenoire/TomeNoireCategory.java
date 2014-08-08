package spirit.noiremagic.tomenoire;

import java.util.ArrayList;
import java.util.List;

public class TomeNoireCategory
{
    public final String unlocalizedName;

    public final List<TomeNoireEntry> entries = new ArrayList<TomeNoireEntry>();

    public TomeNoireCategory(String unlocalizedName) {
        this.unlocalizedName = unlocalizedName;
    }

    public String getUnlocalizedName() {
        return unlocalizedName;
    }
}
