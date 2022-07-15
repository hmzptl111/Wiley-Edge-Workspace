package com.sujata.presentation;

import java.util.List;
import java.util.Scanner;

import com.sujata.bean.Employee;
import com.sujata.bean.Payslip;
import com.sujata.service.EmployeeService;
import com.sujata.service.EmployeeServiceImpl;

public class EmployeePresentationImpl implements EmployeePresentation {

	private EmployeeService employeeService=new EmployeeServiceImpl();
	
	@Override
	public void showMenu() {
		System.out.println("1. Show all employees");
		System.out.println("2. Search employee By ID");
		System.out.println("3. Add employee");
		System.out.println("4. Delete employee");
		System.out.println("5. Print employee payslip");
		System.out.println("5. Exit");
	}

	@Override
	public void performMenu(int choice) {
		Scanner scanner=new Scanner(System.in);
		try {
		switch (choice) {
		case 1:
			List<Employee> employees=employeeService.getAllEmployees();
			for(Employee employee:employees) {
				System.out.println(employee.getEmpId()+"  "+employee.getEmpName());
			}
			break;

		case 2:
			System.out.println("Enter Employee ID : ");
			int id=scanner.nextInt();
			Employee empl=employeeService.searchEmployeeById(id);
			if(empl!=null) {
				System.out.println(empl.getEmpId()+"  "+empl.getEmpName());
			}
			else
				System.out.println("Employee with id "+id+" does not exist");
			break;
		case 3:
			System.out.println("ID Name Designation Department Salary");
			String[] input = scanner.nextLine().split(" ");
			
			int newEmployeeID = Integer.parseInt(input[0]);
			String newEmployeeName = input[1];
			String newEmployeeDesignation = input[2];
			String newEmployeeDepartment = input[3];
			int newEmployeeSalary = Integer.parseInt(input[4]);
			
			Employee newEmployee = new Employee(newEmployeeID, newEmployeeName, newEmployeeDesignation, newEmployeeDepartment, newEmployeeSalary);
			if(employeeService.addEmployee(newEmployee)) {
				System.out.println("Employee added");
			} else {
				System.out.println("Something went wrong, couldn't add employee");
			}
			
			break;
		case 4:
			System.out.println("Employee ID: ");
			int deleteEmployeeWithID = scanner.nextInt();
			
			if(employeeService.deleteEmployee(deleteEmployeeWithID)) {
				System.out.println("Employee deleted");
			} else {
				System.out.println("Something went wrong, couldn't add employee");
			}
			
			break;
		case 5:
			System.out.println("Employee ID: ");
			int paySlipEmployeeID = scanner.nextInt();
			
			Employee paySlipEmployee = employeeService.searchEmployeeById(paySlipEmployeeID);
			if(paySlipEmployee instanceof Employee) {
				Payslip employeePayslip = new Payslip(paySlipEmployee, 4000);
				employeePayslip.generatePayslip();
			} else {
				System.out.println("Employee with id " + paySlipEmployeeID + " does not exist");				
			}
			
			break;
		case 6:
			System.out.println("Thanks for using Employee Management System");
			System.exit(0);
		default:
			System.out.println("Invalid choice");
			break;
		}
		}
		catch(Exception exception) {
		}
	}

}
