import static org.junit.Assert.*;

import org.junit.Test;

public class EmpBusinessLogicTest {

	EmployeeDetails eD = new EmployeeDetails();
	EmpBusinessLogic eB = new EmpBusinessLogic();
	
	
	
	
	@Test
	public void testCalculateYearlySalary() {
		eD.setName("John");
		eD.setAge(30);
		eD.setMonthlySalary(3000);
		double salary = eB.calculateYearlySalary(eD);
		assertEquals(36000, salary, 0.0);
	}

	@Test
	public void testCalculateAppraisal() {
		eD.setMonthlySalary(1000);
		double app = eB.calculateAppraisal(eD);
		assertEquals(1000, app, 0.0);
	}

}
