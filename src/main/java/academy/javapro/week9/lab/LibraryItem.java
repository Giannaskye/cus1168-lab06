package academy.javapro.week9.lab;

/**
 * Interface for library items with common methods for all library items.
 */
public interface LibraryItem {
    /**
     * Abstract method to get title of the library item.
     * 
     * @return the title as a String
     */
    public abstract String getTitle();

    /**
     * Abstract method that gets the type of the library item (e.g., "Book",
     * "Magazine").
     * 
     * @return the item type as a String
     */
    public abstract String getItemType();

    /**
     * Abstract method that gets a unique identifier for the library item.
     * 
     * @return the unique identifier as a String
     */
    public abstract String getUniqueIdentifier();

}
