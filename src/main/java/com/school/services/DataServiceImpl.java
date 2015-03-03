package com.school.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.school.dao.DataDao;
import com.school.domain.SchoolInfo;

public class DataServiceImpl implements DataService {
	
	@Autowired
	DataDao dataDao;

	@Override
	public void insertRow(SchoolInfo schoolInfo) {
		this.dataDao.insertRow(schoolInfo);
	}

	@Override
	public List<SchoolInfo> getList() {
		return this.dataDao.getList();
	}

	@Override
	public SchoolInfo getRowById(int id) {
		return this.dataDao.getRowById(id);
	}

	@Override
	public void updateRow(SchoolInfo schoolInfo) {
		this.dataDao.updateRow(schoolInfo);
	}

	@Override
	public void deleteRow(int id) {
		this.dataDao.deleteRow(id);
	}

}
