package ArrayListProcess;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestFileArrayList2 {

	public static void main(String[] args) throws FileNotFoundException {
	
		
		Scanner inFile = new Scanner (new FileReader("divide.in"));
		List<Divide>  inFileArrayList = new ArrayList<>();
		
		int index = 0;
		
		while (inFile.hasNextLine()) 
		{
			Divide divideObj = new Divide();
			divideObj.setX(inFile.nextDouble());
			divideObj.setY(inFile.nextDouble());
			
			inFileArrayList.add(divideObj);

		}
		inFile.close(); //Like Closing db and free space memory
		
		//Print ArrayList inFileArrayList
		for (index =  0 ; index  < inFileArrayList.size()  ; index++ ) {
			System.out.println("X = " + inFileArrayList.get(index).getX() + "   Y = " + inFileArrayList.get(index).getY() + "   Division is:  " + inFileArrayList.get(index).doDivide());
		}
	}

}
