
package cn.edu.scau.cmi.liangshanhero.service;

import cn.edu.scau.cmi.liangshanhero.domain.Address;
import cn.edu.scau.cmi.liangshanhero.domain.Product;

import java.util.List;
import java.util.Set;

/**
 * Spring service that handles CRUD requests for Address entities
 * 
 */
public interface AddressService {

	/**
	* Return all Address entity
	* 
	 */
	public List<Address> findAllAddresss(Integer startResult, Integer maxRows);

	/**
	* Save an existing Address entity
	* 
	 */
	public void saveAddress(Address address);

	/**
	* Delete an existing Address entity
	* 
	 */
	public void deleteAddress(Address address_1);

	/**
	* Load an existing Address entity
	* 
	 */
	public Set<Address> loadAddresss();

	/**
	* Return a count of all Address entity
	* 
	 */
	public Integer countAddresss();

	/**
	* Save an existing Product entity
	* 
	 */
	public Address saveAddressProducts(Integer id, Product related_products);

	/**
	* Delete an existing Product entity
	* 
	 */
	public Address deleteAddressProducts(Integer address_id, Integer related_products_id);

	/**
	 */
	public Address findAddressByPrimaryKey(Integer id_1);
}