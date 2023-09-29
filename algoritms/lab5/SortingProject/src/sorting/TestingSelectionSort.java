package sorting;

import java.util.ArrayList;
import java.util.List;

public class TestingSelectionSort {
    public static void main(String[] args) {
        List<Integer> num = new ArrayList<>();
        num.add(5);
        num.add(2);
        num.add(3);
        num.add(9);
        num.add(1);

        System.out.println("Before Selection Sort:");
        num.forEach((n) -> System.out.print(n + " "));
        System.out.println();

        SelectionSort.sort(num);

        System.out.println("\nAfter Selection Sort:");
        num.forEach((n) -> System.out.print(n + " "));
    }
}
