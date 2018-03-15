
package cn.edu.scau.cmi.liangshanhero.dao;

import cn.edu.scau.cmi.liangshanhero.domain.Address;

import java.util.Set;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

/**
 * DAO to manage Address entities.
 * 
 */
public interface AddressDAO extends JpaDao<Address> {

	/**
	 * JPQL Query - findAllAddresss
	 *
	 */
	public Set<Address> findAllAddresss() throws DataAccessException;

	/**
	 * JPQL Query - findAllAddresss
	 *
	 */
	public Set<Address> findAllAddresss(int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAddressByNameContaining
	 *
	 */
	public Set<Address> findAddressByNameContaining(String name) throws DataAccessException;

	/**
	 * JPQL Query - findAddressByNameContaining
	 *
	 */
	public Set<Address> findAddressByNameContaining(String name, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAddressByPrimaryKey
	 *
	 */
	public Address findAddressByPrimaryKey(Integer id) throws DataAccessException;

	/**
	 * JPQL Query - findAddressByPrimaryKey
	 *
	 */
	public Address findAddressByPrimaryKey(Integer id, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAddressByName
	 *
	 */
	public Set<Address> findAddressByName(String name_1) throws DataAccessException;

	/**
	 * JPQL Query - findAddressByName
	 *
	 */
	public Set<Address> findAddressByName(String name_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAddressById
	 *
	 */
	public Address findAddressById(Integer id_1) throws DataAccessException;

	/**
	 * JPQL Query - findAddressById
	 *
	 */
	public Address findAddressById(Integer id_1, int startResult, int maxRows) throws DataAccessException;

}