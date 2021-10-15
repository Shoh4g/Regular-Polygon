import java.awt.Color;
/**
 * The ShapeTester Class will create an object of the Shape Class and access
 * all its instance variables and methods using the dot operator, and print 
 * out debugging messages to the console.
 * 
 * @author Sabyasachi Purkayastha
 */
public class ShapeTester
{
	/**
	 * A main method to create an object of the Shape Class and access its 
	 * instant variables and methods using the dot operator; printing out 
	 * debugging messages to the console. 
	 * 
	 * @param args
	 * 		
	 */
	public static void main(String[] args)
	{
		//Creating an object shape of the Shape class.
		Shape shape = new Shape();
		System.out.println("An object shape of the Shape Class has been created.");
		
		//Selecting Teal color for the Shape.
		Color color = new Color(250, 0, 0);
		
		shape.setColor(color);
		System.out.println("The Color of the object set using setters");
		
		//Using Getter Method to get Teal Color for the Shape Object.
		System.out.println("The Color of the object retrieved using getters: " + shape.getColor());
		
		//filled boolean variable selected to be true for the Shape.
		boolean filled = true;
		
		//Using Setter Method select filled = true to Shape Object.
		shape.setFilled(filled);
		System.out.println("Filled is set to true using setters");
		
		//Using Getter Method to get filled for the Shape Object.
		System.out.println("The fill of the object retrieved using getters:" + shape.getFilled());
		
		//theta double variable assigned = pi/12;
		double theta = (Math.PI / 12);
		
		//Using Setter Method select theta = pi/12 (in radians) to Shape Object.
		shape.setTheta(theta);
		System.out.println("The theta of the object set using setters");
		
		//Using Getter Method to get theta for the Shape Object.
		System.out.println("The theta of the object retrieved using getters " + shape.getTheta());
		
		//xc double variable assigned = 8.0d
		double xc = 8.0d;
		
		//Using Setter Method select xc = 8.0d to Shape Object.
		shape.setXc(xc);
		System.out.println("The X-coordinate of the object set using setters");
		
		//Using Getter Method to get xc for the Shape Object.
		System.out.println("The X-coordinate of the object retrieved using getters "  + shape.getXc());
		
		//yc double variable assigned = 8.0d
		double yc = 8.0d;
		
		//Using Setter Method select yc = 8.0d to Shape Object.
		shape.setYc(yc);
		System.out.println("The Y-coordinate of the object set using setters");
		
		//Using Getter Method to get yc for the Shape Object.
		System.out.println("The Y-coordinate of the object retrieved using getters " + shape.getYc());
		
		//xLocal double array assigned.
		double[] xLocal = new double [] {11.0d, 22.0d, 33.0d, 44.0d, 55.0d};
		
		//Using Setter Method select xLocal[] to Shape Object.
		shape.setXLocal(xLocal);
		System.out.println("The X-coordinates of the object set using setters");
		
		//Using Getter Method to get xLocal[] for the Shape Object.
		System.out.println("The X-coordinates of the object retrieved using getters ");	
	    //////OKAY UPTO THIS MUCH///
		
		
		
		
		for(int i = 0; i < shape.getXLocal().length; i++) {
			System.out.println(shape.getXLocal()[i]);
		}
			
		//yLocal double array assigned to {11.0d, 22.0d, 33.0d, 44.0d, 55.0d};
		double[] yLocal = new double [] {11.0d, 22.0d, 33.0d, 44.0d, 55.0d};
	
		//Using Setter Method select yLocal[] to Shape Object.
		shape.setYLocal(yLocal);
		System.out.println("The Y-coordinates of the object set using setters");
		
		//Using Getter Method to get yLocal[] for the Shape Object.
		System.out.println("The Y-coordinates of the object retrieved using getters");
		for(int i = 0; i < shape.getYLocal().length; i++) {
			System.out.println(shape.getYLocal()[i]);
		}
		
		//Calling the translate method to translate the center by dx = PI/4 and dy = PI/4 (Both in radians).
		//dx and dy are of double data types.
		shape.translate(Math.PI/6, Math.PI/6);
		
		
		//Using Getter Method to get the new center coordinates for the Shape Object.
		System.out.println("Translated coordinates xc and yc retrieved using getters are " + shape.getXc() + "and" + shape.getYc() );
		
		//Calling the rotate method to rotate theta by dt = PI/3 (in radians).

		shape.rotate(Math.PI/6);
			
		//Using Getter Method to get the new theta for the Shape Object.
		System.out.println("The method sh.rotate() is called to rotate theta by dt.");
		System.out.println("The new theta retrieved using getters: " + shape.getTheta());
		
		//x_local_screen Integer array to get the x-coordinates of the screen coordinate system.
		
		System.out.println("The X-coordinates of the object's screen coordinate system retrieved using getters ");	
		
		for(int i = 0; i < shape.getX().length; i++) {
			System.out.println(shape.getX()[i]);
		}
			
		//y_local_screen Integer array to get the y-coordinates of the screen coordinate system.
        System.out.println("The Y-coordinates of the object's screen coordinate system retrieved using getters ");	
		
		for(int i = 0; i < shape.getY().length; i++) {
			System.out.println(shape.getY()[i]);
		}
	}
}