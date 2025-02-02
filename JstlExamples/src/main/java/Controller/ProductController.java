package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.Product;

/**
 * Servlet implementation class ProductController
 */
@WebServlet("/ProductController")
public class ProductController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public ProductController() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	PrintWriter pw = response.getWriter();
	
	Product p1 = new Product();
	p1.setPid(100);
	p1.setPname("TV");
	p1.setPrice(56000);
	p1.setQty(10);
	p1.setUrl("data:image/jpeg;base64,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");
	
	Product p2 = new Product();
	p2.setPid(101);
	p2.setPname("Computer");
	p2.setPrice(45000);
	p2.setQty(16);
	p2.setUrl("data:image/png;base64,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");
	
	Product p3 = new Product();
	p3.setPid(102);
	p3.setPname("Laptop");
	p3.setPrice(86000);
	p3.setQty(50);
	p3.setUrl("data:image/webp;base64,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");
	
	Product p4 = new Product();
	p4.setPid(103);
	p4.setPname("Pen Drive");
	p4.setPrice(2600);
	p4.setQty(100);
	p4.setUrl("data:image/jpeg;base64,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");
	
	List<Product> listOfProduct = new ArrayList<Product>();
	listOfProduct.add(p1);
	listOfProduct.add(p2);
	listOfProduct.add(p3);
	listOfProduct.add(p4);
	
	HttpSession hs = request.getSession();
	hs.setAttribute("products", listOfProduct);
	
	response.sendRedirect("displayProduct.jsp");
	}

	

}