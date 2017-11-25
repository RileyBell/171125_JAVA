package test;

public class Bus extends Car{

	private String busNumber;
	private int passengerCount;
	
	public Bus() {
		
	}
	
	public Bus(String carName, String carNumber, int carPrice){
		super(carName, carNumber, carPrice);
		// 상위클래스의 생성자 호
	}

	public String getBusNumber() {
		return busNumber;
	}

	public void setBusNumber(String busNumber) {
		this.busNumber = busNumber;
	}

	public int getPassengerCount() {
		return passengerCount;
	}

	public void setPassengerCount(int passengerCount) {
		this.passengerCount = passengerCount;
	}

	public void getCarInfo(){
		// 메소드 오버라이드 : 부모의 메소드를 자식이 가져와 나에게 맞춰 사용
		
		super.getCarInfo();
		// 부모 클래스의 getCarInfo(); 메소드를 사용하여 차 정보를 가져오는 메소드 사
		
		System.out.println("Bus Number : " + this.getBusNumber());
		System.out.println("Bus PassengerCount : " + this.getPassengerCount());
	}
	
	public void etcInfo() {
		System.out.println("==> bus is big");
	}
	
	
}
