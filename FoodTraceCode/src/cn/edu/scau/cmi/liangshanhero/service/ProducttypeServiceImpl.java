package cn.edu.scau.cmi.liangshanhero.service;

import cn.edu.scau.cmi.liangshanhero.dao.ProductDAO;
import cn.edu.scau.cmi.liangshanhero.dao.ProducttypeDAO;

import cn.edu.scau.cmi.liangshanhero.domain.Product;
import cn.edu.scau.cmi.liangshanhero.domain.Producttype;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

/**
 * Spring service that handles CRUD requests for Producttype entities
 * 
 */

@Service("ProducttypeService")

@Transactional
public class ProducttypeServiceImpl implements ProducttypeService {

	/**
	 * DAO injected by Spring that manages Product entities
	 * 
	 */
	@Autowired
	private ProductDAO productDAO;

	/**
	 * DAO injected by Spring that manages Producttype entities
	 * 
	 */
	@Autowired
	private ProducttypeDAO producttypeDAO;

	/**
	 * Instantiates a new ProducttypeServiceImpl.
	 *
	 */
	public ProducttypeServiceImpl() {
	}

	/**
	 * Delete an existing Product entity
	 * 
	 */
	@Transactional
	public Producttype deleteProducttypeProducts(Integer producttype_id, Integer related_products_id) {
		Product related_products = productDAO.findProductByPrimaryKey(related_products_id, -1, -1);

		Producttype producttype = producttypeDAO.findProducttypeByPrimaryKey(producttype_id, -1, -1);

		related_products.setProducttype(null);
		producttype.getProducts().remove(related_products);

		productDAO.remove(related_products);
		productDAO.flush();

		return producttype;
	}

	/**
	 * Return all Producttype entity
	 * 
	 */
	@Transactional
	public List<Producttype> findAllProducttypes(Integer startResult, Integer maxRows) {
		return new java.util.ArrayList<Producttype>(producttypeDAO.findAllProducttypes(startResult, maxRows));
	}

	/**
	 */
	@Transactional
	public Producttype findProducttypeByPrimaryKey(Integer id) {
		return producttypeDAO.findProducttypeByPrimaryKey(id);
	}

	/**
	 * Delete an existing Producttype entity
	 * 
	 */
	@Transactional
	public void deleteProducttype(Producttype producttype) {
		producttypeDAO.remove(producttype);
		producttypeDAO.flush();
	}

	/**
	 * Save an existing Product entity
	 * 
	 */
	@Transactional
	public Producttype saveProducttypeProducts(Integer id, Product related_products) {
		Producttype producttype = producttypeDAO.findProducttypeByPrimaryKey(id, -1, -1);
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

		related_products.setProducttype(producttype);
		producttype.getProducts().add(related_products);
		related_products = productDAO.store(related_products);
		productDAO.flush();

		producttype = producttypeDAO.store(producttype);
		producttypeDAO.flush();

		return producttype;
	}

	/**
	 * Load an existing Producttype entity
	 * 
	 */
	@Transactional
	public Set<Producttype> loadProducttypes() {
		return producttypeDAO.findAllProducttypes();
	}

	/**
	 * Return a count of all Producttype entity
	 * 
	 */
	@Transactional
	public Integer countProducttypes() {
		return ((Long) producttypeDAO.createQuerySingleResult("select count(o) from Producttype o").getSingleResult()).intValue();
	}

	/**
	 * Save an existing Producttype entity
	 * 
	 */
	@Transactional
	public void saveProducttype(Producttype producttype) {
		Producttype existingProducttype = producttypeDAO.findProducttypeByPrimaryKey(producttype.getId());

		if (existingProducttype != null) {
			if (existingProducttype != producttype) {
				existingProducttype.setId(producttype.getId());
				existingProducttype.setName(producttype.getName());
			}
			producttype = producttypeDAO.store(existingProducttype);
		} else {
			producttype = producttypeDAO.store(producttype);
		}
		producttypeDAO.flush();
	}
}
