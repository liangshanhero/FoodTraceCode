
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
 * Unit test for the <code>ProductController</code> controller.
 *
 * @see cn.edu.scau.cmi.liangshanhero.web.ProductController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./src/main/resources/FoodTraceCode-security-context.xml",
		"file:./src/main/resources/FoodTraceCode-service-context.xml",
		"file:./src/main/resources/FoodTraceCode-dao-context.xml",
		"file:./src/main/resources/FoodTraceCode-web-context.xml" })
public class ProductControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>editProductProducttype()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditProductProducttype() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editProductProducttype");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductController controller = (ProductController) context.getBean("ProductController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newProductProducttype()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewProductProducttype() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newProductProducttype");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductController controller = (ProductController) context.getBean("ProductController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveProductProducttype()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveProductProducttype() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveProductProducttype");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductController controller = (ProductController) context.getBean("ProductController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteProductProducttype()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteProductProducttype() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteProductProducttype");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductController controller = (ProductController) context.getBean("ProductController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteProductProducttype()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteProductProducttype() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteProductProducttype");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductController controller = (ProductController) context.getBean("ProductController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectProductProducttype()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectProductProducttype() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectProductProducttype");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductController controller = (ProductController) context.getBean("ProductController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listProductProducttype()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistProductProducttype() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listProductProducttype");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductController controller = (ProductController) context.getBean("ProductController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editProductAddress()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditProductAddress() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editProductAddress");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductController controller = (ProductController) context.getBean("ProductController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newProductAddress()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewProductAddress() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newProductAddress");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductController controller = (ProductController) context.getBean("ProductController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveProductAddress()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveProductAddress() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveProductAddress");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductController controller = (ProductController) context.getBean("ProductController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteProductAddress()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteProductAddress() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteProductAddress");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductController controller = (ProductController) context.getBean("ProductController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteProductAddress()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteProductAddress() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteProductAddress");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductController controller = (ProductController) context.getBean("ProductController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectProductAddress()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectProductAddress() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectProductAddress");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductController controller = (ProductController) context.getBean("ProductController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listProductAddress()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistProductAddress() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listProductAddress");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductController controller = (ProductController) context.getBean("ProductController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>indexProduct()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetindexProduct() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/indexProduct");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductController controller = (ProductController) context.getBean("ProductController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectProduct()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectProduct() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectProduct");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductController controller = (ProductController) context.getBean("ProductController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editProduct()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditProduct() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editProduct");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductController controller = (ProductController) context.getBean("ProductController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveProduct()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveProduct() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveProduct");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductController controller = (ProductController) context.getBean("ProductController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newProduct()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewProduct() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newProduct");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductController controller = (ProductController) context.getBean("ProductController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteProduct()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteProduct() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteProduct");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductController controller = (ProductController) context.getBean("ProductController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteProduct()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteProduct() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteProduct");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductController controller = (ProductController) context.getBean("ProductController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>productControllerbinaryaction()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetproductControllerbinaryaction() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/productController/binary.action");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProductController controller = (ProductController) context.getBean("ProductController");

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