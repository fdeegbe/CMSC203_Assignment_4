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
public class ManagementCompany {
//Fields
	private final int MAX_PROPERTY = 5;
	private final int MGMT_WIDTH = 10;
	private final int MGMT_DEPTH = 10;
	private double mgmFeePer;
	private String name;
	private Property[] properties;
	private String taxID;
	private Plot plot;
//	private int count = 0;
//Constructors
	/**
	 * No-Arg Constructor that creates a ManagementCompany object using empty strings and the plot set to a Plot with x, y set to 0 , width and depth set to 10.
properties array is initialized here as well.
	 */
	public ManagementCompany() {
		name = "";
		taxID = "";
		mgmFeePer = 0;
		properties = new Property[MAX_PROPERTY];
		plot = new Plot(0,0, MGMT_WIDTH, MGMT_DEPTH);
	}
	/**
	 * Constructor Creates a ManagementCompany object using the passed information.
plot is set to a Plot with x, y set to 0 , width and depth set to 10
properties array is initialized here as well
	 * @param name
	 * @param taxID
	 * @param mgmFee
	 */
	public ManagementCompany(String name, String taxID, double mgmFee) {
		this.name = name;
		this.taxID = taxID;
		mgmFeePer = mgmFee;
		properties = new Property[MAX_PROPERTY];
		plot = new Plot(0,0, MGMT_WIDTH, MGMT_DEPTH);
	}
	/**
	 * Constructor Creates a ManagementCompany object using the passed information.
	 * @param name
	 * @param taxID
	 * @param mgmFee
	 * @param x
	 * @param y
	 * @param width
	 * @param depth
	 */
	public ManagementCompany(String name, String taxID,double mgmFee,int x, int y, int width, int depth) {
		this.name = name;
		this.taxID = taxID;
		mgmFeePer = mgmFee;
		properties = new Property[MAX_PROPERTY];
		plot = new Plot(x, y, width, depth);
	}
	/**
	 * Copy Constructor that creates a ManagementCompany object from another ManagementCompany object
	 * @param otherCompany
	 */
	public ManagementCompany(ManagementCompany otherCompany) {
		name = otherCompany.name;
		taxID = otherCompany.taxID;
		mgmFeePer = otherCompany.mgmFeePer;
		properties = new Property[MAX_PROPERTY];
		plot = new Plot(otherCompany.plot);
	}
	//Methods
	/**
	 * Return the MAX_PROPERTY constant that represents the size of the "properties" array.
	 * @return the max_property
	 */
	public int getMAX_PROPERTY() {
		return MAX_PROPERTY;
	}

	/**
	 * Creates a property object with a default plot and adds it to the "properties" array.
	 * @param name
	 * @param city
	 * @param rent
	 * @param owner
	 * @return Returns either -1 if the array is full, -2 if property is null, -3 if the plot is not contained by the MgmtCo plot, -4 of the plot overlaps any other property, or the index in the array where the property was added successfully.
	 */
	public int addProperty(String name,String city,double rent,String owner) {
		Property property = new Property(name, city, rent, owner);
		int i = 0;
		
		// if property is null
		if(property == null)
			return -2;

			//if the plot is not contained by the MgmtCO plot
			if(plot.encompasses(property.getPlot()) == false)
				return -3;
			
		for (i = 0; i < MAX_PROPERTY; i++) {
			
			//successful
			if (properties[i] == null) {
				properties[i] = property;
				return i;
			}
				//if the plot overlaps any other property 
				if(property.getPlot().overlaps(properties[i].getPlot()) == true )
					return -4;
			}
			return -1;
	}
	
	/**
	 *  returns the plot 
	 * @return plot
	 */
	public Plot getPlot() {
		return plot;
	}
	
	/**
	 *  Creates a property object and adds it to the "properties" array.
	 * @param name
	 * @param city
	 * @param rent
	 * @param owner
	 * @param x
	 * @param y
	 * @param width
	 * @param depth
	 * @return return -1 if the array is full ,
-2 if the Property object is null
-3 if if management company does not encompass the property plot
-4 if property plot overlaps ANY of properties in array
otherwise return the index of the array where the property was added.
	 */
	public int addProperty(String name,String city,double rent,String owner,int x,int y,int width,int depth) {
		Property property = new Property(name, city, rent, owner,x ,y, width, depth);
		int i = 0;
		
		// if property is null
		if(property == null)
			return -2;

			//if the plot is not contained by the MgmtCO plot
			if(plot.encompasses(property.getPlot()) == false)
				return -3;
			
		for (i = 0; i < MAX_PROPERTY; i++) {
			
			//successful
			if (properties[i] == null) {
				properties[i] = property;
				return i;
			}
				//if the plot overlaps any other property 
				if(property.getPlot().overlaps(properties[i].getPlot()) == true )
					return -4;
			}
			return -1;
	}
	/**
	 * Creates a property object by copying from another property and adds it to the "properties" array.
	 * @param property
	 * @return -1 if the array is full ,
-2 if the Property object is null
-3 if if management company does not encompass the property plot
-4 if property plot overlaps ANY of properties in array
otherwise return the index of the array where the property was added.
	 */
	public int addProperty(Property property) {
		int i = 0;
		
		// if property is null
		if(property == null)
			return -2;

			//if the plot is not contained by the MgmtCO plot
			if(plot.encompasses(property.getPlot()) == false)
				return -3;
			
		for (i = 0; i < MAX_PROPERTY; i++) {
			
			//successful
			if (properties[i] == null) {
				properties[i] = property;
				return i;
			}
				//if the plot overlaps any other property 
				if(property.getPlot().overlaps(properties[i].getPlot()) == true )
					return -4;
			}
			return -1;
	}
		/**
		 *           This method accesses each "Property" object within the array "properties" and sums up the property rent and returns the total amount.
		 * @return the total rent
		 */
		public double totalRent() {
			double sum = 0;
			for (int i = 0; i < properties.length; i++) {
				if (properties[i] == null)
					break;
				
				sum += properties[i].getRentAmount();
			}
				return sum;
		}
		/**
		 *           This method finds a property within the properties array that has the maximum rent amount and returns the rent amount.
		 * @return the max rent value
		 */
		public double maxRentProp() {
			Property high;
			int i = 0;
			high = properties[i];
			for (; i < properties.length - 1; i++) {
				if (properties[i + 1] == null)
					break;
				if (high.getRentAmount() < properties[i + 1].getRentAmount()) {
					high = properties[i + 1];
				}
			}
				//return it's toString result?
				return high.getRentAmount();
		}
		/**
		 *           This method finds the index of the property with the maximum rent amount.
		 * @return the index of the property with the maximum rent amount
		 */
		private int maxRentPropertyIndex() {
			Property high;
			int i = 0;
			int save = 0;
			high = properties[i];
			for (; i < properties.length - 1; i++) {
				if (high.getRentAmount() < properties[i + 1].getRentAmount()) {
					high = properties[i];
					save = i;
				}
			}
			return save;
		}
		/**
		 * Displays the information of the property at index i
		 * @param i - The index of the property within the array "properties"
		 * @return information of the property at index i
		 */
		private String displayPropertyAtIndex(int i){
			return properties[i].toString();
		}
		/**
		 *  returns the name of the mgmt company
		 * @return the name
		 */
		public String getName() {
			return name;
		}
/**
 * Displays the information of all the properties in the "properties" array.
 * @return information of ALL the properties within this management company by accessing the "Properties" array.
 */
		public String toString() {
			int i = 0;
			String s = "List of the properties for " + name + ", taxID: " + taxID + "\n" + "______________________________________________________\n";
			while(properties[i] != null) {
				s += properties[i].toString() + "\n";
				i++;
			}
			s += "______________________________________________________\n total management fee: " + totalRent() ;
			return s;
			
		}

		
	
			
}
