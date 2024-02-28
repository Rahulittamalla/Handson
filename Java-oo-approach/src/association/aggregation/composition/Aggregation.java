package association.aggregation.composition;

import java.util.ArrayList;

public class Aggregation {
	
	public static void main() {
	
	ArrayList<Part> bmwParts=new ArrayList<Part>();
	Part bMWEngine=new Part();
	Part bMWBody=new Part();
	
	bmwParts.add(bMWEngine);
	bmwParts.add(bMWBody);
	
	Vehicle bmw =new Vehicle(1500,500,50,0.7, 0, bmwParts);
	
	ArrayList<Part> volvoParts=new ArrayList<Part>();
	Part volvoEngine=new Part();
	Part volvoBody=new Part();
	
	volvoParts.add(volvoEngine);
	volvoParts.add(volvoBody);
	
	Vehicle volvo= new Vehicle(1500,500,50,0.7, 0, volvoParts);
	
	//Build a Vehicle pool >> Aggregation
	
	ArrayList<Vehicle> vehiclepool1= new ArrayList<Vehicle>();
	vehiclepool1.add(volvo);
	vehiclepool1.add(bmw);
	
	/*
	 * if vehicle pool is Garbage collected the "volvo" and "bmw" objects might not
	 * be come garbage themselves as they could be part of another vehicle pool.
	 */
	
	

}
}