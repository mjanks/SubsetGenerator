/* Michael Janks  
	 * EID: E00800623
	 * COSC 314
	 * Fall 2020
	 * Lab 1
	 * 
	 * This program generates all possible subsets of the set { 1 2 3 ... n } .
	 * n is an integer specified by the user.
	 */

package subsets;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		GenerateSubsets subsets = new GenerateSubsets();
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number of positive integers n for the set { 1 2 3 ... n }: ");
		int n = scan.nextInt();
		scan.close();
		
		if(n >= 0) {
			ArrayList<String> finalSets = subsets.createSubsets(subsets.generateBitStrings(n), n);
			System.out.println("The set " + subsets.createSet(n) + " generates the following " 
								+ (int) Math.pow(2, n) + " subsets:");
			for(int i=finalSets.size()-1; i >= 0; i--) {
				System.out.println(finalSets.get(i));
			}
		} else {
			System.out.println("Bad input");
		}
	}
}
