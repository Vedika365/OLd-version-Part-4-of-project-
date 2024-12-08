import java.util.ArrayList;

public class Library {


    //default constructor
   public Library() {
       ArrayList<Object> books = new ArrayList<>();
        books. add(new Book("name1", "author1", 10, "pusblisher1" ,"987-io"));
        books.add(new Book("name2", "author2", 23, "publisher2", "dkjla678-");
         books.add(new Book("name3", "author3", 456.8, "publisher3,", "io-90-io-89"));
        books.add(new Book ("name4", "author4", 897, "pubisher4", "890-678-k");
   }

   //constructor of the list of books
    public Library (ArrayList<Book>books){
       books = new ArrayList<>(books);
    }

    }
    //copy constrcutor
    public Library (Library other){
       for (int i =0; i<other.books.size(); i++){
           Book books = other.books.get(i);
           books.add(new Book(books.getTitle(), books.getAuthor(), books.getPrice(), books.getPublisher(),books.getIsbn() ));
       }
    }
     //search for books containing the keyword
   public ArrayList<Book> searchBook(String keyword) {
       ArrayList<Book> result = new ArrayList<>();
       keyword = keyword.toLowerCase();

       //for loop ro iletrate over the books
       for (int i = 0; i < books.size(); i++) {
           Book book = books.get(i);

           //hwo to check if it contains the keyword (title, or author)


       }
       //equals to method
       public boolean equals (Object obj ){
           if (this == obj) return true;
           if (obj == null) return false;

           Library library = (library) obj;
           return books.equals(library.books);
       }

       //toString method
       public String toString () {
           String result = "library contains: \n"; //initilaze result with a header

           //loop to ilterate over the book list
           for (int i = 0; i < books.size(); i++) {
               Book book = books.get(i);
               result += books.toString() = "\n";

           }
           return result;

       }

   }




           public Arraylist <Book> getBooks(){
               return books;
           }
           public void setBooks(Arraylist<Books>book){
               this.books = books;
           }







        //create ArrayList object
       // ArrayList<String> books;
        //default constructor

        //need to add five different books
      /**  public Main(){
         books.add()
        }

        //getter and setter

        //getter for library
        public ArrayList<String> getBooks(){
            return books;
        }

        //setter for books
        public void setBooks(ArrayList<String>books){
            this.books = new ArrayList<>(books);
        }**/






