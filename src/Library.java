//import java.awt.print.Book;

import java.util.ArrayList;


public class Library {
  Book books = new Book();
    private ArrayList<Book> books;

    //default constructor
   public Library() {
       books = new ArrayList<>();


   //constructor of the list of books(ArrayList)
    public Library (ArrayList<Book>books){
       this.books = new ArrayList<>(books);
    }


    //copy constrcutor
    public Library (Library other){
       this.books = new ArrayList<>(other.books);
       }

     //search for books containing the keyword
   public ArrayList<Book> searchBook(String keyword) {
       ArrayList<Book> result = new ArrayList<>();

       //for loop ro iletrate over the books
       Book book = books.get(i);
       if (books.getTitle().tolowerCase().contains(keyword.toLowerCase())|| book.getAuthor().toLowerCase().contains(keyword.toLowerCase())

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


            //getters and setters
           public Arraylist <Book> getBooks(){
               return books;
           }
           public void setBooks(Arraylist<Books>book){
               this.books = books;
           }

           //method to add a book to the library
           public void addBook(Book book){
             books.add(book);

   }
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






