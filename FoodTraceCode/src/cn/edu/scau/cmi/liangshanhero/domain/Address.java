
package cn.edu.scau.cmi.liangshanhero.domain;

import java.io.Serializable;

import java.lang.StringBuilder;

import java.util.LinkedHashSet;
import java.util.Set;

import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

import javax.xml.bind.annotation.*;

import javax.persistence.*;

/**
 */

@Entity
@NamedQueries({
		@NamedQuery(name = "findAddressById", query = "select myAddress from Address myAddress where myAddress.id = ?1"),
		@NamedQuery(name = "findAddressByName", query = "select myAddress from Address myAddress where myAddress.name = ?1"),
		@NamedQuery(name = "findAddressByNameContaining", query = "select myAddress from Address myAddress where myAddress.name like ?1"),
		@NamedQuery(name = "findAddressByPrimaryKey", query = "select myAddress from Address myAddress where myAddress.id = ?1"),
		@NamedQuery(name = "findAllAddresss", query = "select myAddress from Address myAddress") })

@Table(catalog = "agriculturefood", name = "address")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "FoodTraceCode/cn/edu/scau/cmi/liangshanhero/domain", name = "Address")
@XmlRootElement(namespace = "FoodTraceCode/cn/edu/scau/cmi/liangshanhero/domain")
public class Address implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 */

	@Column(name = "id", nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@Id
	@XmlElement
	Integer id;
	/**
	 */

	@Column(name = "name")
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String name;

	/**
	 */
	@OneToMany(mappedBy = "address", cascade = { CascadeType.REMOVE }, fetch = FetchType.LAZY)

	@XmlElement(name = "", namespace = "")
	java.util.Set<cn.edu.scau.cmi.liangshanhero.domain.Product> products;

	/**
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 */
	public Integer getId() {
		return this.id;
	}

	/**
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 */
	public String getName() {
		return this.name;
	}

	/**
	 */
	public void setProducts(Set<Product> products) {
		this.products = products;
	}

	/**
	 */
	public Set<Product> getProducts() {
		if (products == null) {
			products = new java.util.LinkedHashSet<cn.edu.scau.cmi.liangshanhero.domain.Product>();
		}
		return products;
	}

	/**
	 */
	public Address() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
	public void copy(Address that) {
		setId(that.getId());
		setName(that.getName());
		setProducts(new java.util.LinkedHashSet<cn.edu.scau.cmi.liangshanhero.domain.Product>(that.getProducts()));
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("id=[").append(id).append("] ");
		buffer.append("name=[").append(name).append("] ");

		return buffer.toString();
	}

	/**
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = (int) (prime * result + ((id == null) ? 0 : id.hashCode()));
		return result;
	}

	/**
	 */
	public boolean equals(Object obj) {
		if (obj == this)
			return true;
		if (!(obj instanceof Address))
			return false;
		Address equalCheck = (Address) obj;
		if ((id == null && equalCheck.id != null) || (id != null && equalCheck.id == null))
			return false;
		if (id != null && !id.equals(equalCheck.id))
			return false;
		return true;
	}
}
