package LibraryItems;
import Erorrs.ItemNotFoundException;

public abstract class LibraryItem {
    private final int id;
    private String title;
   







    public LibraryItem(int id, String title) {
        this.id = id;
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }       

    public void setTitle(String title) {
        this.title = title;
    }

    public abstract LibraryItem getItemDetails(int id) throws ItemNotFoundException;
    public abstract void displayItems(LibraryItem item );
}
