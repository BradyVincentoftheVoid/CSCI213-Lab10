/**
 * Lab 10 Car class
 * @author Brady Vincent
 *
 */
 
 
public class Car extends Vehicle {
	
	private int doors;
	private int passengers;
	
	public Car(String aMake, String aModel, String aPlate, int door, int pass) {
		super(aMake, aModel, aPlate);
		this.doors = door;
		this.passengers = pass;
	}
	
	public int getDoors() {
		return this.doors;
	}
	
	public int getPassengers() {
		return this.passengers;
	}
	
	public String toString() {
		return "" + this.doors + " doors " + super.getMake() + " " + super.getModel() + " with license " + super.getPlate();
	}
	
	public boolean equals(Object other) {
		if(!(other instanceof Car)) {
			return false;
		}
		
		Car otherCar = (Car) other;
		
		if(super.equals(otherCar) 
			&& this.doors == otherCar.getDoors() 
		 		&& this.passengers == otherCar.getPassengers())
			return true;
		
		return false;
	}
	
	public Car copy() {
		return new Car(super.getMake(), super.getModel(), super.getPlate(), this.doors, this.passengers);
	}
	
}