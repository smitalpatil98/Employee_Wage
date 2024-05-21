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
		int IS_FULL_TIME = 1;
		//computation
		double empCheck = Math.floor(Math.random()*10)%2;
		//Math.floor() is used primarily to round a floating-point number down to the nearest integer value. 
		//Math.random() is a JavaScript function that generates a pseudo-random floating-point number between 0 (inclusive) and 1 (exclusive).
		//This function is commonly used when you need to generate random numbers for various purposes, such as simulations, games, or cryptographic applications.
		System.out.println(empCheck);
		if(empCheck == IS_FULL_TIME)
			System.out.println("Employee is Present");
		else
			System.out.println("Employee is absent");
	}	
}

