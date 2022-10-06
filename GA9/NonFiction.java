//GA9
package GA9;

public class NonFiction extends Book
{
  public NonFiction(String title)
  {
      //overrides
    super(title);
    setBookPrice();
  }
  //Sets the price for the book 
  public void setBookPrice()
  {
    bookPrice = 37.99;
  }
}