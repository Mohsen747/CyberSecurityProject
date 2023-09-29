package genericPoint;


//Generic  Class
public class Point<T> {
	
	private  T x;
	private T y;
	

public Point(T x, T y) {
		super();
		this.x = x;
		this.y = y;
	}

//Generic  Method
public T getX() {
	return x;
}

public void setX(T x) {
	this.x = x;
}

public T getY() {
	return y;
}

public void setY(T y) {
	this.y = y;
}

// Generic Method Case1
public <T>void printArray1 (T[] v_Array)
{
	for (int index = 0 ; index  < v_Array.length ;  index ++)
	{
		System.out.println(v_Array[index] + " ");

	}
	System.out.println();

}

//Generic Method Case2
public <T>void printArray2 (T... v_Array)
{
	//forEach  Loop
	for (T elem : v_Array)
	{
		System.out.println(elem + " ");

	}
	System.out.println();

}

@Override
public String toString() {
	return "Point [x=" + x + ", y=" + y + "]";
}
 
}

