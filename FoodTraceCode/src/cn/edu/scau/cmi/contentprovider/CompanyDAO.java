package cn.edu.scau.cmi.contentprovider;

import java.io.IOException;

public interface CompanyDAO {
	void AddCompany(Company company);
	void delCompany(Company company);
	void updateCompany(Company company);
	Company getCompany() throws Exception, IOException;
	

}
