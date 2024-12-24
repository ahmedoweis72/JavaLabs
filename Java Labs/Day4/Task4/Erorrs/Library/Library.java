package Erorrs.Library;
import java.util.ArrayList;
import java.util.List;

import Clients.Clients;
import Erorrs.ItemNotFoundException;
import LibraryItems.LibraryItem;


public class Library{

    private Clients c;
    private LibraryItem l;
   
    ArrayList<LibraryItem> itemList=new ArrayList<>();
    ArrayList<Clients> clients=new ArrayList<>();
    ArrayList<Library> borrowedBokks=new ArrayList<>();
    
    public ArrayList<LibraryItem> getItemList() {
        return itemList;
    }


    public ArrayList<Clients> getClients() {
        return clients;
    }


    public ArrayList<Library> getBorrowedBokks() {
        return borrowedBokks;
    }


    public Library() {
    }


    public void displayItems(List<? extends LibraryItem> Items) {
        for (LibraryItem item : Items) {
            
            try {
                item.displayItems(item.getItemDetails(item.getId()));
            } catch (ItemNotFoundException e) {
                System.out.println(e.getMessage());
                e.printStackTrace();
            }
            
        }
    }
    public void addItems(LibraryItem item){
        itemList.add(item);
    }
    public LibraryItem retriveItem(int id) throws ItemNotFoundException{
        for (int i = 0; i < itemList.size(); i++) {
            if (itemList.get(i).getId()==id) {
                return itemList.get(i); 
                
            }
                 
            
        }
        throw new ItemNotFoundException("Item Is Not Found");
         
    }
    public void  deleteItem(int id) throws ItemNotFoundException{
        for (int i = 0; i < itemList.size(); i++) {
            if (itemList.get(i).getId()==id) {
                itemList.remove(i) ;
                
            }
                 
            
        }
        throw new ItemNotFoundException("Item Is Not Found");
    }

    public void addClient(Clients client){
        clients.add(client);
    }
    public void  deleteClient(int id) throws ItemNotFoundException{
        for (int i = 0; i < clients.size(); i++) {
            if (clients.get(i).getId()==id) {
                clients.remove(i) ;
                
            }
                 
            
        }
        throw new ItemNotFoundException("Client Is Not Found");

    }
    public Clients retriveClient(int id) throws ItemNotFoundException{
        for (int i = 0; i < clients.size(); i++) {
            if (clients.get(i).getId()==id) {
                return clients.get(i); 
                
            }
                 
            
        }
        throw new ItemNotFoundException("Client Is Not Found");
         
    }
    void getClientDetails(Clients client ){
            System.out.println("ClientsID :"+client.getId());
        System.out.println("Clients :"+client.getName());
        System.out.println("ClientsEmail :"+client.getEmail());
        
    }
    public void DisplayBorrowedItems(){
        ArrayList<LibraryItem> items=new ArrayList<>();
        for (int index = 0; index < borrowedBokks.size(); index++) {
            items.add(borrowedBokks.get(index).l);
            getClientDetails(borrowedBokks.get(index).c);
        }
        displayItems(items);
    }
    public void borrowedBokks(Clients client,LibraryItem libraryItem){
        Library library=new Library();
        library.c=client;
        library.l=libraryItem;
        borrowedBokks.add(library);
    }

}
 