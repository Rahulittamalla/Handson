package association.aggregation.composition;

import java.util.ArrayList;

public class Vehicle {

	public double fuel;
	public double fuelcapacity;
	public double fuelconsumption;
	public double mileage;
	public double lifespan;
	public ArrayList<Part> parts;
	public Vehicle(double fuel, double fuelcapacity, double fuelconsumption, double mileage, double lifespan,
			ArrayList<Part> parts) {
		super();
		this.fuel = fuel;
		this.fuelcapacity = fuelcapacity;
		this.fuelconsumption = fuelconsumption;
		this.mileage = mileage;
		this.lifespan = lifespan;
		this.parts = parts;
	}
	
	public void goToDestination(double miles)
	{
		this.mileage=this.mileage+miles;
		this.fuel=this.fuel-this.fuelconsumption*miles;
	}
	
	
}
