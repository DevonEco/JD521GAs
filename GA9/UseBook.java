//Group Actvity 9 
package GA9;

public class UseBook
{
    
  public static void main(String[] args)
  {
        //Sets Classes 
      Fiction fbook = new Fiction("Oliver Twist");
      NonFiction nbook = new NonFiction("Making of the West");
      
        //Output
      System.out.println("Book Title: " + fbook.getBookTitle() 
              +"\n" + "Book Price: " + "R" + fbook.getBookPrice() +"\n");
      
      System.out.println("Book Title: " + nbook.getBookTitle()  
              +"\n" + "Book Price: " + "R" + nbook.getBookPrice() +"\n") ;
  }
} 