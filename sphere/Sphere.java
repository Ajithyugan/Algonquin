package sphere;
/*
 * Ajithyugan
 * 
 * 
 */
//import java.text.DecimalFormat;
public class Sphere {
	private float radius;
	
	//String patternRadius = "#.##";
	// DecimalFormat decimalFormatRadius = new DecimalFormat(patternRadius);
	 
		//String patternVolume = "#.###";
	//	 DecimalFormat decimalFormatVolume = new DecimalFormat(patternVolume);
	
	public Sphere() {
	radius=0.0f;//default constructor
	}
	
	//initial constructor
	public Sphere(float radius) { 
		this.radius= radius;
	//public Sphere( float radius = a , float radius = b ) { 
		//a = 3.1234f;
			//	b= 3.54321f;
	
	}
	public void programTitle() {
	System.out.println("This program is written by  Ajithyugan which compares between two spheres. ");	
	System.out.println("");
		
	}
	public float calculateVolume() {
		
		float volume = (4.0f/3.0f)* (float)Math.PI*radius*radius*radius;
		return volume ;
		
		
	}
	
	public void printSphere(){
		
		System.out.println("The volume of a sphere having radius "+(radius)+" is: "+calculateVolume());
	}
}
//decimalFormatRadius.format
//decimalFormatVolume.format
