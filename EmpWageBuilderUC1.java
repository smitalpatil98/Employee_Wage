//Check Employee is
//Present or Absent
//- Use ((RANDOM)) for Attendance
//Check
package Employee_Wage;

public class EmpWageBuilderUC1 
{
	public static void main(String[] args) 
	{
		//Constants
		int IS_PART_TIME = 1;
		int IS_FULL_TIME = 1;
		int EMP_RATE_PER_HOUR = 20;
		//Variables
		int empHrs = 0;
		int empWage = 0;
		//computation
		double empCheck = Math.floor(Math.random()*10)%3;
		//Math.floor() is used primarily to round a floating-point number down to the nearest integer value. 
		//Math.random() is a JavaScript function that generates a pseudo-random floating-point number between 0 (inclusive) and 1 (exclusive).
		//This function is commonly used when you need to generate random numbers for various purposes, such as simulations, games, or cryptographic applications.
		//System.out.println(empCheck);
		if(empCheck == IS_PART_TIME)
			empHrs = 4;
		else if(empCheck == IS_FULL_TIME)
			empHrs = 8;
		else
			empHrs = 0;
		empWage = empHrs * EMP_RATE_PER_HOUR;
		System.out.println("Emp Wage: "+ empWage);
	}	
}

