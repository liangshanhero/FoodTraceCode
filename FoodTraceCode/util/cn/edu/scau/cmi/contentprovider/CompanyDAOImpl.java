package cn.edu.scau.cmi.contentprovider;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class CompanyDAOImpl implements CompanyDAO {

	public void AddCompany(Company company) {
		// TODO Auto-generated method stub

	}

	public void delCompany(Company company) {
		// TODO Auto-generated method stub

	}

	public void updateCompany(Company company) {
		// TODO Auto-generated method stub

	}

	public Company getCompany() throws Exception, IOException {
		// TODO Auto-generated method stub
		Properties pps = new Properties();
		pps.load(new FileInputStream("Test.properties"));
		Company company = new Company();
		company.setName(pps.getProperty("company"));
		return company;
	}

}
