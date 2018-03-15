
package cn.edu.scau.cmi.liangshanhero.dao;

import cn.edu.scau.cmi.liangshanhero.domain.Product;

import java.util.Set;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

/**
 * DAO to manage Product entities.
 * 
 */
public interface ProductDAO extends JpaDao<Product> {

	/**
	 * JPQL Query - findProductById
	 *
	 */
	public Product findProductById(Integer id) throws DataAccessException;

	/**
	 * JPQL Query - findProductById
	 *
	 */
	public Product findProductById(Integer id, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAllProducts
	 *
	 */
	public Set<Product> findAllProducts() throws DataAccessException;

	/**
	 * JPQL Query - findAllProducts
	 *
	 */
	public Set<Product> findAllProducts(int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findProductByNumber
	 *
	 */
	public Set<Product> findProductByNumber(String number) throws DataAccessException;

	/**
	 * JPQL Query - findProductByNumber
	 *
	 */
	public Set<Product> findProductByNumber(String number, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findProductByPrimaryKey
	 *
	 */
	public Product findProductByPrimaryKey(Integer id_1) throws DataAccessException;

	/**
	 * JPQL Query - findProductByPrimaryKey
	 *
	 */
	public Product findProductByPrimaryKey(Integer id_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findProductByBatchContaining
	 *
	 */
	public Set<Product> findProductByBatchContaining(String batch) throws DataAccessException;

	/**
	 * JPQL Query - findProductByBatchContaining
	 *
	 */
	public Set<Product> findProductByBatchContaining(String batch, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findProductByBatch
	 *
	 */
	public Set<Product> findProductByBatch(String batch_1) throws DataAccessException;

	/**
	 * JPQL Query - findProductByBatch
	 *
	 */
	public Set<Product> findProductByBatch(String batch_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findProductByNumberContaining
	 *
	 */
	public Set<Product> findProductByNumberContaining(String number_1) throws DataAccessException;

	/**
	 * JPQL Query - findProductByNumberContaining
	 *
	 */
	public Set<Product> findProductByNumberContaining(String number_1, int startResult, int maxRows) throws DataAccessException;

}