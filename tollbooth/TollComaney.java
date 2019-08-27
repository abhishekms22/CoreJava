/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tollbooth;

/**
 *
 * @author DELL
 */
public class TollComaney implements Toll{
    private static int no_vehicle;
    private static double tot_amount;
    public void collect_reset(){
        System.out.println("Thank you for Collecting And Resting the Toll\n number of vehicles Passed\t: "+no_vehicle+"\nTotal Amount\t: "+tot_amount);
        no_vehicle=0;
        tot_amount=0;
    }
    public void cal_Display(Truck truck){
        int axil=truck.getaxils();
        double tons=truck.totons();
        double toll=axil*5;
        toll+=tons*20;
        no_vehicle++;
        tot_amount+=toll;
        System.out.println(" \tWelcome to Toll");
//        System.out.println("-------------------------------------------------------------------");
        System.out.println("\tVehicle Information");
        truck.display();
        System.out.println("Ammount to be paid : "+toll);
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("\t");
        
        System.out.println("Number of vehicles arrived:"+no_vehicle+"\tAmount Collected:"+tot_amount);
        System.out.println("--------------------------------------------------------------------------");
        System.out.println();
    }
}
