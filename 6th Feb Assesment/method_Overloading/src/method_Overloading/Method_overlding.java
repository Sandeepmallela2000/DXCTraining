package method_Overloading;
class point {

	private double x;
	private double y;

	point(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	
	public double getDistance(point p) {

		return Math.sqrt((this.getX() - p.getX()) * (this.getX() - p.getX())+ (this.getY() - p.getY()) * (this.getY() - p.getY()));
	}

}

public class Method_overlding {

	public static void main(String[] args) {

		point point1 = new point(2, 3);

		point point2 = new point(5, 6);

		double distance1 = point1.getDistance(point2);

		System.out.println("the Distance of p1 from p2 is:"+distance1);
	
	point Origin = new point(0, 0);

	point point3 = new point(2, 3);

	double distance2 = Origin.getDistance(point3);

	System.out.println("the Distance of p1 from origin is:"+distance2);
}
}



