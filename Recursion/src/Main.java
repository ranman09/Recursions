
import java.util.ArrayList;

public class Main{
	public static void main(String[]args) {
		ArrayList<Integer> one = new ArrayList<Integer>();
		one.add(1);
		ArrayList<Integer> two = new ArrayList<Integer>();
		two.add(2);
		ArrayList<Integer> three = new ArrayList<Integer>();
		three.add(3);
		
		ArrayList<ArrayList<Integer>> arrayList = new ArrayList<ArrayList<Integer>>();
		arrayList.add(one);
		arrayList.add(two);
		arrayList.add(three);
		
		System.out.println(generatePermutations(arrayList));
	}
	
	public static ArrayList<ArrayList<Integer>> generatePermutations(
			ArrayList<ArrayList<Integer>> numbers
			
			){

		
		if(numbers.size() <= 1) {return numbers;}
		
		ArrayList<Integer> lastNumber = numbers.get(numbers.size() - 1);
		
		ArrayList<ArrayList<Integer>> remainingNumber = numbers;
		remainingNumber.remove(remainingNumber.size()-1);
		
		
		ArrayList<ArrayList<Integer>> permutations = generatePermutations(remainingNumber);
		
		ArrayList<ArrayList<Integer>> items = new ArrayList<ArrayList<Integer>>();
		
		for (int i=0; i <= remainingNumber.size(); i++) {
			
			ArrayList<Integer> item = permutations.get(i);
			
			for (int j=0; j <= item.size(); j++) {
			
				if (j == item.size()) {
					item.add(lastNumber.get(0));
				} else {
					item.add(j,lastNumber.get(0));
				}
				
				items.add(item);
							
			}
			
		}
		
		return items;
		
		
	}
}