import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class ManagementCompanyTestSTUDENT {
	
	
	ManagementCompany manage;
	
	@Before
	public void setUp() throws Exception {
		//student create a management company
		manage = new ManagementCompany();
		//student add three properties, with plots, to mgmt co
		manage.addProperty("abc", "abc", 100, null, 3, 3, 1, 1);
		manage.addProperty("abc", "abc", 100, null, 1, 1, 1, 1);
		manage.addProperty("abc", "abc", 100, null, 2, 2, 1, 1);
		
	}
	
	@After
	public void tearDown() {
		//student set mgmt co to null  
		manage = null;
	}

	@Test
	public void testAddPropertyDefaultPlot() {
		//student should add property with 4 args & default plot (0,0,1,1)
		manage.addProperty("abc", "abc", 200, null);
		//student should add property with 8 args
		manage.addProperty("abc", "abc", 100, null, 4, 4, 1, 1);
		//student should add property that exceeds the size of the mgmt co array and can not be added, add property should return -1
		assertEquals(manage.addProperty("abc", "abc", 100, null, 5, 5, 1, 1), -1);
	}
 
	@Test
	public void testMaxRentProp() {
		//student should test if maxRentProp contains the maximum rent of properties
		assertEquals(manage.maxRentProp(), .01, 200);
	}

	@Test
	public void testTotalRent() {
		//student should test if totalRent returns the total rent of properties
		assertEquals(manage.totalRent(), .01, 600);
	}

 }
