package Constructor.March17;

public class LibraryTest {
    public static void main(String[] args) {
        Library myBook = new Library("war and peace","Tolstoy","01242321",1200,true,"03/23/2020","24/03/2020");
        System.out.println(myBook.toString());
        myBook.borrowBook("3/18/2020");
        System.out.println(myBook.getBorrowDate());
        System.out.println(myBook.isAvailable());
        myBook.borrowBook("3/18/2020");
        myBook.returnBook("03/20/2020");
        System.out.println(myBook.isAvailable());
    }


}
