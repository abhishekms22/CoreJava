
public class Shapetest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shapes shape = new Circles(5);
		shape.draw();
		
		System.out.println("Area =" +shape.getArea());
		shape=new Rectangl(10, 10);
		shape.draw();
		System.out.println("Area="+shape.getArea());
		

	}

}
