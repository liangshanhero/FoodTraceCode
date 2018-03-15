
package cn.edu.scau.cmi.liangshanhero.domain;

import java.io.Serializable;

import java.lang.StringBuilder;

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
		@NamedQuery(name = "findAllProducts", query = "select myProduct from Product myProduct"),
		@NamedQuery(name = "findProductByBatch", query = "select myProduct from Product myProduct where myProduct.batch = ?1"),
		@NamedQuery(name = "findProductByBatchContaining", query = "select myProduct from Product myProduct where myProduct.batch like ?1"),
		@NamedQuery(name = "findProductById", query = "select myProduct from Product myProduct where myProduct.id = ?1"),
		@NamedQuery(name = "findProductByNumber", query = "select myProduct from Product myProduct where myProduct.number = ?1"),
		@NamedQuery(name = "findProductByNumberContaining", query = "select myProduct from Product myProduct where myProduct.number like ?1"),
		@NamedQuery(name = "findProductByPrimaryKey", query = "select myProduct from Product myProduct where myProduct.id = ?1") })

@Table(catalog = "agriculturefood", name = "product")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "FoodTraceCode/cn/edu/scau/cmi/liangshanhero/domain", name = "Product")

public class Product implements Serializable {
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

	@Column(name = "batch")
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String batch;
	/**
	 */

	@Column(name = "number")
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String number;

	/**
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "productType", referencedColumnName = "id") })
	@XmlTransient
	Producttype producttype;
	/**
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "address", referencedColumnName = "id") })
	@XmlTransient
	Address address;

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
	public void setBatch(String batch) {
		this.batch = batch;
	}

	/**
	 */
	public String getBatch() {
		return this.batch;
	}

	/**
	 */
	public void setNumber(String number) {
		this.number = number;
	}

	/**
	 */
	public String getNumber() {
		return this.number;
	}

	/**
	 */
	public void setProducttype(Producttype producttype) {
		this.producttype = producttype;
	}

	/**
	 */
	public Producttype getProducttype() {
		return producttype;
	}

	/**
	 */
	public void setAddress(Address address) {
		this.address = address;
	}

	/**
	 */
	public Address getAddress() {
		return address;
	}

	/**
	 */
	public Product() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
	public void copy(Product that) {
		setId(that.getId());
		setBatch(that.getBatch());
		setNumber(that.getNumber());
		setProducttype(that.getProducttype());
		setAddress(that.getAddress());
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("id=[").append(id).append("] ");
		buffer.append("batch=[").append(batch).append("] ");
		buffer.append("number=[").append(number).append("] ");

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
		if (!(obj instanceof Product))
			return false;
		Product equalCheck = (Product) obj;
		if ((id == null && equalCheck.id != null) || (id != null && equalCheck.id == null))
			return false;
		if (id != null && !id.equals(equalCheck.id))
			return false;
		return true;
	}
}
