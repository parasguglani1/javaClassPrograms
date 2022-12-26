package day8.LibraryManagementSystem;

public

class library {
    //constructor
    public library() {
        System.out.println("Library constructor");
    }

    Book[] books = new Book[1000];
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
