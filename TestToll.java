import java.util.*;
interface TollBooth
{
	int calculateToll(Truck t);
	void display();
	
}

class AlleghaniToll implements TollBooth
{
	int t_weight,t_axle,toll_amt;
	AlleghaniToll(){
		
	}
	
	public int calculateToll(Truck t)
	{
		
		t_weight = t.getAxles();
		t_axle = t.getWeight();
		toll_amt = (5*t_axle)+2*(10*t_weight/1000);
			return toll_amt;
	}
	
	
	public void display()
	{
		System.out.println("Weight of the truck(in KGs) is :\t"+t_weight);
		System.out.println("Number of Axles in Truck are:\t"+t_axle);
		System.out.println("Total Toll Amount To be Paid is:\t$"+toll_amt);
		System.out.println("=================================================\n\n\n");
	}
}


interface Truck
{
    int getAxles();
    int getWeight();
    int input();
    void display_truckData();
}
class FordTrucks implements Truck
{
    int weight,axles,t_num;

    FordTrucks(int w,int a)
    {
        this.axles = a;
        this.weight = w;
    }

   public  int getAxles()
    {
        return axles;
    }

   public int getWeight()
    {
        return weight;
    }
   
  public int input()
   {
	   Scanner s = new Scanner(System.in);
	   System.out.println("****************Welcome to Alleghenny Toll Booth*****************");
		   System.out.println("\n\n\n**********************************************\n");
		   System.out.println("Enter the Truck Number:\t");
		   t_num = s.nextInt();
		   System.out.println("\nScaling the Truck Weight.....\n");
		   return t_num;
   }
   
   public void display_truckData()
   {
	   System.out.println("****************************************************");
	   System.out.println("The Information of the Truck is:\n\n");
	   System.out.println("The Truck belongs to Ford Makings.");
	   System.out.println("The Truck Number is:\t"+t_num);
	   System.out.println("The Weight of the Truck is :\t"+axles);
	   System.out.println("Number of Axles present in the Truck is:\t"+weight);
	   System.out.println("----------------------------------------------------");
   }

}

class NissanTrucks implements Truck
{
	int weight,axles,t_num;

    NissanTrucks(int w,int a)
    {
        this.axles = a;
        this.weight = w;
    }

   public int getAxles()
    {
        return axles;
    }

    public int getWeight()
    {
        return weight;
    }
    
    public int input()
    {
 	   Scanner s = new Scanner(System.in);
 	  System.out.println("****************Welcome to Alleghenny Toll Booth*****************");
 		   System.out.println("\n\n\n**********************************************\n");
 		   System.out.println("Enter the Truck Number:\t");
 		   t_num = s.nextInt();
 		   System.out.println("\nScaling the Truck Weight.....\n");
 		   return t_num;
 
    }
    
    public void display_truckData()
    {
 	   System.out.println("****************************************************");
 	   System.out.println("The Information of the Truck is:\n\n");
 	   System.out.println("The Truck belongs to Nissan Makings.\n");
 	   System.out.println("The Truck Number is:\t"+t_num);
 	   System.out.println("The Weight of the Truck is :\t"+weight);
 	   System.out.println("Number of Axles present in the Truck is:\t"+axles);
 	   System.out.println("----------------------------------------------------");
    }


}
public class TestToll {
	
	public static void main(String [] args){
		TollBooth booth = new AlleghaniToll();

		Truck ford = new FordTrucks(5, 12000); // 5 axles and 12000 kilograms
		Truck nissan = new NissanTrucks(2, 5000); // 2 axles and 5000
		ford.input();
		ford.display_truckData();
		booth.calculateToll(ford);
		booth.display();
		nissan.input();
		nissan.display_truckData();
		booth.calculateToll(nissan);
		booth.display();
			
	}

}