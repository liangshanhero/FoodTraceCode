
package cn.edu.scau.cmi.liangshanhero.service;

import cn.edu.scau.cmi.liangshanhero.domain.Product;
import cn.edu.scau.cmi.liangshanhero.domain.Producttype;

import java.util.List;
import java.util.Set;

/**
 * Spring service that handles CRUD requests for Producttype entities
 * 
 */
public interface ProducttypeService {

	/**
	* Delete an existing Product entity
	* 
	 */
	public Producttype deleteProducttypeProducts(Integer producttype_id, Integer related_products_id);

	/**
	* Return all Producttype entity
	* 
	 */
	public List<Producttype> findAllProducttypes(Integer startResult, Integer maxRows);

	/**
	 */
	public Producttype findProducttypeByPrimaryKey(Integer id);

	/**
	* Delete an existing Producttype entity
	* 
	 */
	public void deleteProducttype(Producttype producttype);

	/**
	* Save an existing Product entity
	* 
	 */
	public Producttype saveProducttypeProducts(Integer id_1, Product related_products);

	/**
	* Load an existing Producttype entity
	* 
	 */
	public Set<Producttype> loadProducttypes();

	/**
	* Return a count of all Producttype entity
	* 
	 */
	public Integer countProducttypes();

	/**
	* Save an existing Producttype entity
	* 
	 */
	public void saveProducttype(Producttype producttype_1);
}