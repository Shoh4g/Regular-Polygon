import java.awt.Color;
/**
 * The Shape class is used to model general shapes. It has private instance 
 * variables for storing color, fill-type, orientation, screen coordinates of 
 * the center, and the local coordinates of the vertices of a shape. It has 
 * public getters and setters for accessing its private instance variables. 
 * It also has public methods for translating and rotating a shape, and for 
 * getting the screen coordinates of the vertices of a shape.
 * 
 * @author Sabyasachi Purkayastha 
 */
public class Shape
{
	/**
	 * A Color object specifying the Color of the Shape. 
	 */
	private Color color;
	/**
	 * A Boolean data type specifying whether the shape is filled or not filled.
	 */
	private boolean filled;
	/**
	 * A Double data type specifying the orientation (in radians) of the shape in 
	 * the screen coordinate system.
	 */
	private double theta;
	/**
	 * A Double data type specifying the x-coordinate of the center of the shape 
	 * in the screen coordinate system.
	 */
	private double xc;
	/**
	 * A Double data type specifying the y-coordinate of the center of the shape 
	 * in the screen coordinate system.
	 */
	private double yc;
	/**
	 * An Array of Double data types specifying the x-coordinates of the vertices 
	 * (in counter clock-wise order) of the shape in its local coordinate system.
	 */
	private double[] xLocal;
	/**
	 * An Array of Double data types specifying the y-coordinates of the vertices 
	 * (in counter clock-wise order) of the shape in its local coordinate system.
	 */
	private double[] yLocal;
	/**
	 * A method for retrieving the color of the shape.

	 * @return color Returns the color of the shape which is a private instance of the 
	 */
	public Color getColor()
	{
		return color;
	}
	/**
	 * A method for retrieving the fill-type of the shape.
	 * Getter Method.
	 * 
	 * @return filled Returns the fill-type of the shape which is a private instance of the Boolean data type.
	 */
	public boolean getFilled()
	{
		return filled;
	}
	/**
	 * A method for retrieving the orientation (in radians) of the shape in 
	 * the screen coordinate system.
	 * Getter Method.
	 * 
	 * @return theta Returns the orientation (in radians) of the shape which is a private
	 * 		instance of the Double data type.
	 */
	public double getTheta()
	{
		return theta;
	}
	/**
	 * A method for retrieving the x-coordinate of the center of the shape in
	 * the screen coordinate system.
	 * Getter Method.
	 * 
	 * @return xc
	 * Returns the x-coordinate of the center of the shape which is a 
	 */
	public double getXc()
	{
		return xc;
	}
	/**
	 * A method for retrieving the y-coordinate of the center of the shape in
	 * the screen coordinate system.
	 * Getter Method.
	 * 
	 * @return yc
	 * 		Returns the y-coordinate of the center of the shape which is a 
	 * 		
	 */
	public double getYc()
	{
		return yc;
	}
	/**
	 * A method for retrieving the x-coordinates of the vertices (in counter 
	 * clock-wise order) of the shape in its local coordinate system.
	 * Getter Method.
	 * 
	 * @return xLocal[] Returns the x-coordinates of the vertices of the shape which is a 
	 * 		
	 */
	public double[] getXLocal()
	{
		return xLocal;
	}
	/**
	 * A method for retrieving the y-coordinates of the vertices (in counter 
	 * clock-wise order) of the shape in its local coordinate system.
	 * Getter Method.
	 * 
	 * @return yLocal[]
	 * 		Returns the y-coordinates of the vertices of the shape which is a 
	 * 		
	 */
	public double[] getYLocal()
	{
		return yLocal;
	}
	/**
	 * A method for setting the color of the shape.
	 * Setter Method.
	 * 
	 * @param color
	 * 		Sets the color of the shape and is an instance of the
	 * 		
	 */
	public void setColor(Color color)
	{
		this.color = color;
	}
	/**
	 * A method for setting the fill-type of the shape.
	 * Setter Method.
	 * 
	 * @param filled
	 * 		Sets the fill-type of the shape and is an instance of the 
	 * 		
	 */
	public void setFilled(boolean filled)
	{
		this.filled = filled;
	}
	/**
	 * A method for setting the orientation of the shape. 
	 * Setter Method.
	 * 
	 * @param theta
	 * 		Sets the orientation of the shape and is an instance of the
	 * 		
	 */
	public void setTheta(double theta)
	{
		this.theta = theta;
	}
	/**
	 * A method for setting the x-coordinate of the center of the shape in the
	 * screen coordinate system.
	 * Setter Method.
	 * 
	 * @param xc
	 * 		Sets the x-coordinates of the center of the shape and is an
	 * 		
	 */
	public void setXc(double xc)
	{
		this.xc = xc;
	}
	/**
	 * A method for setting the y-coordinate of the center of the shape in the
	 * screen coordinate system.
	 * Setter Method.
	 * 
	 * @param yc
	 * 		Sets the y-coordinates of the center of the shape and is an
	 * 		
	 */
	public void setYc(double yc)
	{
		this.yc = yc;
	}
	/**
	 * A method for setting the x-coordinates of the vertices (in counter 
	 * clock-wise order) of the shape in its local coordinate system.
	 * Setter Method.
	 * 
	 * @param xLocal[]
	 * 		Sets the x-coordinates of the vertices of the shape and is an
	 * 		
	 */
	public void setXLocal(double[] xLocal)
	{
		this.xLocal = xLocal;
	}
	/**
	 * A method for setting the y-coordinates of the vertices (in counter 
	 * clock-wise order) of the shape in its local coordinate system.
	 * Setter Method.
	 * 
	 * @param yLocal[]
	 * 		Sets the y-coordinates of the vertices of the shape and is an
	 * 		
	 */
	public void setYLocal(double[] yLocal)
	{
		this.yLocal = yLocal;
	}
	/**
	 * A method for translating the center of the shape by dx and dy, 
	 * respectively, along the x and y directions of the screen coordinate 
	 * system (i.e., dx and dy should be added to xc and yc respectively.)
	 * 
	 * @param dx Translates the center of shape by dx 
	 * @param dy Translates the center of shape by dy and is an instance of the

	 */
	public void translate(double dx, double dy)
	{
		this.xc += dx;
		this.yc += dy;
	}
	/**
	 * A method for rotating the shape about its center by an angle of dt 
	 * (in radians), (i.e., dt should be added to theta.)
	 * 
	 * @param dt
	 * 		Rotates the shape of its center by angle of dt and is an instance
	 * 		of the Double data type
	 */
	public void rotate(double dt)
	{
		this.theta += dt;
	}
	/**
	 * a method for retrieving the x-coordinates of the vertices (in counterclockwise
     * order) of the shape in the screen coordinate system (rounded to nearest
     * integers).
     * 
	 * @return x-coordinates of the vertices.
	 */

	public int[] getX()
	{
		int[] xr = new int[this.getXLocal().length];
		
		double cosTheta = Math.cos(this.getTheta());
		double sinTheta = Math.sin(this.getTheta());
		
		for (int i=0; i< this.getXLocal().length; i++) {
			
			xr[i]=(int)Math.round(this.getXLocal()[i]*cosTheta-this.getYLocal()[i]*sinTheta+this.getXc());
		}
		return xr;
	}

	/**
	 * a method for retrieving the y-coordinates of the vertices (in counterclockwise
     * order) of the shape in the screen coordinate system (rounded to nearest
     * integers).
     * 
	 * @return y-coordinates of the vertices.
	 */
	public int[] getY()
	{
		int[] yr = new int[this.getYLocal().length];
		
		double cosTheta = Math.cos(this.getTheta());
		double sinTheta = Math.sin(this.getTheta());
		
		for (int i=0; i< this.getYLocal().length; i++) {
			
			yr[i]=(int)Math.round(this.getXLocal()[i]*sinTheta+this.getYLocal()[i]*cosTheta+this.getYc());
		}
		return yr;
	}
}