package day8.LibraryManagementSystem;

class Admin extends library {
    // call super class constructor
    public Admin() {
        super();
    }

    void defaultBooks() {
        Book b1 = new Book(1, "Java", "James Gosling", "Oracle", 10);
        Book b2 = new Book(2, "C++", "Bjarne Stroustrup", "Oracle", 10);
        Book b3 = new Book(3, "Python", "Guido van Rossum", "Oracle", 10);
        Book b4 = new Book(4, "C", "Dennis Ritchie", "Oracle", 10);
        Book b5 = new Book(5, "JavaScript", "Brendan Eich", "Oracle", 10);
        addBook(b1);
        addBook(b2);
        addBook(b3);
        addBook(b4);
        addBook(b5);

    }

    // Shows all books of library along with availability.
    void showAll() {
        showAllBooks();

    }

    // Admin can add book.
    void addBook(String book) {
        // If book already exists in AllBooks ArrayList, it will throw
        // invalidBookException.
        try {
            // if (book.exists() )
            {
                throw new invalidBookException("This book is already available in the library");
            }

        } catch (invalidBookException e) {
            System.out.println("invalidBookException occured:" + e);
        }
    };

    class invalidBookException extends Exception {
        public invalidBookException(String str) {
            super(str);
        }
    }

    // Admin can remove book.
    void removeBook(String book) {
        try {
            // if(!book.exists())
            // If book does not exist in AllBooks ArrayList, it will throw
            // invalidBookException.
            {
                throw new invalidBookException("This book is not available in the library");
            }
        } catch (invalidBookException e) {
            System.out.println("invalidBookException occured:" + e);
        }
    };

}
