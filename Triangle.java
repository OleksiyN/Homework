
public class Triangle {
	private double a;
	private double b;
	private double c;
	private double p;
	
	Triangle(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.p = (a+b+c)/2;
	}
	public double area() {
		return Math.sqrt(p*(p-a)*(p-b)*(p-c));
	}
}
