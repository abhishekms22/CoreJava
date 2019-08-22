
public class Rectangl implements Shapes{
	private double width;
	private double height;
	
	public Rectangl(double w, double h){
		this.width=w;
		this.height=h;
	}
	
	public void draw(){
		System.out.println("Drawing Rectangle");
	}
	
	public double getArea(){
		return this.height*this.width;
	}
}