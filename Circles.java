
public class Circles implements Shapes {
	private double radius;
	public Circles(double r){
		this.radius=r;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Drawing Circle");

	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		
		return Math.PI*this.radius*this.radius;
	}
	
	public double getRadius(){
		return this.radius;
	}

}


