class Book {
    static int totalBook;
    String title;
    String author;
    int isbn;
    boolean isBorrowed;
    //static Block:
    static{
        totalBook=0;
    }
    //InIt Block
    { // not class init but object init
        totalBook++;
    }
    Book(String title, String author, int isbn){
        this.title=title;
        this.author=author;
        this.isbn=isbn;
    }
    Book(int isbn){
        this("UNKNOWN", "UNKNOWN", isbn);
        if(isbn==1){
            this.title="The deathly HAllows";
            this.author="J.K.Rowling";
        }else if(isbn==2){
            this.title="A Games of Thrones";
            this.author="R.R.Martin";
        }
    }
    static void getTotalBooks(){
        System.out.println("The Total no of books assigned is: "+totalBook);
    }
    void borrowBook(){
        if(isBorrowed){
            System.out.println("The Book title "+title+" is already Borrowed");
        }else{
            isBorrowed=true;
            System.out.println("The Book title "+title+" is assigned to you..Enjoy");
        }
    }
    void returnBook(){
        if(isBorrowed){
            isBorrowed=false;
            System.out.println("Thanks for Reading the book "+title+" ...Plz share your feedback");
        }else{
            System.out.println("This book title "+title+"  is already returned to Library....Please bring the correct book.");
        }
    }

    //MAIN Program:
    public static void main(String[] args) {
        Book book1=new Book("The Stories of Pachatantra", "Veda", 3 );
        Book book2=new Book(1);
        Book book3=new Book(2);
        Book book4=new Book(4);

        Book.getTotalBooks();
        //Test Cases:
        book1.borrowBook();
        book1.borrowBook();
        book1.returnBook();
        book1.returnBook();

        book2.borrowBook();
        book4.borrowBook();
        book3.borrowBook();
        book3.returnBook();
        book2.returnBook();
    }
}
