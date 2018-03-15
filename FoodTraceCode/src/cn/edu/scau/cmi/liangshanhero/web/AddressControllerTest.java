
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
 * Unit test for the <code>AddressController</code> controller.
 *
 * @see cn.edu.scau.cmi.liangshanhero.web.AddressController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./src/main/resources/FoodTraceCode-security-context.xml",
		"file:./src/main/resources/FoodTraceCode-service-context.xml",
		"file:./src/main/resources/FoodTraceCode-dao-context.xml",
		"file:./src/main/resources/FoodTraceCode-web-context.xml" })
public class AddressControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>editAddressProducts()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditAddressProducts() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editAddressProducts");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		AddressController controller = (AddressController) context.getBean("AddressController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newAddressProducts()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewAddressProducts() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newAddressProducts");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		AddressController controller = (AddressController) context.getBean("AddressController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveAddressProducts()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveAddressProducts() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveAddressProducts");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		AddressController controller = (AddressController) context.getBean("AddressController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteAddressProducts()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteAddressProducts() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteAddressProducts");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		AddressController controller = (AddressController) context.getBean("AddressController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteAddressProducts()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteAddressProducts() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteAddressProducts");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		AddressController controller = (AddressController) context.getBean("AddressController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectAddressProducts()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectAddressProducts() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectAddressProducts");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		AddressController controller = (AddressController) context.getBean("AddressController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listAddressProducts()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistAddressProducts() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listAddressProducts");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		AddressController controller = (AddressController) context.getBean("AddressController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>indexAddress()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetindexAddress() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/indexAddress");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		AddressController controller = (AddressController) context.getBean("AddressController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectAddress()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectAddress() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectAddress");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		AddressController controller = (AddressController) context.getBean("AddressController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editAddress()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditAddress() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editAddress");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		AddressController controller = (AddressController) context.getBean("AddressController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveAddress()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveAddress() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveAddress");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		AddressController controller = (AddressController) context.getBean("AddressController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newAddress()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewAddress() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newAddress");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		AddressController controller = (AddressController) context.getBean("AddressController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteAddress()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteAddress() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteAddress");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		AddressController controller = (AddressController) context.getBean("AddressController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteAddress()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteAddress() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteAddress");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		AddressController controller = (AddressController) context.getBean("AddressController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>addressControllerbinaryaction()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetaddressControllerbinaryaction() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/addressController/binary.action");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		AddressController controller = (AddressController) context.getBean("AddressController");

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