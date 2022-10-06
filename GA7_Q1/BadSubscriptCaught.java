package GA7_Q1;
import java.util.Scanner;


public class BadSubscriptCaught
{
public static void main(String[] args)
{
    //Array Containing names 
String[] names = {"Devon", "Ruan","Christiaan", "Kyle","Pieter", "Dan", "Tiaan", "Phillip", "Brent", "Zafar"};
String integer;

// Try and Catch Checks if number entered is between 1 and 10
try
{
System.out.println("Please, enter an integer from 1 to 10 to display a name");
Scanner input= new Scanner(System.in);
integer = input.nextLine();
int i = Integer.parseInt(integer);

i = i-1;  //Array starts at 0 
System.out.println(names[i]);
input.close();
}


catch (ArrayIndexOutOfBoundsException e){
System.out.println("Your number is out of range");
}
}
}