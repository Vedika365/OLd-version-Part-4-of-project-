public class Book {

    private String title;
    private String author;
    private String price;
    private String publisher;
    private String isbn;

    //methods

    //Default constrcutor
    public Book(){

    }

    //constructor with the title
    public Book(String title){
        this.title = title;
    }
    //constrcutor with all the data members

    public Book(String title, String author, String price, String publisher, String isbn){
        this.title = title;
        this.author = author;
        this.price = price;
        this.publisher = publisher;
        this.isbn = isbn;

        //copy constructor
        public Book(Book other){
            this.title = other.title;
            this.author = other.author;
            this.price = other.price;
            this.publisher = other.publisher;
            this.isbn = other.isbn;
        }
    }
}
