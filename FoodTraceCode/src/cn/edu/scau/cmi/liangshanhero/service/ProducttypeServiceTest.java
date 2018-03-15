
package cn.edu.scau.cmi.liangshanhero.service;

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
public class ProducttypeServiceTest {

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
	protected ProducttypeService service;

	/**
	 * Instantiates a new ProducttypeServiceTest.
	 *
	 */
	public ProducttypeServiceTest() {
		setupRequestContext();
	}

	/**
	 * Operation Unit Test
	* Delete an existing Product entity
	* 
	 */
	@Test
	public void deleteProducttypeProducts() {
		// TODO: JUnit - Populate test inputs for operation: deleteProducttypeProducts 
		Integer producttype_id = 0;
		Integer related_products_id = 0;
		Producttype response = null;
		response = service.deleteProducttypeProducts(producttype_id, related_products_id);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteProducttypeProducts
	}

	/**
	 * Operation Unit Test
	* Return all Producttype entity
	* 
	 */
	@Test
	public void findAllProducttypes() {
		// TODO: JUnit - Populate test inputs for operation: findAllProducttypes 
		Integer startResult = 0;
		Integer maxRows = 0;
		List<Producttype> response = null;
		response = service.findAllProducttypes(startResult, maxRows);
		// TODO: JUnit - Add assertions to test outputs of operation: findAllProducttypes
	}

	/**
	 * Operation Unit Test
	 */
	@Test
	public void findProducttypeByPrimaryKey() {
		// TODO: JUnit - Populate test inputs for operation: findProducttypeByPrimaryKey 
		Integer id = 0;
		Producttype response = null;
		response = service.findProducttypeByPrimaryKey(id);
		// TODO: JUnit - Add assertions to test outputs of operation: findProducttypeByPrimaryKey
	}

	/**
	 * Operation Unit Test
	* Delete an existing Producttype entity
	* 
	 */
	@Test
	public void deleteProducttype() {
		// TODO: JUnit - Populate test inputs for operation: deleteProducttype 
		Producttype producttype = new cn.edu.scau.cmi.liangshanhero.domain.Producttype();
		service.deleteProducttype(producttype);
	}

	/**
	 * Operation Unit Test
	* Save an existing Product entity
	* 
	 */
	@Test
	public void saveProducttypeProducts() {
		// TODO: JUnit - Populate test inputs for operation: saveProducttypeProducts 
		Integer id_1 = 0;
		Product related_products = new cn.edu.scau.cmi.liangshanhero.domain.Product();
		Producttype response = null;
		response = service.saveProducttypeProducts(id_1, related_products);
		// TODO: JUnit - Add assertions to test outputs of operation: saveProducttypeProducts
	}

	/**
	 * Operation Unit Test
	* Load an existing Producttype entity
	* 
	 */
	@Test
	public void loadProducttypes() {
		Set<Producttype> response = null;
		response = service.loadProducttypes();
		// TODO: JUnit - Add assertions to test outputs of operation: loadProducttypes
	}

	/**
	 * Operation Unit Test
	* Return a count of all Producttype entity
	* 
	 */
	@Test
	public void countProducttypes() {
		Integer response = null;
		response = service.countProducttypes();
		// TODO: JUnit - Add assertions to test outputs of operation: countProducttypes
	}

	/**
	 * Operation Unit Test
	* Save an existing Producttype entity
	* 
	 */
	@Test
	public void saveProducttype() {
		// TODO: JUnit - Populate test inputs for operation: saveProducttype 
		Producttype producttype_1 = new cn.edu.scau.cmi.liangshanhero.domain.Producttype();
		service.saveProducttype(producttype_1);
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
