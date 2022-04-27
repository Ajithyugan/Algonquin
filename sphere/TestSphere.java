package sphere;

public class TestSphere {

	public static void main(String[] args) {
	
		Sphere sphere1 = new Sphere(3.1234f);               
		sphere1.programTitle();
		sphere1.printSphere();
		
		
		Sphere sphere2 = new Sphere(3.54321f);
		
		sphere2.printSphere();
		
		if (sphere1.calculateVolume() > sphere2.calculateVolume())
		{
			System.out.println("\nThe shpere1 is larger than shpere2.");
		}
		else {
			System.out.println("\nThe shpere2 is larger than shpere1.");
		}
	}

}
