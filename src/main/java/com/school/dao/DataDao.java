package com.school.dao;

import java.util.List;

import com.school.domain.SchoolInfo;

public interface DataDao {
	public void insertRow(SchoolInfo schoolInfo);

	public List<SchoolInfo> getList();

	public SchoolInfo getRowById(int id);

	public void updateRow(SchoolInfo schoolInfo);

	public void deleteRow(int id);

}
