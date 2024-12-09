//import static java.lang.Character.toTitleCase;
//import java.util.ArrayList;
//import java.util.Objects;

//public class Book {

   // Book Book = new Book();
//}
  /**  private String title;
    private String author;
    private double  price;
    private String publisher;
    private String isbn;

    //methods

    //Default constructor    it is called direclty when object is created
    public Book(){
      this.title = "Untitled";
      this.price =0;
      this.publisher= "not known";
      this.isbn ="don't know";
      this.author = "unknown";
    }

    //constructor with the title
    public Book(String title){
        this.title = toTitleCase(title);
    }

    //constructor with all the data members

    public Book(String title, String author, double price, String publisher, String isbn) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.publisher = publisher;
        this.isbn = isbn;
    }
        //copy constructor
        public Book(Book other) {
            this.title = other.title;
            this.author = other.author;
            this.price = other.price;
            this.publisher = other.publisher;
            this.isbn = other.isbn;
        }
            //method to check the ISBN
            public boolean checkISBNStatus() {
                if (isbn.length() == 13 || isbn.length() == 17) {
                    return true;
                }
                return false;







                //equals to method to check equality between 2 books
                @Override
                public boolean equals( Object obj) {
                    if (this == obj) { // Check for reference equality
                        return true;

                    }
                    if (obj == null) { // Null check
                        return false;
                    }
                    return this.title.equals(other.title) &&
                            this.author.equals(other.author) &&
                            Double.compare(this.price, other.price) == 0 && // Compare double values correctly
                            this.publisher.equals(other.publisher) &&
                            this.isbn.equals(other.isbn);
                }


            }
            //cone method
                public Book clone(this){
                    return new Book();
                }
              //Geter and setter methods

                public String getTitle (){
                    return title;
                }

                public void setTitle(String title){
                    this.title = title;
                }

                public String getAuthor(){
                    return author;
                }

                public void setAuthor (String author){
                    this.author = author;
                }

                public double getPrice(){
                    return price;
                }
                public void setPrice (double price){
                    this.price = price;
                }

                public String getPublisher(String publisher){
                    this.publisher = publisher;
                    return publisher;
                }

                public String getIsbn(){
                    return isbn;
                }

                public void setIsbn (String isbn ){
                    this.isbn = isbn;
                }

    //method to return the String conversion of the Book
    public String toString(){
        return( "Title: " + title + "\n" +
                "Author: " + author + "\n" +
                "Price: " + price + "\n" +
                "Publisher: " + publisher + "\n" +
                "ISBN: " + isbn);
    }


            }
**/





