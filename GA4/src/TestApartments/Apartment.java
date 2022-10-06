/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Devon
 */
package TestApartments;

public class Apartment {
// members of apartment

int aptNumber;
int bedrooms;
double baths;
double rent;

// constructer of class that accepts the number of bathroom and bedrooms and rent amount
public Apartment(int num, int bdrms, double bths, double rent) {
aptNumber = num;
bedrooms = bdrms;
this.baths = bths;
this.rent = rent;
}
// returns the no. of bedrooms in the apartment
public int getAptNumber() {
return aptNumber;
}
public int getBedrooms() {
return bedrooms;
}
// Returns the number of baths room in the apartment
public double getBaths() {
return baths;
}
// Return the rent of the apartment
public double getRent() {
return rent;
}
}
