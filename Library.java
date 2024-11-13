import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(String title, String author, String isbn) {
        Book newBook = new Book(title, author, isbn);
        books.add(newBook);
        System.out.println("Book added successfully.");
    }

    public void removeBook(String isbn) {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                books.remove(book);
                System.out.println("Book removed successfully.");
                return;
            }
        }
        System.out.println("Book not found.");
    }

    public void searchBook(String query) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(query) || book.getIsbn().equals(query)) {
                System.out.println("Book found: " + book.getTitle() + " by " + book.getAuthor());
                return;
            }
        }
        System.out.println("Book not found.");
    }

    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available.");
            return;
        }
        for (Book book : books) {
            System.out.println(book.getTitle() + " by " + book.getAuthor() + " (ISBN: " + book.getIsbn() + ")");
        }
    }

    public void sortBooks() {
        for (int i = 1; i < books.size(); i++) {
            Book key = books.get(i);
            int j = i - 1;
            while (j >= 0 && books.get(j).getTitle().compareToIgnoreCase(key.getTitle()) > 0) {
                books.set(j + 1, books.get(j));
                j = j - 1;
            }
            books.set(j + 1, key);
        }
        System.out.println("Books sorted successfully.");
    }
}

