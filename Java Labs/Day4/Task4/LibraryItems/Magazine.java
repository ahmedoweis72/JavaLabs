package LibraryItems;
import Erorrs.ItemNotFoundException;

public class Magazine  extends LibraryItem{

    public Magazine (String id,String title){
        super(id, title);
    }
    @Override
    public LibraryItem getItemDetails(String id)  throws ItemNotFoundException{
        if (this.getId()==id) {
            return this;
        }
           throw new ItemNotFoundException("Magazine Is Not Found");  
    }
    @Override
    public void displayItems(LibraryItem item){
        
            System.out.println("MagazineId Is :"+item.getId());
            System.out.println("MagazineTitle Is :"+item.getTitle());
        
    }
    
    @Override
    public String toString() {
        return "Magazine []"+this.getId()+"\n"+this.getTitle();
    }
   
    
}
