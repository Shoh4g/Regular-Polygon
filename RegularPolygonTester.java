import java.awt.Color;
/**
 * A RegularPolygonTester Class to verify the correctness of the implementation of the
 * RegularPolygon Class.
 * The RegularPolygonTester Class will create an object of the RegularPolygon
 * Class and access all its instance variables and methods using the dot 
 * operator, and print out debugging messages to the console.
 * 
 * @author Sabyasachi Purkayastha
 */
public class RegularPolygonTester
{
	/**
	 * A main method to create an object of the RegularPolygon Class and 
	 * access its instant variables and methods using the dot operator;
	 * printing out debugging messages to the console. 
	 */
	public static void main(String[] args)
	{
		//Creating an object polygon of the RegularPolygon class.
		//For constructor RegularPolygon(int n, double r).

		RegularPolygon polygon = new RegularPolygon(5, 5.0d);

		//Using getter methods to get radius and numOfSides
		System.out.println("The number of sides using getters are: " + polygon.getNumOfSides());
		System.out.println("The radius retrieved using getter is: " + polygon.getRadius());
		//Creating an object polygon2 of the RegularPolygon class.

		RegularPolygon polygon2 = new RegularPolygon(6);

		//Using getter methods to get radius and numOfSides
		System.out.println("The number of sides retrieved using getters are: " + polygon2.getNumOfSides());
		System.out.println("The radius retrieved using getter is: " + polygon2.getRadius());

		RegularPolygon polygon3 = new RegularPolygon();

		//Using getter methods to get radius and numOfSides
		System.out.println("The number of sides retrieved using getters are: " + polygon3.getNumOfSides());
		System.out.println("The radius retrieved using getter is: " + polygon3.getRadius());

	
		Color color = new Color(0, 250, 108);

		polygon.setColor(color);
		System.out.println("color assigned using setters.");

		System.out.println("color assigned to the RegularPolygon retrieved using getters: " + polygon.getColor());
		boolean filled = true;
		
		//Using Setter Method select filled = true to RegularPolygon Object.
		polygon.setFilled(filled);
		System.out.println("Filled has been set to be true using setters.");
		
		//Using Getter Method to get filled for the RegularPolygon Object.
		System.out.println("The filled retrieved using getters: " + polygon.getFilled());

		double theta = (Math.PI / 8);

		polygon.setTheta(theta);
		System.out.println("Theta has been set to be PI/8 using setters");

		System.out.println("The theta retrieved using getters " + polygon.getTheta());
		double xc = 6.0d;

		polygon.setXc(xc);
		System.out.println(" x-coordinate of the center xc is set using setters");

		System.out.println("The xc is retrieved using getters " + polygon.getXc());
		double yc = 6.0d;

		polygon.setYc(yc);
		System.out.println("y-coordinate of the center yc is set using setters");
		
		System.out.println(" The yc has been retrieved using getters: " + polygon.getYc());

		double dx = (Math.PI / 6);
		double dy = (Math.PI / 6);
		
		polygon.translate(dx, dy);
		//Using Getter Method to get the new center coordinates for the RegularPolygon Object.
		
		System.out.println(" xc and yc retrieved using getters: ");
		System.out.println(polygon.getXc());
		System.out.println(polygon.getYc());
		

		double dt = (Math.PI / 8);
		polygon.rotate(dt);
		//Using Getter Method to get the theta for the RegularPolygon Object.

		System.out.println(" theta retrieved using getters: " + polygon.getTheta());

		int numOfSides = 4;

		polygon.setNumOfSides(numOfSides);
		System.out.println("No of sides set using setters");
		//Using Getter Method to get numOfSides for the RegularPolygon Object.	
		
		System.out.println("Number of sides retrieved using getters: " + polygon.getNumOfSides());

		double radius = 6.0d;
		//Using Setter Method select radius = 5.0d to RegularPolygon Object.
		polygon.setRadius(radius);
		System.out.println("(adius has been set using setters");

		System.out.println("Radius retrieved using getters " + polygon.getRadius());
		//Using Getter Method to get xLocal[] for the RegularPolygon Object.
		System.out.println("The x-coordinates retrieved using getters: ");
		
		for(int i = 0; i < polygon.getXLocal().length; i++)
		{
			System.out.println(polygon.getXLocal()[i]);
		}
	
		System.out.println("The y-coordinates retrieved using getters ");
		for(int i = 0; i < polygon.getYLocal().length; i++)
		{
			System.out.println(polygon.getYLocal()[i]);
		}
		//Checking if a point (x, y) is contained in the RegularPolygon.
		
		System.out.println("checks" + polygon.contains(3.0d,3.0d));

		//xLocal double array assigned to {11.0d, 22.0d, 33.0d, 44.0d, 55.0d};
		double[] xLocal = new double[] {11.0d, 22.0d, 33.0d, 44.0d, 55.0d};

		//Using Setter Method select xLocal[] to RegularPolygon Object.
		polygon.setXLocal(xLocal);
		
		for(int i = 0; i < polygon.getXLocal().length; i++)
		{
			System.out.println(polygon.getXLocal()[i]);
		}
		//yLocal double array assigned to {3.0d, 5.0d, 6.0d, 7.0d, 9.0d};
		double[] yLocal = new double[] {3.0d, 5.0d, 6.0d, 7.0d, 9.0d};
	
	
		polygon.setYLocal(yLocal);
		System.out.println("y-coordinates of the yLocal using setters.");
		//Using Getter Method to get yLocal[] for the RegularPolygon Object.
		System.out.println("The y-coordinates retrieved using getters");

		for(int i = 0; i< polygon.getYLocal().length; i++)
		{
			System.out.println(polygon.getYLocal()[i]);
		}
		//Checking if a point (x, y) is contained in the RegularPolygon.

		System.out.println("checks: " + polygon.contains(2.0d,2.0d));
	}
}