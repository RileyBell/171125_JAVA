package test;

public class Car {
	
	private String carName;
	private String carNumber;
	private int carPrice;
	
	public Car(){
		// DEFAULT 생성자
		// 생성자를 명시하지 않아도 자동으로 생성되는것.
	}
	
	public Car(String carName, String carNumber, int carPrice){
		// 반환타입이 없다면 생성자일 경우가 높다. 
		// 생성자는 class이름과 같다.
		// 지금은 생성자 오버로드인 상태.
		this.carName = carName;
		this.carNumber = carNumber;
		this.carPrice = carPrice;
	}
	
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	public String getCarNumber() {
		return carNumber;
	}
	public void setCarNumber(String carNumber) {
		this.carNumber = carNumber;
	}
	public int getCarPrice() {
		return carPrice;
	}
	public void setCarPrice(int carPrice) {
		this.carPrice = carPrice;
	}


	public void getCarInfo() {
		System.out.println("car Name : " + this.getCarName());
		System.out.println("car  Number : " + this.getCarNumber());
		System.out.println("car Price : " + this.getCarPrice());
	}
	
	public void etcInfo() {
		System.out.println("==> no etc info");
	}
	
}
