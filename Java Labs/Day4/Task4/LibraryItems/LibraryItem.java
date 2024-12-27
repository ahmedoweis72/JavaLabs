package LibraryItems;

import Erorrs.ItemNotFoundException;

public abstract class LibraryItem {
    private final String id;
    private String title;

    public LibraryItem(String id, String title) {
        this.id = id;
        this.title = title;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    

    public abstract LibraryItem getItemDetails(String id) throws ItemNotFoundException;

    public abstract void displayItems(LibraryItem item);
}
