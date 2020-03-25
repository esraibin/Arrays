package Constructor.March17;

public class Library {
    private String bookTitle;
    private String bookAuthor;
    //we assume some ISBN start with 0
    private String ISBN;
    private int numOfPages;
    private boolean available;
    private String borrowDate;
    private String returnDate;

    public Library(){

    }
    public Library(String bookTitle,String bookAuthor,String ISBN, int numOfPages, boolean available,String borrowDate,String returnDate){
     this.bookTitle=bookTitle;
     this.bookAuthor=bookAuthor;
     this.ISBN=ISBN;
     this.numOfPages=numOfPages;
     this.available=available;
     this.borrowDate=borrowDate;
     this.returnDate=returnDate;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public int getNumOfPages() {
        return numOfPages;
    }

    public void setNumOfPages(int numOfPages) {
        this.numOfPages = numOfPages;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public String getBorrowDate() {
        return borrowDate;
    }

    public void setBorrowDate(String borrowDate) {
        this.borrowDate = borrowDate;
    }

    public String getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
    }

    @Override
    public String toString() {
        return "Library{" +
                "bookTitle='" + bookTitle + '\'' +
                ", bookAuthor='" + bookAuthor + '\'' +
                ", ISBN='" + ISBN + '\'' +
                ", numOfPages=" + numOfPages +
                ", available=" + available +
                ", borrowDate='" + borrowDate + '\'' +
                ", returnDate='" + returnDate + '\'' +
                '}';
    }
    public void borrowBook(String date){
        if(this.available){
            this.available=false;

            String []arr = date.split("/");
            int month = Integer.parseInt(arr[0]);// like Math.random()
            int day =Integer.parseInt(arr[1]);
            if((month>0 && month<13) &&(day>0 && day<32)){
                this.borrowDate=date;
            }
            else{
                System.out.println("Date is not correct");
            }

        }
        else{
            System.out.println("Book is not available");
        }

    }
    public void returnBook(String date){
        this.available= true;
         String dateArr[] = date.split("/");
         int month = Integer.parseInt(dateArr[0]);
         int day = Integer.parseInt(dateArr[1]);
         if((month>0 && month<13) && (day>0 && day<32)){
             this.returnDate =date ;
         }
         else{
             System.out.println("Date is wrong");
         }

    }

}
