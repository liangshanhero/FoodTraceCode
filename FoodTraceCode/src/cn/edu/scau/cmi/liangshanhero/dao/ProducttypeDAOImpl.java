
package cn.edu.scau.cmi.liangshanhero.dao;

import cn.edu.scau.cmi.liangshanhero.domain.Producttype;

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
 * DAO to manage Producttype entities.
 * 
 */
@Repository("ProducttypeDAO")

@Transactional
public class ProducttypeDAOImpl extends AbstractJpaDao<Producttype> implements ProducttypeDAO {

	/**
	 * Set of entity classes managed by this DAO.  Typically a DAO manages a single entity.
	 *
	 */
	private final static Set<Class<?>> dataTypes = new HashSet<Class<?>>(Arrays.asList(new Class<?>[] {
			Producttype.class }));

	/**
	 * EntityManager injected by Spring for persistence unit agriculturefood
	 *
	 */
	@PersistenceContext(unitName = "agriculturefood")
	private EntityManager entityManager;

	/**
	 * Instantiates a new ProducttypeDAOImpl
	 *
	 */
	public ProducttypeDAOImpl() {
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
	 * JPQL Query - findAllProducttypes
	 *
	 */
	@Transactional
	public Set<Producttype> findAllProducttypes() throws DataAccessException {

		return findAllProducttypes(-1, -1);
	}

	/**
	 * JPQL Query - findAllProducttypes
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Producttype> findAllProducttypes(int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAllProducttypes", startResult, maxRows);
		return new LinkedHashSet<Producttype>(query.getResultList());
	}

	/**
	 * JPQL Query - findProducttypeByPrimaryKey
	 *
	 */
	@Transactional
	public Producttype findProducttypeByPrimaryKey(Integer id) throws DataAccessException {

		return findProducttypeByPrimaryKey(id, -1, -1);
	}

	/**
	 * JPQL Query - findProducttypeByPrimaryKey
	 *
	 */

	@Transactional
	public Producttype findProducttypeByPrimaryKey(Integer id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findProducttypeByPrimaryKey", startResult, maxRows, id);
			return (cn.edu.scau.cmi.liangshanhero.domain.Producttype) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findProducttypeByNameContaining
	 *
	 */
	@Transactional
	public Set<Producttype> findProducttypeByNameContaining(String name) throws DataAccessException {

		return findProducttypeByNameContaining(name, -1, -1);
	}

	/**
	 * JPQL Query - findProducttypeByNameContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Producttype> findProducttypeByNameContaining(String name, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findProducttypeByNameContaining", startResult, maxRows, name);
		return new LinkedHashSet<Producttype>(query.getResultList());
	}

	/**
	 * JPQL Query - findProducttypeById
	 *
	 */
	@Transactional
	public Producttype findProducttypeById(Integer id) throws DataAccessException {

		return findProducttypeById(id, -1, -1);
	}

	/**
	 * JPQL Query - findProducttypeById
	 *
	 */

	@Transactional
	public Producttype findProducttypeById(Integer id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findProducttypeById", startResult, maxRows, id);
			return (cn.edu.scau.cmi.liangshanhero.domain.Producttype) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findProducttypeByName
	 *
	 */
	@Transactional
	public Set<Producttype> findProducttypeByName(String name) throws DataAccessException {

		return findProducttypeByName(name, -1, -1);
	}

	/**
	 * JPQL Query - findProducttypeByName
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Producttype> findProducttypeByName(String name, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findProducttypeByName", startResult, maxRows, name);
		return new LinkedHashSet<Producttype>(query.getResultList());
	}

	/**
	 * Used to determine whether or not to merge the entity or persist the entity when calling Store
	 * @see store
	 * 
	 *
	 */
	public boolean canBeMerged(Producttype entity) {
		return true;
	}
}
