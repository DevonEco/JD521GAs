//GA9
package GA9;

/**
 *
 * @author ruan
 */
public abstract class Book
 {
  private final String bookTitle;
  public double bookPrice;
  public Book(String title)
          
 {
     bookTitle = title;
 }

     //Grabs the books title
  public String getBookTitle()
  {
      return bookTitle;
  }

     //Grabs the book price depending on fictional or non fictional 
  public double getBookPrice()
  {
      return bookPrice;
  }
  
  public abstract void setBookPrice();
  {
   this.bookPrice = bookPrice;
  }
   
}
