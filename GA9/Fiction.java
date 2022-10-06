//GA9
package GA9;

public class Fiction extends Book
{

  public Fiction(String title)
  {
      //overrides 
    super(title);
    setBookPrice(); 
  }
  
  //Sets the book price 
  public void setBookPrice()
  {
    bookPrice = 24.99; 
  }    
}