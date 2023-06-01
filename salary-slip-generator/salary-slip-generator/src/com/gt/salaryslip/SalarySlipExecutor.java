
/* Made By - Parth Joshi
This Project is made to gain the practical knowledge by implimenting almost all the concepts that I learnt while learning OOPS.
This is only a Basic Project that follows SRP also.
*/

package com.gt.salaryslip;

import com.gt.salaryslip.models.Employee;
import com.gt.salaryslip.service.EmployeeService;
import com.gt.salaryslip.views.Printing;
import com.gt.salaryslip.views.UserInput;

public class SalarySlipExecutor {
	// this is first executing file as it contains the main function.

	public static void main(String[] args) {
		UserInput input = new UserInput();
		Employee emp = input.takeInput();
		EmployeeService service = new EmployeeService(emp.getSalary());
		Printing printing = new Printing();
		printing.printSalarySlip(emp, service);

	}

}



// Breif Description of the Packages and Files made in this Project for the understanding in the future easily.
// views package contains only the files that are viewed or displayed to the user.
// servce package contains the pure logics, used for the calculations of hra,da,ta,ma,gs,ns,pf.
// models package contains the blueprint of our project.
// SalarySlipExecuter.java is the main file of our project, it contains the main funciton, so it will executes first.
	// and its work is only to run the project properly.
//Printing.java file only be used to print the data on the screen.
// UserInput.java file only be used to take the input from the user.