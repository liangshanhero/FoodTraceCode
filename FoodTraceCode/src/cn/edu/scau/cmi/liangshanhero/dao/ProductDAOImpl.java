
package cn.edu.scau.cmi.liangshanhero.dao;

import cn.edu.scau.cmi.liangshanhero.domain.Product;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.skyway.spring.util.dao.AbstractJpaDao;

import org.springframework.dao.DataAccessException;

import org.springframework.stereotype.Repository;

import org.springframework.transaction.annotation.Transactional;

/**
 * DAO to manage Product entities.
 * 
 */
@Repository("ProductDAO")

@Transactional
public class ProductDAOImpl extends AbstractJpaDao<Product> implements ProductDAO {

	/**
	 * Set of entity classes managed by this DAO.  Typically a DAO manages a single entity.
	 *
	 */
	private final static Set<Class<?>> dataTypes = new HashSet<Class<?>>(Arrays.asList(new Class<?>[] {
			Product.class }));

	/**
	 * EntityManager injected by Spring for persistence unit agriculturefood
	 *
	 */
	@PersistenceContext(unitName = "agriculturefood")
	private EntityManager entityManager;

	/**
	 * Instantiates a new ProductDAOImpl
	 *
	 */
	public ProductDAOImpl() {
		super();
	}

	/**
	 * Get the entity manager that manages persistence unit 
	 *
	 */
	public EntityManager getEntityManager() {
		return entityManager;
	}

	/**
	 * Returns the set of entity classes managed by this DAO.
	 *
	 */
	public Set<Class<?>> getTypes() {
		return dataTypes;
	}

	/**
	 * JPQL Query - findProductById
	 *
	 */
	@Transactional
	public Product findProductById(Integer id) throws DataAccessException {

		return findProductById(id, -1, -1);
	}

	/**
	 * JPQL Query - findProductById
	 *
	 */

	@Transactional
	public Product findProductById(Integer id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findProductById", startResult, maxRows, id);
			return (cn.edu.scau.cmi.liangshanhero.domain.Product) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findAllProducts
	 *
	 */
	@Transactional
	public Set<Product> findAllProducts() throws DataAccessException {

		return findAllProducts(-1, -1);
	}

	/**
	 * JPQL Query - findAllProducts
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Product> findAllProducts(int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAllProducts", startResult, maxRows);
		return new LinkedHashSet<Product>(query.getResultList());
	}

	/**
	 * JPQL Query - findProductByNumber
	 *
	 */
	@Transactional
	public Set<Product> findProductByNumber(String number) throws DataAccessException {

		return findProductByNumber(number, -1, -1);
	}

	/**
	 * JPQL Query - findProductByNumber
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Product> findProductByNumber(String number, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findProductByNumber", startResult, maxRows, number);
		return new LinkedHashSet<Product>(query.getResultList());
	}

	/**
	 * JPQL Query - findProductByPrimaryKey
	 *
	 */
	@Transactional
	public Product findProductByPrimaryKey(Integer id) throws DataAccessException {

		return findProductByPrimaryKey(id, -1, -1);
	}

	/**
	 * JPQL Query - findProductByPrimaryKey
	 *
	 */

	@Transactional
	public Product findProductByPrimaryKey(Integer id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findProductByPrimaryKey", startResult, maxRows, id);
			return (cn.edu.scau.cmi.liangshanhero.domain.Product) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findProductByBatchContaining
	 *
	 */
	@Transactional
	public Set<Product> findProductByBatchContaining(String batch) throws DataAccessException {

		return findProductByBatchContaining(batch, -1, -1);
	}

	/**
	 * JPQL Query - findProductByBatchContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Product> findProductByBatchContaining(String batch, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findProductByBatchContaining", startResult, maxRows, batch);
		return new LinkedHashSet<Product>(query.getResultList());
	}

	/**
	 * JPQL Query - findProductByBatch
	 *
	 */
	@Transactional
	public Set<Product> findProductByBatch(String batch) throws DataAccessException {

		return findProductByBatch(batch, -1, -1);
	}

	/**
	 * JPQL Query - findProductByBatch
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Product> findProductByBatch(String batch, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findProductByBatch", startResult, maxRows, batch);
		return new LinkedHashSet<Product>(query.getResultList());
	}

	/**
	 * JPQL Query - findProductByNumberContaining
	 *
	 */
	@Transactional
	public Set<Product> findProductByNumberContaining(String number) throws DataAccessException {

		return findProductByNumberContaining(number, -1, -1);
	}

	/**
	 * JPQL Query - findProductByNumberContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Product> findProductByNumberContaining(String number, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findProductByNumberContaining", startResult, maxRows, number);
		return new LinkedHashSet<Product>(query.getResultList());
	}

	/**
	 * Used to determine whether or not to merge the entity or persist the entity when calling Store
	 * @see store
	 * 
	 *
	 */
	public boolean canBeMerged(Product entity) {
		return true;
	}
}
