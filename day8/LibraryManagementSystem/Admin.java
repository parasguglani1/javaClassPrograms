package day8.LibraryManagementSystem;

class Admin extends library {

    void defaultBooks() {

    }

    // Shows all books of library along with availability.
    void showAll() {

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
