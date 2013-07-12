/**
 * 
 */
package com.webonise.enterprisemodule.service;

import com.webonise.enterprisemodule.dao.FetchDepartmentDao;

/**
 * @author Vijayraj Nathe FetchDepartmentServiceImpl class is implementation for
 *         FetchDepartmentService
 */
public class FetchDepartmentServiceImpl implements FetchDepartmentService {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.webonise.enterprisemodule.service.FetchDepartmentService#fetchDepartments
	 * ()
	 */
	@Override
	public String[] fetchDepartments() {
		FetchDepartmentDao fetcher = new FetchDepartmentDao();
		String departmentList[] = fetcher.fetchDepartments();
		return departmentList;
	}

}
