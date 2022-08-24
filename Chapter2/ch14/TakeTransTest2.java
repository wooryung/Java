package ch14;

public class TakeTransTest2 {

	public static void main(String[] args) {

		Student studentE = new Student("Edward", 20000);
		
		Taxi taxi1 = new Taxi("잘 나간다 운수");
		
		studentE.takeTaxi(taxi1);
		
		studentE.showInfo();
		taxi1.showTaxiInfo();
		
	}

}
