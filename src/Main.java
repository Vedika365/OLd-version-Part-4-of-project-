import java.util.ArrayList;


public class Main {

   public Main () {
       public static void main(String[]args) {
          //create books
           Book book1 = new Book("name1", "author1", 10, "pusblisher1" ,"987-io"));
           Book book2 = new Book("name2", "author2", 23, "publisher2", "dkjla678-");
           Book book3 = new Book ("name3", "author3", 456.8, "publisher3,", "io-90-io-89"));
           Book book4 = new Book ("name4", "author4", 897, "pubisher4", "890-678-k");

         //create library
           Library library = new Library();
           library.addBook(book1);
           library.addBook(book2);
           library.addBook(book3);
           library.addBook(book4);

           //print library
           System.out.println(library);

           //clone library
           Library libraryCopy = new Library(library);
           System.out.println("copied library:");
           System.out.println(libraryCopy);

           //use the equals to method
           System.out.println("are the libraries equal"+ library.equals(libraryCopy));

       }
   }
}















