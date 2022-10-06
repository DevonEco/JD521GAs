package GA7_Q2;
import javax.swing.*;


public class TryToParseDouble {

    
public static void main(String[] args)
{
double inputDouble = 0.0;


//Error Checking
while (inputDouble != 99.0)
{
     //Try and Catch
     try
        {
            //Input
          String inputString = JOptionPane.showInputDialog(null,
          "Please enter a floating point number\nTo quit enter 99");
          inputDouble = Double.parseDouble(inputString);
        }

     catch(NumberFormatException exception)
        {
          inputDouble = 0;
        }

//Check what is entered 
if (inputDouble == 99.0)
    JOptionPane.showMessageDialog(null, "Goodbye!");
else
    JOptionPane.showMessageDialog(null, "You had entered " + inputDouble);
  }

 }
}