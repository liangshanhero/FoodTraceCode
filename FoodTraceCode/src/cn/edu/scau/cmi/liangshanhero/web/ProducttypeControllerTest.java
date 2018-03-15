
package cn.edu.scau.cmi.liangshanhero.web;

import org.junit.Test;

import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;

import org.springframework.context.ApplicationContext;

import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;

import org.springframework.test.context.ContextConfiguration;

import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.RequestScope;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.context.request.SessionScope;

/**
 * Unit test for the <code>ProducttypeController</code> controller.
 *
 * @see cn.edu.scau.cmi.liangshanhero.web.ProducttypeController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./src/main/resources/FoodTraceCode-security-context.xml",
		"file:./src/main/resources/FoodTraceCode-service-context.xml",
		"file:./src/main/resources/FoodTraceCode-dao-context.xml",
		"file:./src/main/resources/FoodTraceCode-web-context.xml" })
public class ProducttypeControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>editProducttypeProducts()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditProducttypeProducts() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editProducttypeProducts");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProducttypeController controller = (ProducttypeController) context.getBean("ProducttypeController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newProducttypeProducts()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewProducttypeProducts() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newProducttypeProducts");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProducttypeController controller = (ProducttypeController) context.getBean("ProducttypeController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveProducttypeProducts()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveProducttypeProducts() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveProducttypeProducts");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProducttypeController controller = (ProducttypeController) context.getBean("ProducttypeController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteProducttypeProducts()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteProducttypeProducts() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteProducttypeProducts");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProducttypeController controller = (ProducttypeController) context.getBean("ProducttypeController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteProducttypeProducts()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteProducttypeProducts() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteProducttypeProducts");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProducttypeController controller = (ProducttypeController) context.getBean("ProducttypeController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectProducttypeProducts()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectProducttypeProducts() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectProducttypeProducts");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProducttypeController controller = (ProducttypeController) context.getBean("ProducttypeController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listProducttypeProducts()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistProducttypeProducts() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listProducttypeProducts");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProducttypeController controller = (ProducttypeController) context.getBean("ProducttypeController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>indexProducttype()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetindexProducttype() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/indexProducttype");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProducttypeController controller = (ProducttypeController) context.getBean("ProducttypeController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectProducttype()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectProducttype() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectProducttype");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProducttypeController controller = (ProducttypeController) context.getBean("ProducttypeController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editProducttype()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditProducttype() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editProducttype");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProducttypeController controller = (ProducttypeController) context.getBean("ProducttypeController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveProducttype()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveProducttype() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveProducttype");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProducttypeController controller = (ProducttypeController) context.getBean("ProducttypeController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newProducttype()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewProducttype() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newProducttype");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProducttypeController controller = (ProducttypeController) context.getBean("ProducttypeController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteProducttype()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteProducttype() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteProducttype");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProducttypeController controller = (ProducttypeController) context.getBean("ProducttypeController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteProducttype()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteProducttype() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteProducttype");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProducttypeController controller = (ProducttypeController) context.getBean("ProducttypeController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>producttypeControllerbinaryaction()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetproducttypeControllerbinaryaction() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/producttypeController/binary.action");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProducttypeController controller = (ProducttypeController) context.getBean("ProducttypeController");

		// TODO Invoke method and Assert return values

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
	 * Returns a mock HttpServletRequest object.
	 *
	 */
	private MockHttpServletRequest getMockHttpServletRequest() {
		MockHttpServletRequest request = new MockHttpServletRequest();
		ServletRequestAttributes attributes = new ServletRequestAttributes(request);
		RequestContextHolder.setRequestAttributes(attributes);
		return request;
	}

	/**
	 * Returns a mock HttpServletResponse object.
	 *
	 */
	private MockHttpServletResponse getMockHttpServletResponse() {
		return new MockHttpServletResponse();
	}
}