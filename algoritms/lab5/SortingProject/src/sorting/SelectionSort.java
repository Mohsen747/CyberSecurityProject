package sorting;

import java.util.ArrayList;
import java.util.List;

public class SelectionSort {
    public static void main(String[] args) {
        List<Integer> num = new ArrayList<>();
        num.add(5);
        num.add(9);
        num.add(8);
        num.add(1);

        System.out.println("Before Selection Sort:");
        num.forEach((n) -> System.out.print(n + " "));
        System.out.println();

      
        for (int i = 0; i < num.size() - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < num.size(); j++) {
                if (num.get(j) < num.get(minIndex)) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                int temp = num.get(i);
                num.set(i, num.get(minIndex));
                num.set(minIndex, temp);
            }
        }

        System.out.println("\nAfter Selection Sort:");
        num.forEach((n) -> System.out.print(n + " "));
    }

	public static void sort(List<Integer> num) {
		// TODO Auto-generated method stub
		
	}
}
