package LibraryItems;
import Erorrs.ItemNotFoundException;

public class Book extends LibraryItem {
    private String author;
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public Book(String id,String title,String author){
        super(id, title);
        this.author=author;
    }
    @Override
    public LibraryItem getItemDetails(String id) throws ItemNotFoundException {
        if (this.getId()==id) {
            return this;
        }
        throw new ItemNotFoundException("Book Is Not Found");
           }
    @Override
    public void displayItems(LibraryItem item){
        
        System.out.println("BookId Is :"+item.getId());
        System.out.println("BookTitle Is :"+item.getTitle());
    
}
    @Override
    public String toString() {
        return "Book []"+this.getId()+"\n"+this.getTitle();
    }




    
}
