
package cn.edu.scau.cmi.liangshanhero.dao;

import cn.edu.scau.cmi.liangshanhero.domain.Address;

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
 * DAO to manage Address entities.
 * 
 */
@Repository("AddressDAO")

@Transactional
public class AddressDAOImpl extends AbstractJpaDao<Address> implements AddressDAO {

	/**
	 * Set of entity classes managed by this DAO.  Typically a DAO manages a single entity.
	 *
	 */
	private final static Set<Class<?>> dataTypes = new HashSet<Class<?>>(Arrays.asList(new Class<?>[] {
			Address.class }));

	/**
	 * EntityManager injected by Spring for persistence unit agriculturefood
	 *
	 */
	@PersistenceContext(unitName = "agriculturefood")
	private EntityManager entityManager;

	/**
	 * Instantiates a new AddressDAOImpl
	 *
	 */
	public AddressDAOImpl() {
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
	 * JPQL Query - findAllAddresss
	 *
	 */
	@Transactional
	public Set<Address> findAllAddresss() throws DataAccessException {

		return findAllAddresss(-1, -1);
	}

	/**
	 * JPQL Query - findAllAddresss
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Address> findAllAddresss(int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAllAddresss", startResult, maxRows);
		return new LinkedHashSet<Address>(query.getResultList());
	}

	/**
	 * JPQL Query - findAddressByNameContaining
	 *
	 */
	@Transactional
	public Set<Address> findAddressByNameContaining(String name) throws DataAccessException {

		return findAddressByNameContaining(name, -1, -1);
	}

	/**
	 * JPQL Query - findAddressByNameContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Address> findAddressByNameContaining(String name, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAddressByNameContaining", startResult, maxRows, name);
		return new LinkedHashSet<Address>(query.getResultList());
	}

	/**
	 * JPQL Query - findAddressByPrimaryKey
	 *
	 */
	@Transactional
	public Address findAddressByPrimaryKey(Integer id) throws DataAccessException {

		return findAddressByPrimaryKey(id, -1, -1);
	}

	/**
	 * JPQL Query - findAddressByPrimaryKey
	 *
	 */

	@Transactional
	public Address findAddressByPrimaryKey(Integer id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findAddressByPrimaryKey", startResult, maxRows, id);
			return (cn.edu.scau.cmi.liangshanhero.domain.Address) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findAddressByName
	 *
	 */
	@Transactional
	public Set<Address> findAddressByName(String name) throws DataAccessException {

		return findAddressByName(name, -1, -1);
	}

	/**
	 * JPQL Query - findAddressByName
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Address> findAddressByName(String name, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAddressByName", startResult, maxRows, name);
		return new LinkedHashSet<Address>(query.getResultList());
	}

	/**
	 * JPQL Query - findAddressById
	 *
	 */
	@Transactional
	public Address findAddressById(Integer id) throws DataAccessException {

		return findAddressById(id, -1, -1);
	}

	/**
	 * JPQL Query - findAddressById
	 *
	 */

	@Transactional
	public Address findAddressById(Integer id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findAddressById", startResult, maxRows, id);
			return (cn.edu.scau.cmi.liangshanhero.domain.Address) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * Used to determine whether or not to merge the entity or persist the entity when calling Store
	 * @see store
	 * 
	 *
	 */
	public boolean canBeMerged(Address entity) {
		return true;
	}
}
