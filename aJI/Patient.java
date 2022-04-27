package aJI;
import java.time.LocalDate;

public class Patient {

	private	String name;
	private	int healthCardNumber;
	private	LocalDate birthDay;

	public	Patient(){
		name="unknown";
		healthCardNumber=-9;
		birthDay=LocalDate.now();
	}
	public	Patient(String name,int healthCardNumber,LocalDate birthDay){
		this.name=name;
		this.healthCardNumber=healthCardNumber;
		this.birthDay=birthDay;
	}
	public String	toString(){
		return "\nName: "+getName()+"\nHealth Card Number: "+getHealthCardNumber()+"\nBirth Date: "+birthDay;
	}
	public String getName() {
		return name;
	}
	public int getHealthCardNumber() {
		return healthCardNumber;

	}

}
