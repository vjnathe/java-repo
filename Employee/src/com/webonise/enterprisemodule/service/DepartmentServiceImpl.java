/**
 * 
 */
package com.webonise.enterprisemodule.service;

import com.webonise.enterprisemodule.dao.DepartmentRegistrationDao;
import com.webonise.enterprisemodule.model.Department;

/**
 * @author Vijayraj Nathe DepartmentServiceImpl class is implementation for
 *         DepartmentService
 * 
 */
public class DepartmentServiceImpl implements DepartmentService {

	/*
	 * (non-Javadoc)
	 * @see
	 * com.webonise.enterprisemodule.service.DepartmentService#addDepartment
	 * (com.webonise.enterprisemodule.model.Department)
	 */
	@Override
	public boolean addDepartment(Department d) {
		// TODO Auto-generated method stub
		DepartmentRegistrationDao dbStore = new DepartmentRegistrationDao();
		if (dbStore.addDepartment(d))
			return true;
		return false;
	}

}
