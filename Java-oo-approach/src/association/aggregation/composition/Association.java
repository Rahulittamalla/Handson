package association.aggregation.composition;

import java.util.ArrayList;

public class Association {

	
	
	
	
	public static void main(String[] args) {
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

		//build a vehicle pool >> Aggregation
		ArrayList<Vehicle> vehiclePool1 =new ArrayList<Vehicle>();
		
		vehiclePool1.add(volvo);
		vehiclePool1.add(bmw);
		
		/**
		 * Have a driver rent a car >> Association
		 */
		
		Driver driver=new Driver();
		
		driver.rentedVehicle(vehiclePool1.get(0));
		
		driver.drverVehicle(5);
		
		driver.returnVehicle();
		

	}

}
