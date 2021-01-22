package shippingCal;

public class Shipment {

	public static void main(String[] args) {
System.out.println("Welcome to Ajithyugan's shipping Calculator!\n");
		Package shipmentDefault = new Package();
		System.out.println("Enter fist package dimensions");
		shipmentDefault.inputLength();
		shipmentDefault.inputWidth();
		shipmentDefault.inputHeight();
		shipmentDefault.calcVolume();
		
		
		Package shipmentInitial = new Package(1.0,1.0,1.0);
		
		System.out.println("\nEnter second package dimensions");
		shipmentInitial.inputLength();
		shipmentInitial.inputWidth();
		shipmentInitial.inputHeight();
		
		shipmentInitial.calcVolume();
		
		//Package shipmentCopy = new Package(shipmentInitial);
		//shipmentCopy.inputLength();
		//shipmentCopy.inputWidth();
		//shipmentCopy.inputHeight();
		//shipmentCopy.displayDimensions();
		//shipmentCopy.calcVolume();
		
		
		System.out.println("");
		shipmentDefault.displayDimensions();
		shipmentInitial.displayDimensions(); 
		
		
	}
	
}
