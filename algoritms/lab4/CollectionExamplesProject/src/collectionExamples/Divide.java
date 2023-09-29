package collectionExamples;

public class Divide {
	double x;
	double  y;
	
	public Divide() {

		x = 0;
		y = 0;
	}
	
	

	public Divide(double x, double y) {

		this.x = x;
		this.y = y;
	}



	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
	
	public double doDivide() {
		
		return  x / y ;
	}



	@Override
	public String toString() {
		return "Divide [x=" + x + ", y=" + y + "]";
	}
	
	

}
