
package cn.edu.scau.cmi.liangshanhero.service;

import cn.edu.scau.cmi.liangshanhero.domain.Address;
import cn.edu.scau.cmi.liangshanhero.domain.Product;
import cn.edu.scau.cmi.liangshanhero.domain.Producttype;

import java.util.List;
import java.util.Set;

import org.junit.Test;

import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;

import org.springframework.context.ApplicationContext;

import org.springframework.mock.web.MockHttpServletRequest;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;

import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;
import org.springframework.test.context.support.DirtiesContextTestExecutionListener;

import org.springframework.test.context.transaction.TransactionalTestExecutionListener;

import org.springframework.transaction.annotation.Transactional;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.RequestScope;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.context.request.SessionScope;

/**
 * Class to run the service as a JUnit test. Each operation in the service is a separate test.
 *
 */

@RunWith(SpringJUnit4ClassRunner.class)
@TestExecutionListeners({
		DependencyInjectionTestExecutionListener.class,
		DirtiesContextTestExecutionListener.class,
		TransactionalTestExecutionListener.class })
@ContextConfiguration(locations = {
		"file:./src/main/resources/FoodTraceCode-security-context.xml",
		"file:./src/main/resources/FoodTraceCode-service-context.xml",
		"file:./src/main/resources/FoodTraceCode-dao-context.xml",
		"file:./src/main/resources/FoodTraceCode-web-context.xml" })
@Transactional
public class ProductServiceTest {

	/**
	 * The Spring application context.
	 *
	 */
	@SuppressWarnings("unused")
	private ApplicationContext context;

	/**
	 * The service being tested, injected by Spring.
	 *
	 */
	@Autowired
	protected ProductService service;

	/**
	 * Instantiates a new ProductServiceTest.
	 *
	 */
	public ProductServiceTest() {
		setupRequestContext();
	}

	/**
	 * Operation Unit Test
	* Save an existing Address entity
	* 
	 */
	@Test
	public void saveProductAddress() {
		// TODO: JUnit - Populate test inputs for operation: saveProductAddress 
		Integer id = 0;
		Address related_address = new cn.edu.scau.cmi.liangshanhero.domain.Address();
		Product response = null;
		response = service.saveProductAddress(id, related_address);
		// TODO: JUnit - Add assertions to test outputs of operation: saveProductAddress
	}

	/**
	 * Operation Unit Test
	* Save an existing Product entity
	* 
	 */
	@Test
	public void saveProduct() {
		// TODO: JUnit - Populate test inputs for operation: saveProduct 
		Product product = new cn.edu.scau.cmi.liangshanhero.domain.Product();
		service.saveProduct(product);
	}

	/**
	 * Operation Unit Test
	 */
	@Test
	public void findProductByPrimaryKey() {
		// TODO: JUnit - Populate test inputs for operation: findProductByPrimaryKey 
		Integer id_1 = 0;
		Product response = null;
		response = service.findProductByPrimaryKey(id_1);
		// TODO: JUnit - Add assertions to test outputs of operation: findProductByPrimaryKey
	}

	/**
	 * Operation Unit Test
	* Save an existing Producttype entity
	* 
	 */
	@Test
	public void saveProductProducttype() {
		// TODO: JUnit - Populate test inputs for operation: saveProductProducttype 
		Integer id_2 = 0;
		Producttype related_producttype = new cn.edu.scau.cmi.liangshanhero.domain.Producttype();
		Product response = null;
		response = service.saveProductProducttype(id_2, related_producttype);
		// TODO: JUnit - Add assertions to test outputs of operation: saveProductProducttype
	}

	/**
	 * Operation Unit Test
	* Delete an existing Product entity
	* 
	 */
	@Test
	public void deleteProduct() {
		// TODO: JUnit - Populate test inputs for operation: deleteProduct 
		Product product_1 = new cn.edu.scau.cmi.liangshanhero.domain.Product();
		service.deleteProduct(product_1);
	}

	/**
	 * Operation Unit Test
	* Load an existing Product entity
	* 
	 */
	@Test
	public void loadProducts() {
		Set<Product> response = null;
		response = service.loadProducts();
		// TODO: JUnit - Add assertions to test outputs of operation: loadProducts
	}

	/**
	 * Operation Unit Test
	* Return all Product entity
	* 
	 */
	@Test
	public void findAllProducts() {
		// TODO: JUnit - Populate test inputs for operation: findAllProducts 
		Integer startResult = 0;
		Integer maxRows = 0;
		List<Product> response = null;
		response = service.findAllProducts(startResult, maxRows);
		// TODO: JUnit - Add assertions to test outputs of operation: findAllProducts
	}

	/**
	 * Operation Unit Test
	* Return a count of all Product entity
	* 
	 */
	@Test
	public void countProducts() {
		Integer response = null;
		response = service.countProducts();
		// TODO: JUnit - Add assertions to test outputs of operation: countProducts
	}

	/**
	 * Operation Unit Test
	* Delete an existing Address entity
	* 
	 */
	@Test
	public void deleteProductAddress() {
		// TODO: JUnit - Populate test inputs for operation: deleteProductAddress 
		Integer product_id = 0;
		Integer related_address_id = 0;
		Product response = null;
		response = service.deleteProductAddress(product_id, related_address_id);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteProductAddress
	}

	/**
	 * Operation Unit Test
	* Delete an existing Producttype entity
	* 
	 */
	@Test
	public void deleteProductProducttype() {
		// TODO: JUnit - Populate test inputs for operation: deleteProductProducttype 
		Integer product_id_1 = 0;
		Integer related_producttype_id = 0;
		Product response = null;
		response = service.deleteProductProducttype(product_id_1, related_producttype_id);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteProductProducttype
	}

	/**
	 * Autowired to set the Spring application context.
	 *
	 */
	@Autowired
	public void setContext(ApplicationContext context) {
		this.context = context;
		((DefaultListableBeanFactory) context.getAutowireCapableBeanFactory()).registerScope("session", new SessionScope());
		((DefaultListableBeanFactory) context.getAutowireCapableBeanFactory()).registerScope("request", new RequestScope());
	}

	/**
	 * Sets Up the Request context
	 *
	 */
	private void setupRequestContext() {
		MockHttpServletRequest request = new MockHttpServletRequest();
		ServletRequestAttributes attributes = new ServletRequestAttributes(request);
		RequestContextHolder.setRequestAttributes(attributes);
	}
}
