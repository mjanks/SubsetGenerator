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
		
		ArrayList<String> finalSets = subsets.createSubsets(subsets.generateBitStrings(n), n);
		
		String origSet = "{ ";
		for(int i=1; i <= n; i++) {
			origSet = origSet + i + " ";
		}
		origSet = origSet + "}";
		
		System.out.println("The set " + origSet + " generates the following " + (int) Math.pow(2, n) + " subsets:");
		
		for(int i=0; i<finalSets.size(); i++) {
			System.out.println(finalSets.get(i));
		}
	}
}
