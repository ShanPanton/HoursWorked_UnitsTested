/**
 * 
 */
package edu.cincinnatistate.pay;

/**
 * @author Shanique Panton
 *
 */
public class HoursWorked {

	private int intTotalHrs;
	  
	   /**
	* Receives intHours which is stored in intTotalHours
	* @return none
	* @param int hours
	*/
	   public HoursWorked(int intHours) {
	       intTotalHrs = intHours;
	   }
	  
	   /**
	* Adds intHours to intTotalHrs
	* @return void
	* @param int intHours
	*/
	   public void addHours (int intHours) {
	       intTotalHrs += intHours;
	   }
	  
	   /**
	* Subtracts intHours from intTotlHrs
	* @return void
	* @param int intHours
	*/
	   public void subHours (int intHours) {
	       intTotalHrs -= intHours;
	   }
	  
	   /**
	* Returns the total hours
	* @return int intTotalhrs
	*/
	   public int returnTotalHours() {
	       return intTotalHrs;
	   }

}
