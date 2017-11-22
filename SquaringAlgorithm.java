package SquaringAlgorithm;

import java.util.Scanner;

public class SquaringAlgorithm {
	
	public int expBySquaring(int x, int n) {
		if (n < 0)
			return expBySquaring(1/x, -n);
		else if (n == 0)
			return 1;
		else if (n == 1)
			return x;
		else if (n % 2 == 0)
			return expBySquaring(x * x, n/2);
		else
			return x * expBySquaring(x * x, (n - 1)/2);
	}//end method

	public static void main(String[] args) {
		
		//setting up the scanner
		Scanner input = new Scanner(System.in);
		
		System.out.println("Find integer 'x' to the power of 'n'\n");
		
		//taking input and assigning variable names
		System.out.println("Let 'x' be: ");
		int x = input.nextInt();
		
		System.out.println("Let 'n' be: ");
		int n = input.nextInt();
			
		//closing scanner
		input.close();
		
		//make an object of SquaringAlgorithm class
		SquaringAlgorithm expo = new SquaringAlgorithm();

		//calling method on object
		int result = expo.expBySquaring(x, n);
		
		//printing out the result
		System.out.println("\nResult: " + result);
		
	}//end main method
	
}//end class
