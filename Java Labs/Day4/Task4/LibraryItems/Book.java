package LibraryItems;
import Erorrs.ItemNotFoundException;

public class Book extends LibraryItem {

    public Book(int id,String title){
        super(id, title);
    }
    @Override
    public LibraryItem getItemDetails(int id) throws ItemNotFoundException {
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
