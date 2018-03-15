package cn.edu.scau.cmi.liangshanhero.service;

import cn.edu.scau.cmi.liangshanhero.dao.AddressDAO;
import cn.edu.scau.cmi.liangshanhero.dao.ProductDAO;
import cn.edu.scau.cmi.liangshanhero.dao.ProducttypeDAO;

import cn.edu.scau.cmi.liangshanhero.domain.Address;
import cn.edu.scau.cmi.liangshanhero.domain.Product;
import cn.edu.scau.cmi.liangshanhero.domain.Producttype;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

/**
 * Spring service that handles CRUD requests for Product entities
 * 
 */

@Service("ProductService")

@Transactional
public class ProductServiceImpl implements ProductService {

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
	 * DAO injected by Spring that manages Producttype entities
	 * 
	 */
	@Autowired
	private ProducttypeDAO producttypeDAO;

	/**
	 * Instantiates a new ProductServiceImpl.
	 *
	 */
	public ProductServiceImpl() {
	}

	/**
	 * Save an existing Address entity
	 * 
	 */
	@Transactional
	public Product saveProductAddress(Integer id, Address related_address) {
		Product product = productDAO.findProductByPrimaryKey(id, -1, -1);
		Address existingaddress = addressDAO.findAddressByPrimaryKey(related_address.getId());

		// copy into the existing record to preserve existing relationships
		if (existingaddress != null) {
			existingaddress.setId(related_address.getId());
			existingaddress.setName(related_address.getName());
			related_address = existingaddress;
		} else {
			related_address = addressDAO.store(related_address);
			addressDAO.flush();
		}

		product.setAddress(related_address);
		related_address.getProducts().add(product);
		product = productDAO.store(product);
		productDAO.flush();

		related_address = addressDAO.store(related_address);
		addressDAO.flush();

		return product;
	}

	/**
	 * Save an existing Product entity
	 * 
	 */
	@Transactional
	public void saveProduct(Product product) {
		Product existingProduct = productDAO.findProductByPrimaryKey(product.getId());

		if (existingProduct != null) {
			if (existingProduct != product) {
				existingProduct.setId(product.getId());
				existingProduct.setBatch(product.getBatch());
				existingProduct.setNumber(product.getNumber());
			}
			product = productDAO.store(existingProduct);
		} else {
			product = productDAO.store(product);
		}
		productDAO.flush();
	}

	/**
	 */
	@Transactional
	public Product findProductByPrimaryKey(Integer id) {
		return productDAO.findProductByPrimaryKey(id);
	}

	/**
	 * Save an existing Producttype entity
	 * 
	 */
	@Transactional
	public Product saveProductProducttype(Integer id, Producttype related_producttype) {
		Product product = productDAO.findProductByPrimaryKey(id, -1, -1);
		Producttype existingproducttype = producttypeDAO.findProducttypeByPrimaryKey(related_producttype.getId());

		// copy into the existing record to preserve existing relationships
		if (existingproducttype != null) {
			existingproducttype.setId(related_producttype.getId());
			existingproducttype.setName(related_producttype.getName());
			related_producttype = existingproducttype;
		} else {
			related_producttype = producttypeDAO.store(related_producttype);
			producttypeDAO.flush();
		}

		product.setProducttype(related_producttype);
		related_producttype.getProducts().add(product);
		product = productDAO.store(product);
		productDAO.flush();

		related_producttype = producttypeDAO.store(related_producttype);
		producttypeDAO.flush();

		return product;
	}

	/**
	 * Delete an existing Product entity
	 * 
	 */
	@Transactional
	public void deleteProduct(Product product) {
		productDAO.remove(product);
		productDAO.flush();
	}

	/**
	 * Load an existing Product entity
	 * 
	 */
	@Transactional
	public Set<Product> loadProducts() {
		return productDAO.findAllProducts();
	}

	/**
	 * Return all Product entity
	 * 
	 */
	@Transactional
	public List<Product> findAllProducts(Integer startResult, Integer maxRows) {
		return new java.util.ArrayList<Product>(productDAO.findAllProducts(startResult, maxRows));
	}

	/**
	 * Return a count of all Product entity
	 * 
	 */
	@Transactional
	public Integer countProducts() {
		return ((Long) productDAO.createQuerySingleResult("select count(o) from Product o").getSingleResult()).intValue();
	}

	/**
	 * Delete an existing Address entity
	 * 
	 */
	@Transactional
	public Product deleteProductAddress(Integer product_id, Integer related_address_id) {
		Product product = productDAO.findProductByPrimaryKey(product_id, -1, -1);
		Address related_address = addressDAO.findAddressByPrimaryKey(related_address_id, -1, -1);

		product.setAddress(null);
		related_address.getProducts().remove(product);
		product = productDAO.store(product);
		productDAO.flush();

		related_address = addressDAO.store(related_address);
		addressDAO.flush();

		addressDAO.remove(related_address);
		addressDAO.flush();

		return product;
	}

	/**
	 * Delete an existing Producttype entity
	 * 
	 */
	@Transactional
	public Product deleteProductProducttype(Integer product_id, Integer related_producttype_id) {
		Product product = productDAO.findProductByPrimaryKey(product_id, -1, -1);
		Producttype related_producttype = producttypeDAO.findProducttypeByPrimaryKey(related_producttype_id, -1, -1);

		product.setProducttype(null);
		related_producttype.getProducts().remove(product);
		product = productDAO.store(product);
		productDAO.flush();

		related_producttype = producttypeDAO.store(related_producttype);
		producttypeDAO.flush();

		producttypeDAO.remove(related_producttype);
		producttypeDAO.flush();

		return product;
	}
}
