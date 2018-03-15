package cn.edu.scau.cmi.liangshanhero.web;

import cn.edu.scau.cmi.liangshanhero.dao.AddressDAO;
import cn.edu.scau.cmi.liangshanhero.dao.ProductDAO;
import cn.edu.scau.cmi.liangshanhero.dao.ProducttypeDAO;

import cn.edu.scau.cmi.liangshanhero.domain.Address;
import cn.edu.scau.cmi.liangshanhero.domain.Product;
import cn.edu.scau.cmi.liangshanhero.domain.Producttype;

import cn.edu.scau.cmi.liangshanhero.service.ProductService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.WebDataBinder;

import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.web.servlet.ModelAndView;

/**
 * Spring MVC controller that handles CRUD requests for Product entities
 * 
 */

@Controller("ProductController")

public class ProductController {

	/**
	 * DAO injected by Spring that manages Address entities
	 * 
	 */
	@Autowired
	private AddressDAO addressDAO;

	/**
	 * DAO injected by Spring that manages Product entities
	 * 
	 */
	@Autowired
	private ProductDAO productDAO;

	/**
	 * DAO injected by Spring that manages Producttype entities
	 * 
	 */
	@Autowired
	private ProducttypeDAO producttypeDAO;

	/**
	 * Service injected by Spring that provides CRUD operations for Product entities
	 * 
	 */
	@Autowired
	private ProductService productService;

	/**
	 * View an existing Address entity
	 * 
	 */
	@RequestMapping("/selectProductAddress")
	public ModelAndView selectProductAddress(@RequestParam Integer product_id, @RequestParam Integer address_id) {
		Address address = addressDAO.findAddressByPrimaryKey(address_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("product_id", product_id);
		mav.addObject("address", address);
		mav.setViewName("product/address/viewAddress.jsp");

		return mav;
	}

	/**
	*/
	@RequestMapping("/productController/binary.action")
	public ModelAndView streamBinary(@ModelAttribute HttpServletRequest request, @ModelAttribute HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("streamedBinaryContentView");
		return mav;

	}

	/**
	* Edit an existing Address entity
	* 
	*/
	@RequestMapping("/editProductAddress")
	public ModelAndView editProductAddress(@RequestParam Integer product_id, @RequestParam Integer address_id) {
		Address address = addressDAO.findAddressByPrimaryKey(address_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("product_id", product_id);
		mav.addObject("address", address);
		mav.setViewName("product/address/editAddress.jsp");

		return mav;
	}

	/**
	* Create a new Producttype entity
	* 
	*/
	@RequestMapping("/newProductProducttype")
	public ModelAndView newProductProducttype(@RequestParam Integer product_id) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("product_id", product_id);
		mav.addObject("producttype", new Producttype());
		mav.addObject("newFlag", true);
		mav.setViewName("product/producttype/editProducttype.jsp");

		return mav;
	}

	/**
	* Show all Address entities by Product
	* 
	*/
	@RequestMapping("/listProductAddress")
	public ModelAndView listProductAddress(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("product", productDAO.findProductByPrimaryKey(idKey));
		mav.setViewName("product/address/listAddress.jsp");

		return mav;
	}

	/**
	* Save an existing Producttype entity
	* 
	*/
	@RequestMapping("/saveProductProducttype")
	public ModelAndView saveProductProducttype(@RequestParam Integer product_id, @ModelAttribute Producttype producttype) {
		Product parent_product = productService.saveProductProducttype(product_id, producttype);

		ModelAndView mav = new ModelAndView();
		mav.addObject("product_id", product_id);
		mav.addObject("product", parent_product);
		mav.setViewName("product/viewProduct.jsp");

		return mav;
	}

	/**
	* Edit an existing Product entity
	* 
	*/
	@RequestMapping("/editProduct")
	public ModelAndView editProduct(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("product", productDAO.findProductByPrimaryKey(idKey));
		mav.setViewName("product/editProduct.jsp");

		return mav;
	}

	/**
	* Select an existing Product entity
	* 
	*/
	@RequestMapping("/selectProduct")
	public ModelAndView selectProduct(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("product", productDAO.findProductByPrimaryKey(idKey));
		mav.setViewName("product/viewProduct.jsp");

		return mav;
	}

	/**
	* Create a new Product entity
	* 
	*/
	@RequestMapping("/newProduct")
	public ModelAndView newProduct() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("product", new Product());
		mav.addObject("newFlag", true);
		mav.setViewName("product/editProduct.jsp");

		return mav;
	}

	/**
	* Select the child Producttype entity for display allowing the user to confirm that they would like to delete the entity
	* 
	*/
	@RequestMapping("/confirmDeleteProductProducttype")
	public ModelAndView confirmDeleteProductProducttype(@RequestParam Integer product_id, @RequestParam Integer related_producttype_id) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("producttype", producttypeDAO.findProducttypeByPrimaryKey(related_producttype_id));
		mav.addObject("product_id", product_id);
		mav.setViewName("product/producttype/deleteProducttype.jsp");

		return mav;
	}

	/**
	* Select the child Address entity for display allowing the user to confirm that they would like to delete the entity
	* 
	*/
	@RequestMapping("/confirmDeleteProductAddress")
	public ModelAndView confirmDeleteProductAddress(@RequestParam Integer product_id, @RequestParam Integer related_address_id) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("address", addressDAO.findAddressByPrimaryKey(related_address_id));
		mav.addObject("product_id", product_id);
		mav.setViewName("product/address/deleteAddress.jsp");

		return mav;
	}

	/**
	* Save an existing Product entity
	* 
	*/
	@RequestMapping("/saveProduct")
	public String saveProduct(@ModelAttribute Product product) {
		productService.saveProduct(product);
		return "forward:/indexProduct";
	}

	/**
	* Delete an existing Product entity
	* 
	*/
	@RequestMapping("/deleteProduct")
	public String deleteProduct(@RequestParam Integer idKey) {
		Product product = productDAO.findProductByPrimaryKey(idKey);
		productService.deleteProduct(product);
		return "forward:/indexProduct";
	}

	/**
	* Register custom, context-specific property editors
	* 
	*/
	@InitBinder
	public void initBinder(WebDataBinder binder, HttpServletRequest request) { // Register static property editors.
		binder.registerCustomEditor(java.util.Calendar.class, new org.skyway.spring.util.databinding.CustomCalendarEditor());
		binder.registerCustomEditor(byte[].class, new org.springframework.web.multipart.support.ByteArrayMultipartFileEditor());
		binder.registerCustomEditor(boolean.class, new org.skyway.spring.util.databinding.EnhancedBooleanEditor(false));
		binder.registerCustomEditor(Boolean.class, new org.skyway.spring.util.databinding.EnhancedBooleanEditor(true));
		binder.registerCustomEditor(java.math.BigDecimal.class, new org.skyway.spring.util.databinding.NaNHandlingNumberEditor(java.math.BigDecimal.class, true));
		binder.registerCustomEditor(Integer.class, new org.skyway.spring.util.databinding.NaNHandlingNumberEditor(Integer.class, true));
		binder.registerCustomEditor(java.util.Date.class, new org.skyway.spring.util.databinding.CustomDateEditor());
		binder.registerCustomEditor(String.class, new org.skyway.spring.util.databinding.StringEditor());
		binder.registerCustomEditor(Long.class, new org.skyway.spring.util.databinding.NaNHandlingNumberEditor(Long.class, true));
		binder.registerCustomEditor(Double.class, new org.skyway.spring.util.databinding.NaNHandlingNumberEditor(Double.class, true));
	}

	/**
	* Show all Producttype entities by Product
	* 
	*/
	@RequestMapping("/listProductProducttype")
	public ModelAndView listProductProducttype(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("product", productDAO.findProductByPrimaryKey(idKey));
		mav.setViewName("product/producttype/listProducttype.jsp");

		return mav;
	}

	/**
	* Edit an existing Producttype entity
	* 
	*/
	@RequestMapping("/editProductProducttype")
	public ModelAndView editProductProducttype(@RequestParam Integer product_id, @RequestParam Integer producttype_id) {
		Producttype producttype = producttypeDAO.findProducttypeByPrimaryKey(producttype_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("product_id", product_id);
		mav.addObject("producttype", producttype);
		mav.setViewName("product/producttype/editProducttype.jsp");

		return mav;
	}

	/**
	* Create a new Address entity
	* 
	*/
	@RequestMapping("/newProductAddress")
	public ModelAndView newProductAddress(@RequestParam Integer product_id) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("product_id", product_id);
		mav.addObject("address", new Address());
		mav.addObject("newFlag", true);
		mav.setViewName("product/address/editAddress.jsp");

		return mav;
	}

	/**
	* Entry point to show all Product entities
	* 
	*/
	public String indexProduct() {
		return "redirect:/indexProduct";
	}

	/**
	* Show all Product entities
	* 
	*/
	@RequestMapping("/indexProduct")
	public ModelAndView listProducts() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("products", productService.loadProducts());

		mav.setViewName("product/listProducts.jsp");

		return mav;
	}

	/**
	* Delete an existing Address entity
	* 
	*/
	@RequestMapping("/deleteProductAddress")
	public ModelAndView deleteProductAddress(@RequestParam Integer product_id, @RequestParam Integer related_address_id) {
		ModelAndView mav = new ModelAndView();

		Product product = productService.deleteProductAddress(product_id, related_address_id);

		mav.addObject("product_id", product_id);
		mav.addObject("product", product);
		mav.setViewName("product/viewProduct.jsp");

		return mav;
	}

	/**
	* Select the Product entity for display allowing the user to confirm that they would like to delete the entity
	* 
	*/
	@RequestMapping("/confirmDeleteProduct")
	public ModelAndView confirmDeleteProduct(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("product", productDAO.findProductByPrimaryKey(idKey));
		mav.setViewName("product/deleteProduct.jsp");

		return mav;
	}

	/**
	* View an existing Producttype entity
	* 
	*/
	@RequestMapping("/selectProductProducttype")
	public ModelAndView selectProductProducttype(@RequestParam Integer product_id, @RequestParam Integer producttype_id) {
		Producttype producttype = producttypeDAO.findProducttypeByPrimaryKey(producttype_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("product_id", product_id);
		mav.addObject("producttype", producttype);
		mav.setViewName("product/producttype/viewProducttype.jsp");

		return mav;
	}

	/**
	* Delete an existing Producttype entity
	* 
	*/
	@RequestMapping("/deleteProductProducttype")
	public ModelAndView deleteProductProducttype(@RequestParam Integer product_id, @RequestParam Integer related_producttype_id) {
		ModelAndView mav = new ModelAndView();

		Product product = productService.deleteProductProducttype(product_id, related_producttype_id);

		mav.addObject("product_id", product_id);
		mav.addObject("product", product);
		mav.setViewName("product/viewProduct.jsp");

		return mav;
	}

	/**
	* Save an existing Address entity
	* 
	*/
	@RequestMapping("/saveProductAddress")
	public ModelAndView saveProductAddress(@RequestParam Integer product_id, @ModelAttribute Address address) {
		Product parent_product = productService.saveProductAddress(product_id, address);

		ModelAndView mav = new ModelAndView();
		mav.addObject("product_id", product_id);
		mav.addObject("product", parent_product);
		mav.setViewName("product/viewProduct.jsp");

		return mav;
	}
}