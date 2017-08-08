
public class MainTriangle {

	public static void main(String[] args) {
		Triangle t1 = new Triangle (3, 4, 5);
		Triangle t2 = new Triangle (10, 10, 10);
		//System.out.println(t1.p);
		System.out.println("Area of a triangle = " + t1.area());
		System.out.println("Area of a triangle = " + t2.area());
	}

}
