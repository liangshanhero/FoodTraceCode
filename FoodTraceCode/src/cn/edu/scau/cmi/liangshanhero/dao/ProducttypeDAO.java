
package cn.edu.scau.cmi.liangshanhero.dao;

import cn.edu.scau.cmi.liangshanhero.domain.Producttype;

import java.util.Set;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

/**
 * DAO to manage Producttype entities.
 * 
 */
public interface ProducttypeDAO extends JpaDao<Producttype> {

	/**
	 * JPQL Query - findAllProducttypes
	 *
	 */
	public Set<Producttype> findAllProducttypes() throws DataAccessException;

	/**
	 * JPQL Query - findAllProducttypes
	 *
	 */
	public Set<Producttype> findAllProducttypes(int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findProducttypeByPrimaryKey
	 *
	 */
	public Producttype findProducttypeByPrimaryKey(Integer id) throws DataAccessException;

	/**
	 * JPQL Query - findProducttypeByPrimaryKey
	 *
	 */
	public Producttype findProducttypeByPrimaryKey(Integer id, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findProducttypeByNameContaining
	 *
	 */
	public Set<Producttype> findProducttypeByNameContaining(String name) throws DataAccessException;

	/**
	 * JPQL Query - findProducttypeByNameContaining
	 *
	 */
	public Set<Producttype> findProducttypeByNameContaining(String name, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findProducttypeById
	 *
	 */
	public Producttype findProducttypeById(Integer id_1) throws DataAccessException;

	/**
	 * JPQL Query - findProducttypeById
	 *
	 */
	public Producttype findProducttypeById(Integer id_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findProducttypeByName
	 *
	 */
	public Set<Producttype> findProducttypeByName(String name_1) throws DataAccessException;

	/**
	 * JPQL Query - findProducttypeByName
	 *
	 */
	public Set<Producttype> findProducttypeByName(String name_1, int startResult, int maxRows) throws DataAccessException;

}