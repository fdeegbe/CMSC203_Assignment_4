/*
* Class: CMSC203
* Instructor: Khandan Vahabzadeh Monshi
* Description: Method descriptions are provided above their respective headers
* Due: 10/25/2021
* Platform/compiler: Eclipse IDE
* I pledge that I have completed the programming assignment
independently.
I have not copied the code from a student or any source.
I have not given my code to any student.
Print your Name here:  Frank Deegbe	
*/

/**
 * Represents a plot object
 * @author Frank
 *
 */
public class Plot {
	//Fields
	private int x;
	private int y;
	private int width;
	private int depth;
	//Constructors
	/** 
	 *           Copy Constructor, creates a new object using the information of the object passed to it.
	 * @param p
	 */
	public Plot(Plot p) { // Copy
		x = p.x;
		y = p.y;
		width = p.width;
		depth = p.depth;
	}
	/**
	 * No-arg Constructor, creates a default Plot with args x=0, y=0, width=1, depth=1
	 */
	public Plot() { // No-arg
		x = 0;
		y = 0;
		width = 1;
		depth = 1;
	}
/**
 * Parameterized Constructor
 * @param x
 * @param y
 * @param width
 * @param depth
 */
	public Plot(int x, int y, int width, int depth) { //Parameterized
		this.x = x;
		this.y = y;
		this.width = width;
		this.depth = depth;
	}
	
	//Methods
	/**
	 * takes a Plot instance and determines if the current plot contains it.
Note that the determination should be inclusive, in other words, if an edge lies on the edge of the current plot, this is acceptable.
	 * @param r
	 * @return Returns true if this plot encompasses the parameter, false otherwise
	 */
	public boolean overlaps(Plot r) {
		boolean u = true;
		if (x >= r.x + r.width ||
				y >= r.y + r.depth ||
				x + width <= r.x ||
				y + depth <= r.y)
			u = false;
		return u;
	}
	/**
	 *    takes a Plot instance and determines if the current plot contains it.
Note that the determination should be inclusive, in other words, if an edge lies on the edge of the current plot, this is acceptable.
	 * @param p
	 * @return Returns true if this plot encompasses the parameter, false otherwise
	 */
	
	public boolean encompasses(Plot p) {
		if (x <= p.getX() &&
				y <= p.getY() &&
				x + width >= p.getX() + p.getWidth() &&
				y + depth >= p.getY() + p.getDepth()) {
			return true;
		}
		return false;
	}
	/**
	 * 
	 * Set the x value
	 * @return x - the x value to set
	 */
	public int getX() {
		return x;
	}
	/**
	 * Return the Y value
	 * @return the y value
	 */
	public int getY() {
		return y;
	}
	
	/**
	 * Set the width value
	 * @return width - the width value to set
	 */
	public int getWidth() {
		return width;
	}
	/**
	 * Sets the depth value
	 * @return depth - the depth value to set
	 */
	public int getDepth() {
		return depth;
	}
	/**
	 * Set the x value
	 * @param x - the x value to set
	 */
	public void setX(int x) {
		this.x = x;
	}
	/**
	 * Sets the y value
	 * @param y - the y value to set
	 */
	public void setY(int y) {
		this.y = y;
	}
	/**
	 * Set the width value
	 * @param width the width value to set
	 */
	public void setWidth(int width) {
		this.width = width;
	}
	/**
	 *  Set the depth value
	 * @param depth - the depth value to set
	 */
	public void setDepth(int depth) {
		this.depth = depth;
	}
	/**
	 * Prints out the name, city, owner and rent amount for a property
	 * @return the string representation of a Plot object in the following format: Upper left: (1,1); Width: 3 Depth: 3
	 */
	public String toString() {
		return("Upper left: (" + x + "," + y + "); Width: " 
				+ width + " Depth: " + depth);
	}
	
}
