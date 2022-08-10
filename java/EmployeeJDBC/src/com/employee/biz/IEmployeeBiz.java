	package com.employee.biz;

import java.util.ArrayList;

import com.employee.entity.Employee;
import com.employee.exception.DataNotFoundException;

public interface IEmployeeBiz {

	
	public ArrayList<Employee> selectAllEmployee();
	public ArrayList<Employee> searchList(String inputSubMenu, String searchWord)throws DataNotFoundException;
	public int createEmployeeNum();
	public void employeeInsert(Employee emp);
	public void employeeUpdate(Employee emp) throws DataNotFoundException;
	public void employeeDelete(int employeeNum)throws DataNotFoundException;
	public void employeeService(int empno, String inputColumn)throws DataNotFoundException;
}
