package subsets;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		GenerateSubsets subsets = new GenerateSubsets();
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number of integers for the original set: ");
		int n = scan.nextInt();
		scan.close();
		
		if(n <= 10) {
			System.out.println("Subsets generated: " + subsets.generateBitStrings(n));
		}
		
		ArrayList<String> finalSets = subsets.createSubsets(subsets.generateBitStrings(n), n);
		
		System.out.println("finalSets size: " + finalSets.size());
		System.out.println();
		
		for(int i=0; i<finalSets.size(); i++) {
			System.out.println(finalSets.get(i));
		}
	}
}
