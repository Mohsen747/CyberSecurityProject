package departmentstackmidterm;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TestDepartmentStack {
    public static void main(String[] args) {
        LinkedStackClass departmentStack = new LinkedStackClass();
        String line;

        System.out.println("Reading Department records from a text file");
        try {
            BufferedReader reader = new BufferedReader(new FileReader("Department.in"));
            while ((line = reader.readLine()) != null) {
                Department department = new Department(line);
                departmentStack.push(department);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Displaying the components of the Department stack");
        while (!departmentStack.isEmpty()) {
            Department department = departmentStack.pop();
            System.out.println("The Department Information is: " + department);
        }
    }
}
