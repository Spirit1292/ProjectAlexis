package spirit.noiremagic.tomenoire;

import java.util.ArrayList;
import java.util.List;

public class TomeNoireAPI
{

    private static List<TomeNoireCategory> categories = new ArrayList<TomeNoireCategory>();
    private static List<TomeNoireEntry> allEntries = new ArrayList<TomeNoireEntry>();

    public static void addCategory(TomeNoireCategory category)
    {
        categories.add(category);
    }

    public static List<TomeNoireCategory> getAllCategories()
    {
        return categories;
    }

    public static List<TomeNoireEntry> getAllEntries()
    {
        return allEntries;
    }

    public static void addEntry(TomeNoireEntry entry, TomeNoireCategory category)
    {
        allEntries.add(entry);
        category.entries.add(entry);
    }
}
