package assignment;

import java.util.Scanner;

class Book {
    int bookId;
    String bookName;
    String author;
    String publisher;
    int quantity;

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter book id");
        bookId = sc.nextInt();
        System.out.println("Enter book name");
        bookName = sc.next();
        System.out.println("Enter author name");
        author = sc.next();
        System.out.println("Enter publisher name");
        publisher = sc.next();
        System.out.println("Enter quantity");
        quantity = sc.nextInt();
        sc.close();
    }

    public void show() {
        System.out.println("Book id: " + bookId);
        System.out.println("Book name: " + bookName);
        System.out.println("Author name: " + author);
        System.out.println("Publisher name: " + publisher);
        System.out.println("Quantity: " + quantity);
    }

    Book(int bookId, String bookName, String author, String publisher, int quantity) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
    }

    public void issue() {
        if (quantity > 0) {
            quantity--;
        } else {
            System.out.println("Book is not available");
        }
    }

    public void deposit() {
        quantity++;
    }

}

class library {

    Book[] books = new Book[10];
    int count = 0;

    public void addBook(Book b) {
        books[count] = b;
        count++;
    }

    public void showAllBooks() {
        for (int i = 0; i < count; i++) {
            books[i].show();
        }
    }

    public void issueBook(int bookId) {
        for (int i = 0; i < count; i++) {
            if (books[i].bookId == bookId) {
                books[i].issue();
            }
        }
    }

    public void depositBook(int bookId) {
        for (int i = 0; i < count; i++) {
            if (books[i].bookId == bookId) {
                books[i].deposit();
            }
        }
    }

}

public class libraryManagement {

    public static void main(String[] args) {
        Book b1 = new Book(1, "Java", "James", "Oracle", 10);
        Book b2 = new Book(2, "Python", "Guido", "Oracle", 5);
        Book b3 = new Book(3, "C++", "Bjarne", "Oracle", 15);

        b1.show();
        b2.show();
        b3.show();

        library l = new library();
        l.addBook(b1);
        l.addBook(b2);
        l.addBook(b3);

        l.showAllBooks();

        l.issueBook(1);
        l.issueBook(2);
        l.issueBook(3);

        l.showAllBooks();

        l.depositBook(1);
        l.depositBook(2);
        l.depositBook(3);

        l.showAllBooks();
        
    }

}
