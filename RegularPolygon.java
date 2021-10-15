/**
 * The RegularPolygon class is a subclass of the Shape class, and is used to
 * model regular n-sided polygons. Besides the properties it inherited from 
 * the Shape class, the RegularPolygon class also declares a number of private 
 * instance variables for storing the number of sides and the radius of a 
 * polygon. It has public getters and setters for accessing its private 
 * instance variables. It also has public methods for setting the local 
 * coordinates of the vertices of a polygon and for checking if a point 
 * (in the screen coordinate system) is contained by a polygon.
 * 
 * @author Sabyasachi Purkayastha
 */
public class RegularPolygon extends Shape
{
	/**
	 * An Integer data type value specifying the number of sides of the 
	 * regular n-sided polygon.
	 * It is a private instance variable.
	 */
	private int numOfSides;
	/**
	 * A Double data type value specifying the radius of the regular 
	 * It is a private instance variable.
	 */
	private double radius;
	/**
	 * A constructor for building a regular n-sided polygon with a radius
	 * of r. (Note that if the argument n is less than 3, the number of 
	 * sides will be set to 3; if the argument r is less than 0, the radius
	 * will be set to 0).
	 * 
	 * @param n number of sides
	 * @param r radius of the regular polygon
	 */
	public RegularPolygon(int n, double r)
	{
		if(n >= 3)
		{
			this.numOfSides = n;
		}
		else
		{
			this.numOfSides = 3;
		}
		if(r >= 0)
		{
			this.radius = r;
		}
		else
		{
			this.radius = 0;
		}
		this.setVertices();
	}
	/**
	 * A constructor for building a regular n-sided polygon with a radius 
	 * of 1.0. (Note that if the argument n is less than 3, the number of 
	 * sides will be set to 3).
	 * 
	 * @param n number of sides and is an Integer data type.
	 */
	public RegularPolygon(int n)
	{
		if(n >= 3)
		{
			this.numOfSides = n;
		}
		else
		{
			this.numOfSides = 3;
		}

		this.radius = 1.0d;
		this.setVertices();
	}
	/**
	 * A constructor for building a regular 3-sided polygon with a radius
	 * of 1.0.
	 */
	public RegularPolygon()
	{
		this.numOfSides = 3;
		this.radius = 1.0d;
		this.setVertices();
	}
	/**
	 * A method for retrieving the number of sides of the regular polygon.
	 * Getter Method.
	 * 
	 * @return numOfSides Returns the number of sides of the regular polygon and is of the
	 */
	public int getNumOfSides()
	{
		return this.numOfSides;
	}
	/**
	 * A method for retrieving the radius of the regular polygon.
	 * 
	 * @return radius radius of the regular polygon and is of the Double
	 */
	public double getRadius()
	{
		return this.radius;
	}
	/**
	 * A method for setting the number of sides of the regular n-sided 
	 * polygon. This method should also reset the local coordinates of the 
	 * vertices of the regular n-sided polygon. (Note that if the argument 
	 * n is less than 3, the number of sides will be set to 3).
	 * Setter Method.
	 * 
	 * @param n number of sides of the regular n-sided polygon and is Integer data type.
	 */
	public void setNumOfSides(int n)
	{
		if(n >= 3)
		{
			this.numOfSides = n;
		}
		else
		{
			this.numOfSides = 3;
		}
		this.setVertices();
	}
	/**
	 * A method for setting the radius of the regular n-sided polygon. 
	 * This method should also reset the local coordinates of the vertices 
	 * of the regular n-sided polygon. (Note that if the argument r is 
	 * less than 0, the radius will be set to 0).
	 * Setter Method.
	 * 
	 * @param r the radius of the regular n-sided polygon and is of Double data type.
	 */
	public void setRadius(double r)
	{
		if(r >= 0)
		{
			this.radius = r;
		}
		else
		{
			this.radius = 0;
		}
		this.setVertices();
	}
	/**
	 * A method for setting the local coordinates of the vertices of the 
	 * regular n-sided polygon based on its number of sides and radius.
	 * 
	 * If the number of sides is an odd number, the first vertex should 
	 * lie on the positive x-axis and its distance from the origin is 
	 * given by the radius of the regular n-sided polygon. The rest of 
	 * the vertices can be obtained by rotating this vertex about the 
	 * origin by a multiple of 2PI/n, where n is the number of sides, 
	 * in a counter clock-wise manner.
	 * If the number of sides is an even number, the first vertex should
	 * lie in the first quadrant (i.e., both its x and y coordinates being
	 * positive) and make an angle of PI/n, where n is the number of sides, 
	 * with the positive x-axis. Its distance from the origin is again 
	 * given by the radius of the regular n-sided polygon. Similarly, the 
	 * rest of the vertices can be obtained by rotating this vertex about 
	 * the origin by a multiple of 2PI/n, where n is the number of sides, 
	 * in a counter clock-wise manner.
	 */
	private void setVertices()
	{
		
		int N = this.getNumOfSides();
		double R = this.getRadius();
		double PI = Math.PI; 
		
		double theta = (2 * PI) / N;
		double alpha;
		if(N % 2 != 1)
		{
			alpha = (PI/N);
		}
		else
		{
			alpha = 0;
		}
		//stores the x-coordinates
		double[] xCoordinates = new double[N];
		//stores the y-coordinates
		double[] yCoordinates = new double[N];
		
		for(int i = 0; i < N; i++)
		{
			xCoordinates[i] = (R * Math.cos(alpha - (i*theta)));
			yCoordinates[i] = (R * Math.sin(alpha - (i*theta)));
		}
		//stores the local coordinates of the vertices of a regular n-sided polygon.
		setXLocal(xCoordinates);
		setYLocal(yCoordinates);
	}
	/**
	 * A method for determining if a point (x, y) in the screen coordinate
	 * system is contained by the regular n-sided polygon. A point is 
	 * considered to be contained by a polygon if it lies either completely 
	 * inside the polygon, or on any of the sides or vertices of the polygon.
	 * 
	 * We use the concept of rotation matrix to perform the rotation by 2PI/n.
	 * 
	 * @param x x-coordinate of the point (x, y) and instance is of Double data type.
	 * @param y y-coordinate of the point (x, y) and instance is of Double data type.
	 * @return true or false returns true or false depending whether it lies inside the polygon or not.
	 */
	
	//https://en.wikipedia.org/wiki/Rotation_matrix
	
	public boolean contains(double x, double y)
	{
		
		
		int N = this.getNumOfSides();
		double xbar = this.getXc();
		double ybar = this.getYc();
		double theta = this.getTheta();
		double PI = Math.PI;
		double min = 0.0;
		
		
		
		//Transforming (x, y) from screen coordinates to local coordinates.
		double localX = (x - xbar) * Math.cos(-theta) - (y - ybar) * Math.sin(-theta);
		double localY = (x - xbar) * Math.sin(-theta) + (y - ybar) * Math.cos(-theta);
		
		double TempX = localX;
		//Calculates the minimum x in getXmin. 
		
		//The logic used to code here is taken from Rotation Matrix in Eucledean Space. https://en.wikipedia.org/wiki/Rotation_matrix
		
		
	   int i = 0;
	   while (i<N-1) 
	   {
		   if(getXLocal()[i] <= min)
			{
			   min = getXLocal()[i];
			}
		   
		   i++;
		   
	   }
		
	   int j = 0;
	   while(j<=N-1) 
	   {
		   if(TempX < min)
			{
				return false;
			}
		    double X = localX * Math.cos(2 * j * PI/ N);
		    double Y = localY * Math.sin(2 * j * PI / N);
		   
			TempX = (X - Y);
		   j++;
	   }
	   return true;
		
	}
}