
package cn.edu.scau.cmi.liangshanhero.service;

import cn.edu.scau.cmi.liangshanhero.domain.Address;
import cn.edu.scau.cmi.liangshanhero.domain.Product;
import cn.edu.scau.cmi.liangshanhero.domain.Producttype;

import java.util.List;
import java.util.Set;

/**
 * Spring service that handles CRUD requests for Product entities
 * 
 */
public interface ProductService {

	/**
	* Save an existing Address entity
	* 
	 */
	public Product saveProductAddress(Integer id, Address related_address);

	/**
	* Save an existing Product entity
	* 
	 */
	public void saveProduct(Product product);

	/**
	 */
	public Product findProductByPrimaryKey(Integer id_1);

	/**
	* Save an existing Producttype entity
	* 
	 */
	public Product saveProductProducttype(Integer id_2, Producttype related_producttype);

	/**
	* Delete an existing Product entity
	* 
	 */
	public void deleteProduct(Product product_1);

	/**
	* Load an existing Product entity
	* 
	 */
	public Set<Product> loadProducts();

	/**
	* Return all Product entity
	* 
	 */
	public List<Product> findAllProducts(Integer startResult, Integer maxRows);

	/**
	* Return a count of all Product entity
	* 
	 */
	public Integer countProducts();

	/**
	* Delete an existing Address entity
	* 
	 */
	public Product deleteProductAddress(Integer product_id, Integer related_address_id);

	/**
	* Delete an existing Producttype entity
	* 
	 */
	public Product deleteProductProducttype(Integer product_id_1, Integer related_producttype_id);
}