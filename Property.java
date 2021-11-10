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
Print your Name here: Frank Deegbe	
*/
public class Property {
	private String city;
	private String owner;
	private String propertyName;
	private double rentAmount;
	private Plot plot;
	
	//Constructors
	/**
	 * No-arg Constructor, creates a new object with default values of empty strings, 0 for rent amount, and default Plot
	 */
	Property(){
		city = "";
		owner = "";
		propertyName = "";
		rentAmount = 0;
		plot = new Plot(); 
		
	}
	// copy constructor (check for accuracy?)
	/**
	 * Copy Constructor, creates a new object using the information of the object passed to it.
	 * @param p
	 */
	Property(Property p){
		
		city = p.city;
		owner = p.owner;
		propertyName = p.propertyName;
		rentAmount = p.rentAmount;
		plot = new Plot(p.plot);
	
	}
	//no plot information provided
	/**
	 * Constructor, Parameterized constructor with no Plot information (uses default Plot where x,y are set to 0, width and depth set to 1)
	 * @param propertyName
	 * @param city
	 * @param rentAmount
	 * @param owner
	 */
	Property(String propertyName, String city, double rentAmount, String owner){
		this.city = city;
		this.owner = owner;
		this.propertyName = propertyName;
		this.rentAmount = rentAmount;
		plot = new Plot(); 
	}
	//skip for now
	/**
	 * Constructor, Parameterized constructor
	 * @param propertyName
	 * @param city
	 * @param rentAmount
	 * @param owner
	 * @param x
	 * @param y
	 * @param width
	 * @param depth
	 */
	Property(String propertyName, String city, double rentAmount, String owner, int x, int y, int width, int depth ){
		this.city = city;
		this.owner = owner;
		this.propertyName = propertyName;
		this.rentAmount = rentAmount;
		//create plot object
		plot = new Plot(x,y,width,depth);
	}
	//Methods
	/**
	 * return the city
	 * @return the city
	 */
	public String getCity() {
		return city;
	}
	/**
	 * return the owner name
	 * @return the owner name
	 */
	public String getOwner() {
		return owner;
	}
	/**
	 * Return the property Name
	 * @return the property name
	 */
	public String getPropertyName() {
		return propertyName;
	}
	/**
	 * return the rent amount
	 * @return the rent amount
	 */
	public double getRentAmount() {
		return rentAmount;
	}
	/**
	 * set the Plot values and return the Plot instance
	 * @param x
	 * @param y
	 * @param width
	 * @param depth
	 * @return
	 */
	public Plot setPlot(int x, int y, int width, int depth) {
		return plot = new Plot(x,y,width,depth);
	}
	/**
	 * set the city
	 * @param city
	 */
	public void setCity(String city) {
		this.city = city;
	}
	/**
	 * set the owner name
	 * @param owner
	 */
	public void setOwner(String owner) {
		this.owner = owner;
	}
	/**
	 * set the property name
	 * @param propertyName
	 */
	public void setPropertyName(String propertyName) {
		this.propertyName = propertyName;
	}
	/**
	 *  set the rent amount
	 * @param rentAmount
	 */
	public void setRentAmount(double rentAmount) {
		this.rentAmount = rentAmount;
	}
	
	/**
	 * return the plot witdth
	 * @return width
	 */
	public int getPlotWidth() {
		return plot.getWidth();
	}
	/**
	 * return the plot depth
	 * @return depth
	 */
	public int getPlotDepth() {
		return plot.getDepth();
	}
	/**
	 *           Prints out the name, city, owner and rent amount for a property.
          Example:
              Property Name: Lakewood
               Located in Rockville
               Belonging to: Alex Tan
               Rent Amount: 3000.0
          Be sure the last item is the rent amount, preceded by a space.
	 */
	@Override
	public String toString() {
		return ("Property name: " + propertyName + "\n"
						+ " Located in: " + city + "\n"
						+ " Belonging to: " + owner + "\n" 
						+ "Rent Amount: " + rentAmount + " ");
		//you can use \n here!
	}
	public Plot getPlot() {

		return plot;
	}
}
