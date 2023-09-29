package StackPayRoll;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TestStackPayRollProject {
    public static void main(String[] args) throws FileNotFoundException {
        LinkedStackClass stackList = new LinkedStackClass();

        // Read data from PayRoll.in file and push it to the stackList
        File file = new File("PayRoll.in");
        Scanner sc = new Scanner(file);

        while (sc.hasNext()) {
            int employeeId = sc.nextInt();
            String employeeName = sc.next();
            String employeeSsn = sc.next();
            double employeeWorkHours = sc.nextDouble();
            double employeeHourRate = sc.nextDouble();

            PayRoll payroll = new PayRoll(employeeId, employeeName, employeeSsn, employeeWorkHours, employeeHourRate);
            stackList.push(payroll);
        }

        sc.close();

        // Print the records in the descending order with respect to the amount of employee Net Amount Pay
        System.out.println("The size of stack is:" + stackList.getSize());

        if (!stackList.isEmpty()) {
            PayRoll payroll = stackList.top();
            System.out.println("\nStackTop is:\n" + payroll);
        }

        System.out.println("\nPrinting the records in the descending order with respect to the amount of employee Net Amount Pay:");

        while (!stackList.isEmpty()) {
            PayRoll payroll = stackList.pop();
            double netAmount = payroll.CalculateNetAmountPay();
            System.out.printf("\nThe EmployePay Information is : %d//%s//%s//%.1f//%.2f\n-> Pay Net Amount: %,.2f$\n",
                    payroll.getEmployeeId(), payroll.getEmployeeName(), payroll.getEmployeeSSN(),
                    payroll.getEmployeeWorkHours(), payroll.getEmployeeHourRate(), netAmount);
        }

        System.out.println("\nThe size of stack is:" + stackList.getSize());
    }
}


