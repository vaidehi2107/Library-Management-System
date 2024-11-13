import java.util.Scanner;

public class LibraryManagementSystem{
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do{
            System.out.println("\nLibrary Management System");
            System.out.println("1. Add Book");
            System.out.println("2. Remove Book");
            System.out.println("3. Search Book");
            System.out.println("4. Display Books");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter author: ");
                    String author = scanner.nextLine();
                    System.out.print("Enter ISBN: ");
                    String isbn = scanner.nextLine();
                    library.addBook(title, author, isbn);
                    break;

                case 2:
                    System.out.print("Enter ISBN of the book to remove: ");
                    String isbnToRemove = scanner.nextLine();
                    library.removeBook(isbnToRemove);
                    break;

                case 3:
                    System.out.print("Enter title or ISBN to search: ");
                    String query = scanner.nextLine();
                    library.searchBook(query);
                    break;
                case 4:
                    library.displayBooks();
                    break;
                case 5:
                    System.out.println("Exiting the system.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }while(choice != 5);
        scanner.close();
    }
}