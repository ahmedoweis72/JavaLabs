package Library;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import Clients.Clients;
import Erorrs.ItemNotFoundException;
import LibraryItems.LibraryItem;

public class Library {

    private Clients c;
    private LibraryItem l;

    ArrayList<LibraryItem> itemList = new ArrayList<>();
    ArrayList<Clients> clients = new ArrayList<>();
    ArrayList<Library> borrowedBoksLIst = new ArrayList<>();

    public ArrayList<LibraryItem> getItemList() {
        return itemList;
    }

    public ArrayList<Clients> getClients() {
        return clients;
    }

    public ArrayList<Library> getBorrowedBokks() {
        return borrowedBoksLIst;
    }

    public Library() {
    }

    public void displayItems(List<? extends LibraryItem> Items) throws ItemNotFoundException {
        if (Items.isEmpty()) {
            throw new ItemNotFoundException("No Items to Show ");
        }
        for (LibraryItem item : Items) {

            try {
                item.displayItems(item.getItemDetails(item.getId()));
            } catch (ItemNotFoundException e) {
                System.out.println(e.getMessage());
                e.printStackTrace();
            }

        }
    }

    public void addItems(LibraryItem item) {
        itemList.add(item);
    }

    public LibraryItem retriveItem(String id) throws ItemNotFoundException {
        if (!itemList.isEmpty()) {

            for (int i = 0; i < itemList.size(); i++) {
                if (itemList.get(i).getId() == id) {
                    return itemList.get(i);

                }

            }
            throw new ItemNotFoundException("Item Is Not Found");
        }
        throw new ItemNotFoundException("  No Item Found");

    }

    public void deleteItem(String id) throws ItemNotFoundException {
        for (int i = 0; i < itemList.size(); i++) {
            if (itemList.get(i).getId() == id) {
                itemList.remove(i);

            }

        }
        throw new ItemNotFoundException("Item Is Not Found");
    }

    public void addClient(Clients client) {
        clients.add(client);
    }

    public void deleteClient(String id) throws ItemNotFoundException {
        for (int i = 0; i < clients.size(); i++) {
            if (clients.get(i).getId() == id) {
                clients.remove(i);

            }

        }
        throw new ItemNotFoundException("Client Is Not Found");

    }

    // public Clients retriveClient(int id) throws ItemNotFoundException {
    // for (int i = 0; i < clients.size(); i++) {
    // if (clients.get(i).getId() == id) {
    // return clients.get(i);

    // }

    // }
    // throw new ItemNotFoundException("Client Is Not Found");

    // }

    void getClientDetails(Clients client) {
        System.out.println("ClientsID :" + client.getId());
        System.out.println("Clients :" + client.getName());
        System.out.println("ClientsEmail :" + client.getEmail());

    }

    public void DisplayBorrowedItems() throws ItemNotFoundException {
        if (!borrowedBoksLIst.isEmpty()) {

            borrowedBoksLIst.stream()
                    .forEach(item -> getClientDetails(item.c));
            List<LibraryItem> borrowedItems = borrowedBoksLIst.stream()
                    .map(item -> item.l).collect(Collectors.toList());
            displayItems(borrowedItems);
        } else {

            throw new ItemNotFoundException("No Items To Show");
        }
    }

    public void borrowedBokks(Clients client, LibraryItem libraryItem) {
        Library library = new Library();
        library.c = client;
        library.l = libraryItem;
        borrowedBoksLIst.add(library);
    }

    public void UpdateItem(String id, String title) {
        try {
            retriveItem(id).setTitle(title);
        } catch (ItemNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void UpdatClient(String id, String title, String Email) {
        try {
            retriveClient(id).setName(title);
            retriveClient(id).setEmail(Email);
        } catch (ItemNotFoundException e) {
            e.printStackTrace();
        }
    }

    public Clients retriveClient(String id) throws ItemNotFoundException {
        if (!clients.isEmpty()) {

            for (int i = 0; i < clients.size(); i++) {
                if (clients.get(i).getId() == id) {
                    return clients.get(i);

                }

            }
            throw new ItemNotFoundException("Client Is Not Found");
        }
        throw new ItemNotFoundException("  No Client Yet");

    }

    public boolean isId(String id) {
        String regex = "^[0-9]+$";
        return Pattern.matches(regex, id);
    }
    public boolean isString(String string) {
        String regex = "^[a-zA-Zs.,!?'-]*$";
        return Pattern.matches(regex, string);
       
    }
    public boolean isEmail(String email) {
        String regex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+.[a-zA-Z]{2,}$";
            return Pattern.matches(regex, email);

}}
