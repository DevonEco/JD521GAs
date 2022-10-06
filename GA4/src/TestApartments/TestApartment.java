/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestApartments;

/**
 *
 * @author Devon
 */
import java.util.*;

public class TestApartment {

public static void main(String args[]) {
    
    Scanner input = new Scanner(System.in);
    Apartment apts[] = new Apartment[5];
    apts[0] = new Apartment(101, 2, 1, 725);
    apts[1] = new Apartment(102, 2, 1.5, 775);
    apts[2] = new Apartment(103, 3, 2, 870);
    apts[3] = new Apartment(104, 3, 2.5, 960);
    apts[4] = new Apartment(105, 3, 3, 1100);
    int bdrms;
    int baths;
    double rent;
    int count = 0;
    System.out.print("Enter minimum number of bedrooms needed >> ");
    bdrms = input.nextInt();
    System.out.print("Enter minimum number of bathrooms needed >> ");
    baths = input.nextInt();
    System.out.print("Enter maximum rent willing to pay >> ");
    rent = input.nextDouble();
    System.out.println("\n Apartments meeting citeria of \n at...");
}

}