package test;

public class Main {

	public static void main(String args[]){
		
		/*
		Car myCar = new Car();
		
		myCar.setCarName("Sonata");
		myCar.setCarNumber("CAR11112222");
		myCar.setCarPrice(1000);
		
		System.out.println("Object value : " + myCar);
		// 메모리 주소값이 찍히게 된다.
		*/
		
		/*
		Bus myBus = new Bus("miniBus", "CAR11112222", 1000);
		
		myBus.setBusNumber("BUS11112222");
		myBus.setPassengerCount(100);
		
		System.out.println("Object value : " + myBus);
		myBus.getCarInfo();
		
		
		Taxi myTaxi = new Taxi("minitaxi", "CAR22223333", 2000);
		
		myTaxi.setTaxiNumber("TAXI11112222");
		myTaxi.setPassengerCount(50);
		
		System.out.println("Object : " + myTaxi);
		myTaxi.getCarInfo();
		*/
		
		/*
		Student student = new Student();
		student.setStuName("김기태");
		student.setStuAge(32);
		
		System.out.println(student.toString());
		student.schoolName();
		student.schoolAddress();
		
		System.out.println();
		
		Teacher teacher = new Teacher();
		
		teacher.setTeacherName("홍길동");
		teacher.setTeacherAge(40);
		
		System.out.println(teacher.toString());
		teacher.schoolName();
		teacher.schoolAddress();
		*/
		
		Car car_bus = new Bus();
		Car car_taxi = new Taxi();
		
		// Taxi taxi = new Car(); 
		// 자식이 부모를 가졌기때문에 이 문장은 에러가 난다.
		
		car_bus.etcInfo();
		car_taxi.etcInfo();
		
		// Taxi 클래스에는 etcInfo()가 없는데 결과가 나오는 이유는
		// Car 형으로 만들었기때문에 Car 클래스의 etcInfo()를 불러오기때
	}
}













