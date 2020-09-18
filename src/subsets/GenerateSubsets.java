package subsets;

import java.util.ArrayList;

public class GenerateSubsets {
	
	public ArrayList<String> generateBitStrings(int n) {
		ArrayList<String> bitStrings = new ArrayList<String>();
		int numBitStrs = (int) Math.pow(2, n);
		
		for(int i=0; i < numBitStrs; i++) {
			bitStrings.add(Integer.toBinaryString(i));
		}
		return bitStrings;
	}
	
	public ArrayList<String> createSubsets(ArrayList<String> bitStrings, int n) {
		ArrayList<String> subsets = new ArrayList<String>();
		String temp = "";
		int startingValue = n;
		
		for(int i=0; i < bitStrings.size(); i++) {
			for(int j = bitStrings.get(i).length()-1; j >= 0; j--) {
				if(bitStrings.get(i).charAt(j) == '1') {
					temp = temp + n + " ";
					n--;
				} else {
					n--;
				}
			}
			subsets.add(temp);
			temp = "";
			n = startingValue;
		}
		subsets.set(0, "0 (empty set)");
		return subsets;
	}	
}
