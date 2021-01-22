package bmiCal;
//import java.text.DecimalFormat;
import java.util.Scanner;

public class BMI {
private double weight;
private int feet;
private int inch;


Scanner input = new Scanner(System.in);

public BMI() {
	this.weight=120.0;
	this.feet=5;
	this.inch=5;
	
}
public BMI(double weight,int feet,int inch) {
	this.weight=weight;
	this.feet=feet;
	this.inch=inch;
}
public void getInfo() {
	
	boolean ap = false;
	boolean app = false;
	boolean appp = false;

	while(!ap)	{
		System.out.print("\nENTER THE WEIGHT IN POUNDS: ");
		weight=input.nextDouble();
		if (weight>0) {
			ap = true;
		}
		else {
			System.out.print("\nINVALID WEIGHT MUST BE GRATER THAN 0");
		}
	}
	System.out.println("ENTER HEIGHT IN FEET AND INCHES:");
	while(!app)	{
		System.out.print("\nFEET : ");
		feet = input.nextInt();
		if (feet>0) {
			app = true;
		}
		else {
			System.out.print("\nINVALID FEET MUST BE GRATER THAN 0: ");
		}
	}
	while(!appp)	{
		System.out.print("\nINCH : ");
		inch = input.nextInt();
		if (inch>=0) {
			appp = true;
		}
		else {
			System.out.print("\nINVALID INCH MUST BE EQUAL OR GRATER THAN 0: ");
		}
		System.out.println();
	}
}
private double calculateBMI() {
	double BMI;
	
	BMI=(weight*0.454)/((((feet*12)+inch)/39.37)*(((feet*12)+inch)/39.37));
	
	 return BMI;
	
}
public void displayInfo() {
//	DecimalFormat BMI = new DecimalFormat("##.##");
	String result=null;
	if (calculateBMI()<18.5) {
		result= "UNDERWEIGHT";
		System.out.println("BMI FOR "+feet+" FEET "+inch+" INCH AND "+weight+" POUND is "+calculateBMI()+"\t"+result);
	}
	if (calculateBMI()>=18.5 && calculateBMI() <=24.9) {
		result="NORMAL";
		System.out.println("BMI FOR "+feet+" FEET "+inch+" INCH AND "+weight+" POUND is "+calculateBMI()+"\t"+result);
	}
	if (calculateBMI()>=25.0 && calculateBMI() <=29.9) {
		result="OVERWEIGHT";
		System.out.println("BMI FOR "+feet+" FEET "+inch+" INCH AND "+weight+" POUND is "+calculateBMI()+"\t"+result);
	}
	if (calculateBMI()>30.0) {
		result="OBESE";
		System.out.println("BMI FOR "+feet+" FEET "+inch+" INCH AND "+weight+" POUND is "+calculateBMI()+"\t"+result);
	}
}
}
