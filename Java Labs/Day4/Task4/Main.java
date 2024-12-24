import java.util.Scanner;

import Clients.Clients;
import Erorrs.ItemNotFoundException;
import Erorrs.Library.Library;
import LibraryItems.Book;
import LibraryItems.LibraryItem;
import LibraryItems.Magazine;

public class Main {
    public static void main(String[] args) {
         Library library = new Library();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nLibrary Management System");
            System.out.println("1. Display Items");
            System.out.println("2. Display Borrowed Items");
            System.out.println("3. Retrieve Item by ID");
            System.out.println("4. Add Book");
            System.out.println("5. Add Magazine");
            System.out.println("6. Add Borrowed Item");
            System.out.println("7. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    library.displayItems(library.getItemList());
                    break;
                case 2:
                    library.DisplayBorrowedItems();
                    break;
                case 3:
                    System.out.print("Enter Item ID to Retrieve: ");
                    int id = scanner.nextInt();
                    try {
                        LibraryItem item = library.retriveItem(id);
                        System.out.println("Item Details: " + item.getItemDetails(id));
                    } catch (ItemNotFoundException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 4:
                    System.out.print("Enter Book ID: ");
                    int bookId = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter Book Title: ");
                    String bookTitle = scanner.nextLine();
                    library.addItems(new Book(bookId, bookTitle));
                    System.out.println("Book added successfully.");
                    break;
                case 5:
                    System.out.print("Enter Magazine ID: ");
                    int magId = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter Magazine Title: ");
                    String magTitle = scanner.nextLine();
                    library.addItems(new Magazine(magId, magTitle));
                    System.out.println("Magazine added successfully.");
                    break;
                case 6:
                    System.out.print("Enter Client Name: ");
                    String clientName = scanner.nextLine();
                    System.out.print("Enter Client Email: ");
                    String clientEmail = scanner.nextLine();
                    System.out.print("Enter Client ID: ");
                    int clientId = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    Clients client = new Clients(clientName, clientEmail, clientId);
                    System.out.print("Enter Item ID to Borrow: ");
                    int borrowId = scanner.nextInt();
                    try {
                        LibraryItem borrowItem = library.retriveItem(borrowId);
                        library.borrowedBokks(client, borrowItem);
                        System.out.println("Item borrowed successfully.");
                    } catch (ItemNotFoundException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 7:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    
        
    }
}
