package cn.edu.scau.cmi.liangshanhero.service;

import cn.edu.scau.cmi.liangshanhero.dao.AddressDAO;
import cn.edu.scau.cmi.liangshanhero.dao.ProductDAO;

import cn.edu.scau.cmi.liangshanhero.domain.Address;
import cn.edu.scau.cmi.liangshanhero.domain.Product;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

/**
 * Spring service that handles CRUD requests for Address entities
 * 
 */

@Service("AddressService")

@Transactional
public class AddressServiceImpl implements AddressService {

	/**
	 * DAO injected by Spring that manages Address entities
	 * 
	 */
	@Autowired
	private AddressDAO addressDAO;

	/**
	 * DAO injected by Spring that manages Product entities
	 * 
	 */
	@Autowired
	private ProductDAO productDAO;

	/**
	 * Instantiates a new AddressServiceImpl.
	 *
	 */
	public AddressServiceImpl() {
	}

	/**
	 * Return all Address entity
	 * 
	 */
	@Transactional
	public List<Address> findAllAddresss(Integer startResult, Integer maxRows) {
		return new java.util.ArrayList<Address>(addressDAO.findAllAddresss(startResult, maxRows));
	}

	/**
	 * Save an existing Address entity
	 * 
	 */
	@Transactional
	public void saveAddress(Address address) {
		Address existingAddress = addressDAO.findAddressByPrimaryKey(address.getId());

		if (existingAddress != null) {
			if (existingAddress != address) {
				existingAddress.setId(address.getId());
				existingAddress.setName(address.getName());
			}
			address = addressDAO.store(existingAddress);
		} else {
			address = addressDAO.store(address);
		}
		addressDAO.flush();
	}

	/**
	 * Delete an existing Address entity
	 * 
	 */
	@Transactional
	public void deleteAddress(Address address) {
		addressDAO.remove(address);
		addressDAO.flush();
	}

	/**
	 * Load an existing Address entity
	 * 
	 */
	@Transactional
	public Set<Address> loadAddresss() {
		return addressDAO.findAllAddresss();
	}

	/**
	 * Return a count of all Address entity
	 * 
	 */
	@Transactional
	public Integer countAddresss() {
		return ((Long) addressDAO.createQuerySingleResult("select count(o) from Address o").getSingleResult()).intValue();
	}

	/**
	 * Save an existing Product entity
	 * 
	 */
	@Transactional
	public Address saveAddressProducts(Integer id, Product related_products) {
		Address address = addressDAO.findAddressByPrimaryKey(id, -1, -1);
		Product existingproducts = productDAO.findProductByPrimaryKey(related_products.getId());

		// copy into the existing record to preserve existing relationships
		if (existingproducts != null) {
			existingproducts.setId(related_products.getId());
			existingproducts.setBatch(related_products.getBatch());
			existingproducts.setNumber(related_products.getNumber());
			related_products = existingproducts;
		} else {
			related_products = productDAO.store(related_products);
			productDAO.flush();
		}

		related_products.setAddress(address);
		address.getProducts().add(related_products);
		related_products = productDAO.store(related_products);
		productDAO.flush();

		address = addressDAO.store(address);
		addressDAO.flush();

		return address;
	}

	/**
	 * Delete an existing Product entity
	 * 
	 */
	@Transactional
	public Address deleteAddressProducts(Integer address_id, Integer related_products_id) {
		Product related_products = productDAO.findProductByPrimaryKey(related_products_id, -1, -1);

		Address address = addressDAO.findAddressByPrimaryKey(address_id, -1, -1);

		related_products.setAddress(null);
		address.getProducts().remove(related_products);

		productDAO.remove(related_products);
		productDAO.flush();

		return address;
	}

	/**
	 */
	@Transactional
	public Address findAddressByPrimaryKey(Integer id) {
		return addressDAO.findAddressByPrimaryKey(id);
	}
}
