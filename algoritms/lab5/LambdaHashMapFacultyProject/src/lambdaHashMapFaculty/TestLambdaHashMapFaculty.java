package lambdaHashMapFaculty;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class TestLambdaHashMapFaculty {
    public static void main(String[] args) {
        String filePath = "Faculty.in";
        Map<Integer, Faculty> facultyMap = new HashMap<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            facultyMap = reader.lines().map(line -> {
                String[] data = line.split("\t+");
                int id = Integer.parseInt(data[0]);
                String lname = data[1];
                String fname = data[2];
                double salary = Double.parseDouble(data[3]);
                double bonusRate = Double.parseDouble(data[4]);

                return new Faculty(id, lname, fname, salary, bonusRate);
            }).collect(Collectors.toMap(Faculty::getF_id, f -> f));

            System.out.println("\nThe Faculty you enterred in the Map: " + facultyMap.size()+"\n");

            
            System.out.println("Print Faculty Keys collection using Lambda Expression:");
            facultyMap.keySet().forEach(System.out::println);
            
            System.out.println("\nAll elements of facultyMap:");
            facultyMap.values().forEach(f -> System.out.println(f.toString()));

            
            System.out.println("\nSorted faculty Map (Sorted by key):");
            facultyMap.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);

            System.out.println("\nSorted faculty Map (Sorted by value doCalcBonus):");
            facultyMap.entrySet().stream().sorted(Comparator.comparingDouble(entry -> entry.getValue().doCalcBonus())).forEach(System.out::println);

            System.out.println("\nSorted facultyMap by value of salary:");
            facultyMap.values().stream().sorted(Comparator.comparingDouble(Faculty::getF_Salary)).forEach(System.out::println);

            System.out.println("\nSorted faculty Map (Sorted by value of faculty's last name in reverse order):");
            facultyMap.entrySet().stream().sorted(Map.Entry.<Integer, Faculty>comparingByValue(Comparator.comparing(Faculty::getF_Lname).reversed()))
                .forEach(System.out::println);

         
            Map.Entry<Integer, Faculty> maxBonusEntry = facultyMap.entrySet()
                    .stream()
                    .max(Comparator.comparingDouble(entry -> entry.getValue().doCalcBonus()))
                    .orElse(null);

            if (maxBonusEntry != null) {
                System.out.println("\nUsing Stream Processing max Method: " + maxBonusEntry.getValue().doCalcBonus());
                System.out.println(maxBonusEntry.getValue());
                
            }
            System.out.println("\nUsing filter() to search for any matching of Faculty bonus rate of 1.5 in HashMap:");
            Map<Integer, Faculty> filteredFacultyMap = facultyMap.entrySet()
                    .stream()
                    .filter(entry -> entry.getValue().getF_BonusRate() == 1.5)
                    .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
            filteredFacultyMap.entrySet().forEach(System.out::println);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
