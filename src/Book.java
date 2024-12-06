import static java.lang.Character.toTitleCase;

public class Book {

    private String title;
    private String author;
    private String price;
    private String publisher;
    private String isbn;

    //methods

    //Default constructor
    public Book(){

    }

    //constructor with the title
    public Book(String title){
        this.title = title;
    }
    //constructor with all the data members

    public Book(String title, String author, String price, String publisher, String isbn) {
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

                //method to display book details

                //method to return the String conversion of the Book
                public String toString() {
                    return ("Title: " + title + "\n" +
                            "Author: " + author + "\n" +
                            "Price: " + price + "\n" + // Formatting price if it's a number
                            "Publisher: " + publisher + "\n" +
                            "ISBN: " + isbn;
                }
                //equals to method to check equality between 2 books
                public boolean equals(Book other){
                        return this.title.equals(other.title)&&
                                this.author.equals(other.author)&&
                                this.price == other.price &&
                                this.publisher.equals(other.publisher) &&
                                this.isbn.equals(other.isbn);

            }
            //cone method
                public Book clone(){
                    return new Book()
                }
              //Geter and setter methods

                public String getTitle (){
                    return title;
                }

                public void setTitle(String title){
                    this.title = toTitleCase(title);
                }

                public String getAuthor(){
                    return author;
                }

                public void setAuthor (String author){
                    this.author = toTitleCase(author);
                }

                public double getPrice(){
                    return price;
                }
                public void setPrice (double price){
                    this.price = price;
                }

                public String getPublisher(String publisher){
                    this.publisher = publisher;
                }

                public String getIsbn(){
                    return isbn;
                }

                public void setIsbn (String isbn ){
                    this.isbn = isbn;
                }



            }
            }





