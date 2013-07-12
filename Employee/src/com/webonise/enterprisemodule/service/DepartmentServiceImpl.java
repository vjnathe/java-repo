/**
 * 
 */
package com.webonise.enterprisemodule.service;

import com.webonise.enterprisemodule.dao.DepartmentRegistrationDao;
import com.webonise.enterprisemodule.model.Department;

/**
 * @author webonise
 *
 */
public class DepartmentServiceImpl implements DepartmentService {

	/* (non-Javadoc)
	 * @see com.webonise.enterprisemodule.service.DepartmentService#addDepartment(com.webonise.enterprisemodule.model.Department)
	 */
	@Override
	public void addDepartment(Department d) {
		// TODO Auto-generated method stub
		DepartmentRegistrationDao dbStore=new DepartmentRegistrationDao();
		dbStore.addDepartment(d);
	}

}
