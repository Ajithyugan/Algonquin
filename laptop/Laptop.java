package laptop;
import java.util.Scanner;

public class Laptop {
	String model;
	int memory;
	int ram;
	Scanner in = new Scanner(System.in);
	
	public Laptop(){
	 this("No information", 0, 0);
	}
	 
	public Laptop(String model,int memory,int ram){
		 this.model= model;
		 this.memory= memory;
		 this.ram = ram;
	}
	
	
public void	 enterSpecifications(){
	boolean	validMemoryInfo = false;
	boolean validRamInfo = false;
	System.out.print("ENTER COMPUTER MODEL: ");
	model = in.nextLine();
	
	while(!validRamInfo)	{
		System.out.print("ENTER AMOUNT OF RAM [GB] : ");
		ram = in.nextInt();
		if (ram>0) {
			validRamInfo = true;
		}
		else {
			System.out.println("RAM MUST BE GRATER THAN 0");
		}
	}
	while(!validMemoryInfo)	{
		System.out.print("ENTER THE HARD DRIVE MEMEORY [GB] : ");
		memory = in.nextInt();
		if (memory>0) {
			validMemoryInfo = true;
		}
		else {
			System.out.println("MEMORY MUST BE GRATER THAN 0");
		}
	}
}
	 
public double calculateBasePrice() {
	double basePrice = 200.0;
	return (basePrice+ ram*0.3 + memory*0.60);
	
}

public void displaySpecifications() {
	
	//System.out.println(model +"\t"+ram+"\t"+memory +"\t" +calculateBasePrice());
	System.out.printf("%16s %6d %20d %10.2f %n",model, ram,memory,calculateBasePrice());
	
}






}
