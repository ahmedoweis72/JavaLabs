import java.util.InputMismatchException;
import java.util.Scanner;

import Clients.Clients;
import Erorrs.ItemNotFoundException;
import Library.Library;
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
            System.out.println("7. Update Items");
            System.out.println("8. Add Client");
            System.out.println("9. Update Client");
            System.out.println("10. Exit");
            System.out.print("Choose an option: ");

            String choice = scanner.next();
            scanner.nextLine();

            switch (choice) {
                case "1":
                    try {
                        library.displayItems(library.getItemList());
                    } catch (ItemNotFoundException e) {
                        System.out.println(e.getMessage());
                    }

                    break;
                case "2":
                    try {
                        library.DisplayBorrowedItems();
                    } catch (ItemNotFoundException e) {
                        System.out.println(e.getMessage());

                    }

                    break;
                case "3":
                    while (true) {
                        System.out.print("Enter Item ID to Retrieve: ");
                        String id = scanner.nextLine();
                        if (library.isId(id)) {

                            try {
                                LibraryItem item = library.retriveItem(id);
                                System.out.println("Item Details: " + item.getItemDetails(id));
                                break;
                            } catch (ItemNotFoundException e) {
                                System.out.println(e.getMessage());
                            }
                        }
                    }
                    break;
                case "4":
                    while (true) {
                        System.out.print("Enter Book ID: ");
                        String bookId = scanner.nextLine();
                        scanner.nextLine();
                        System.out.print("Enter Book Title: ");
                        String bookTitle = scanner.nextLine();
                        System.out.print("Enter Book Author: ");
                        String bookAuthor = scanner.nextLine();
                        if (library.isId(bookId) && library.isString(bookAuthor) && library.isString(bookTitle)) {
                            library.addItems(new Book(bookId, bookTitle, bookAuthor));
                            System.out.println("Book added successfully.");
                            break;
                        } else {
                            System.out.println("Somthing Wrong Cheak your Inputs");
                        }

                    }
                    break;
                case "5":
                    while (true) {
                        System.out.println("Enter Magazine ID: ");
                        String MagazineId = scanner.nextLine();

                        if (library.isId(MagazineId)) {
                            System.out.print("Enter Magazine Title: ");
                            String MagazineTitle = scanner.nextLine();
                            if (library.isString(MagazineTitle)) {
                                library.addItems(new Magazine(MagazineId, MagazineTitle));
                                System.out.println("Book added successfully.");
                                break;
                            } else {
                                System.out.println("Enter Valid Title");
                            }

                        } else {
                            System.out.println("Enter Valid Id ");
                        }

                    }

                    break;
                case "6":
                    while (true) {
                        System.out.print("Enter Client Name: ");
                        String clientName = scanner.nextLine();

                        System.out.print("Enter Client Email: ");
                        String clientEmail = scanner.nextLine();
                        System.out.print("Enter Client ID: ");
                        String clientId = scanner.nextLine();
                        Clients client = new Clients(clientName, clientEmail, clientId);
                        System.out.print("Enter Item ID to Borrow: ");
                        String borrowId = scanner.nextLine();
                        if (library.isString(clientName) && library.isEmail(clientEmail) && library.isId(clientId)) {
                            try {
                                LibraryItem borrowItem = library.retriveItem(borrowId);
                                library.borrowedBokks(client, borrowItem);
                                System.out.println("Item borrowed successfully.");
                                break;
                            } catch (ItemNotFoundException e) {
                                System.out.println(e.getMessage());
                            }
                        } else {
                            System.out.println("Somthing Wrong Cheak your Inputs");
                        }
                    }
                    break;
                case "7":
                    System.out.println("Enter Item Id");
                    String ItemId = scanner.nextLine();
                    while (true) {
                        System.out.println("Enter New Title ");
                        String itemString = scanner.next();
                        if (library.isString(itemString)) {
                            library.UpdateItem(ItemId, itemString);
                            break;
                        } else {
                            System.out.println("Enter Valid Title");
                        }
                    }

                    break;
                case "8":
                    Clients c = new Clients();
                    while (true) {
                        System.out.println("Enter Your Id :");
                        c.setId(scanner.nextLine());
                        System.out.println("Enter Your Email :");
                        c.setEmail(scanner.next());
                        System.out.println("Enter Your Name :");
                        c.setName(scanner.next());
                        if (library.isId(c.getId())&&library.isEmail(c.getEmail())&&library.isString(c.getName())) {
                            library.addClient(c);
                            break;
                        }else{
                            System.out.println("Somthing wrong Enter Valid Values");
                        }
                    }

                    break;
                case "9":
                    while (true) {
                        
                    
                    System.out.println("Enter Your Id :");
                    String Id = scanner.nextLine();
                    if (library.isId(Id)) {
                        try {
                            library.retriveClient(Id);
                            System.out.println("Enter Your Email :");
                            String Email = scanner.next();
                            System.out.println("Enter Your Name :");
                            String name = scanner.next();
                            library.UpdatClient(Id, name, Email);
                        } catch (ItemNotFoundException e) {
                            System.out.println(e.getMessage());
                        }
                        break;
                    }else{
                        System.out.println("Enter Valid Id ");
                    }
                    
                }
                    break;
                case "10":
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}