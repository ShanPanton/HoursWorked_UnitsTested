/**
 * 
 */
package edu.cincinnatistate.pay;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author Shanique Panton
 *
 */
public class HoursWorkedTest {
	
	int defaultHoursWorked; //to store default hours worked
	   @BeforeEach
	   void setupMethod() {
	       defaultHoursWorked = 8;
	   }
	   
	   //positive test case for add hours
	   @Test
	   void testAddHours() {
	       HoursWorked hwObj = new HoursWorked(defaultHoursWorked);
	       hwObj.addHours(5);
	       assertEquals(hwObj.returnTotalHours(), 13, "Hours are not equal");
	   }
	  
	 
	   //negative test case for subtract hours
	   @Test
	   void testSubHoursError() {
	       HoursWorked hwObj = new HoursWorked(defaultHoursWorked);
	       hwObj.subHours(3);
	       //8hrs - 3hrs  will result in 5hrs but we are checking for 8hrs so this will throw an error
	       assertEquals(hwObj.returnTotalHours(), 8, "Error case");
	   }

}
