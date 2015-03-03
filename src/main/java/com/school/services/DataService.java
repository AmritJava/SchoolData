package com.school.services;

import java.util.List;

import com.school.domain.SchoolInfo;

public interface DataService {
	public void insertRow(SchoolInfo schoolInfo);

	public List<SchoolInfo> getList();

	public SchoolInfo getRowById(int id);

	public void updateRow(SchoolInfo schoolInfo);

	public void deleteRow(int id);

}
