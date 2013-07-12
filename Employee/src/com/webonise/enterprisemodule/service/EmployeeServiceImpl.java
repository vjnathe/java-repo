/**
 * 
 */
package com.webonise.enterprisemodule.service;

import com.webonise.enterprisemodule.dao.EmployeeRegistrationDao;
import com.webonise.enterprisemodule.model.Employee;

/**
 * @author Vijayraj Nathe EmployeeServiceImpl class is implementation for
 *         EmployeeService.
 */
public class EmployeeServiceImpl implements EmployeeService {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.webonise.enterprisemodule.service.EmployeeService#saddEmployee(com
	 * .webonise.enterprisemodule.model.Employee)
	 */
	@Override
	public boolean addEmployee(Employee e) {
		// TODO Auto-generated method stub
		EmployeeRegistrationDao dbStore = new EmployeeRegistrationDao();
		if (dbStore.addEmployee(e))
			return true;
		return false;

	}

}
