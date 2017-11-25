package test;

public class Taxi extends Car{
	
	private String taxiNumber;
	private int passengerCount;
	
	public Taxi() {
		
	}
	
	public Taxi(String carName, String carNumber, int carPrice) {
		super(carName, carNumber, carPrice);
	}

	public String getTaxiNumber() {
		return taxiNumber;
	}

	public void setTaxiNumber(String taxiNumber) {
		this.taxiNumber = taxiNumber;
	}

	public int getPassengerCount() {
		return passengerCount;
	}

	public void setPassengerCount(int passengerCount) {
		this.passengerCount = passengerCount;
	}
	
	public void getCarInfo(){
		super.getCarInfo();
		
		System.out.println("Taxi Number : " + this.getTaxiNumber());
		System.out.println("Taxi PassengerCount : " + this.getPassengerCount());
	}
	
	
}
