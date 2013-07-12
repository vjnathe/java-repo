/**
 * 
 */
package com.webonise.enterprisemodule.service;
import com.webonise.enterprisemodule.dao.EmployeeRegistrationDao;
import com.webonise.enterprisemodule.model.Employee;

/**
 * @author webonise
 *
 */
public class EmployeeServiceImpl implements EmployeeService {

	/* (non-Javadoc)
	 * @see com.webonise.enterprisemodule.service.EmployeeService#addEmployee(com.webonise.enterprisemodule.model.Employee)
	 */
	@Override
	public void addEmployee(Employee e) {
		// TODO Auto-generated method stub
		EmployeeRegistrationDao dbStore=new EmployeeRegistrationDao();
		dbStore.addEmployee(e);

	}

}
