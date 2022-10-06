/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ga5.GA5_1;

/**
 *
 * @author Devon
 */
public class NineInts {
	
    public static void main(String[] args)
    {
		final int integerNum = 9;
		int[] integers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		
		for (int i = 0 ; i < integerNum-1; ++i)
			for (int s=0 ; s < integerNum-1; ++s)
				if (integers[s] > integers[s+1])
				{
					int med = integers[s];
					integers[s]= integers [s+1];
					integers[s+1]=med;
				}
		System.out.println("Integers in ascending order:");
		for (int x=0; x<= integerNum-1; x++ )
			System.out.println(integers[x]);
		System.out.println("Integers in descending order:");
		for (int n=0; n<= integerNum-1; n++ )
			System.out.println(integers[integerNum-(1+n)]);
					
    }
}
