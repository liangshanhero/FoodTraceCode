package cn.edu.scau.cmi.liangshanhero.web;

import cn.edu.scau.cmi.liangshanhero.dao.ProductDAO;
import cn.edu.scau.cmi.liangshanhero.dao.ProducttypeDAO;

import cn.edu.scau.cmi.liangshanhero.domain.Product;
import cn.edu.scau.cmi.liangshanhero.domain.Producttype;

import cn.edu.scau.cmi.liangshanhero.service.ProducttypeService;

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
 * Spring MVC controller that handles CRUD requests for Producttype entities
 * 
 */

@Controller("ProducttypeController")

public class ProducttypeController {

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
	 * Service injected by Spring that provides CRUD operations for Producttype entities
	 * 
	 */
	@Autowired
	private ProducttypeService producttypeService;

	/**
	 * Save an existing Product entity
	 * 
	 */
	@RequestMapping("/saveProducttypeProducts")
	public ModelAndView saveProducttypeProducts(@RequestParam Integer producttype_id, @ModelAttribute Product products) {
		Producttype parent_producttype = producttypeService.saveProducttypeProducts(producttype_id, products);

		ModelAndView mav = new ModelAndView();
		mav.addObject("producttype_id", producttype_id);
		mav.addObject("producttype", parent_producttype);
		mav.setViewName("producttype/viewProducttype.jsp");

		return mav;
	}

	/**
	* Create a new Producttype entity
	* 
	*/
	@RequestMapping("/newProducttype")
	public ModelAndView newProducttype() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("producttype", new Producttype());
		mav.addObject("newFlag", true);
		mav.setViewName("producttype/editProducttype.jsp");

		return mav;
	}

	/**
	* Select an existing Producttype entity
	* 
	*/
	@RequestMapping("/selectProducttype")
	public ModelAndView selectProducttype(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("producttype", producttypeDAO.findProducttypeByPrimaryKey(idKey));
		mav.setViewName("producttype/viewProducttype.jsp");

		return mav;
	}

	/**
	* Save an existing Producttype entity
	* 
	*/
	@RequestMapping("/saveProducttype")
	public String saveProducttype(@ModelAttribute Producttype producttype) {
		producttypeService.saveProducttype(producttype);
		return "forward:/indexProducttype";
	}

	/**
	* Select the Producttype entity for display allowing the user to confirm that they would like to delete the entity
	* 
	*/
	@RequestMapping("/confirmDeleteProducttype")
	public ModelAndView confirmDeleteProducttype(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("producttype", producttypeDAO.findProducttypeByPrimaryKey(idKey));
		mav.setViewName("producttype/deleteProducttype.jsp");

		return mav;
	}

	/**
	* Show all Product entities by Producttype
	* 
	*/
	@RequestMapping("/listProducttypeProducts")
	public ModelAndView listProducttypeProducts(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("producttype", producttypeDAO.findProducttypeByPrimaryKey(idKey));
		mav.setViewName("producttype/products/listProducts.jsp");

		return mav;
	}

	/**
	* Edit an existing Producttype entity
	* 
	*/
	@RequestMapping("/editProducttype")
	public ModelAndView editProducttype(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("producttype", producttypeDAO.findProducttypeByPrimaryKey(idKey));
		mav.setViewName("producttype/editProducttype.jsp");

		return mav;
	}

	/**
	*/
	@RequestMapping("/producttypeController/binary.action")
	public ModelAndView streamBinary(@ModelAttribute HttpServletRequest request, @ModelAttribute HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("streamedBinaryContentView");
		return mav;

	}

	/**
	* Create a new Product entity
	* 
	*/
	@RequestMapping("/newProducttypeProducts")
	public ModelAndView newProducttypeProducts(@RequestParam Integer producttype_id) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("producttype_id", producttype_id);
		mav.addObject("product", new Product());
		mav.addObject("newFlag", true);
		mav.setViewName("producttype/products/editProducts.jsp");

		return mav;
	}

	/**
	* View an existing Product entity
	* 
	*/
	@RequestMapping("/selectProducttypeProducts")
	public ModelAndView selectProducttypeProducts(@RequestParam Integer producttype_id, @RequestParam Integer products_id) {
		Product product = productDAO.findProductByPrimaryKey(products_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("producttype_id", producttype_id);
		mav.addObject("product", product);
		mav.setViewName("producttype/products/viewProducts.jsp");

		return mav;
	}

	/**
	* Entry point to show all Producttype entities
	* 
	*/
	public String indexProducttype() {
		return "redirect:/indexProducttype";
	}

	/**
	* Edit an existing Product entity
	* 
	*/
	@RequestMapping("/editProducttypeProducts")
	public ModelAndView editProducttypeProducts(@RequestParam Integer producttype_id, @RequestParam Integer products_id) {
		Product product = productDAO.findProductByPrimaryKey(products_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("producttype_id", producttype_id);
		mav.addObject("product", product);
		mav.setViewName("producttype/products/editProducts.jsp");

		return mav;
	}

	/**
	* Select the child Product entity for display allowing the user to confirm that they would like to delete the entity
	* 
	*/
	@RequestMapping("/confirmDeleteProducttypeProducts")
	public ModelAndView confirmDeleteProducttypeProducts(@RequestParam Integer producttype_id, @RequestParam Integer related_products_id) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("product", productDAO.findProductByPrimaryKey(related_products_id));
		mav.addObject("producttype_id", producttype_id);
		mav.setViewName("producttype/products/deleteProducts.jsp");

		return mav;
	}

	/**
	* Delete an existing Producttype entity
	* 
	*/
	@RequestMapping("/deleteProducttype")
	public String deleteProducttype(@RequestParam Integer idKey) {
		Producttype producttype = producttypeDAO.findProducttypeByPrimaryKey(idKey);
		producttypeService.deleteProducttype(producttype);
		return "forward:/indexProducttype";
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
	* Delete an existing Product entity
	* 
	*/
	@RequestMapping("/deleteProducttypeProducts")
	public ModelAndView deleteProducttypeProducts(@RequestParam Integer producttype_id, @RequestParam Integer related_products_id) {
		ModelAndView mav = new ModelAndView();

		Producttype producttype = producttypeService.deleteProducttypeProducts(producttype_id, related_products_id);

		mav.addObject("producttype_id", producttype_id);
		mav.addObject("producttype", producttype);
		mav.setViewName("producttype/viewProducttype.jsp");

		return mav;
	}

	/**
	* Show all Producttype entities
	* 
	*/
	@RequestMapping("/indexProducttype")
	public ModelAndView listProducttypes() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("producttypes", producttypeService.loadProducttypes());

		mav.setViewName("producttype/listProducttypes.jsp");

		return mav;
	}
}