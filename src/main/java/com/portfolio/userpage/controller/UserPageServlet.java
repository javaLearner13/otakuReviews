package com.portfolio.userpage.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.portfolio.login.model.UserLogin;
import com.portfolio.product.dao.ProductDAO;
import com.portfolio.product.model.Product;
import com.portfolio.registration.dao.UserDAO;
import com.portfolio.registration.model.User;


//userPage는 서블릿으로만 구현하였음
//관리자페이지임 admin 정보로 로그인하였을때 자동 redirect 됨
//LoginServlet에서 admin 로그인관련 추가 및 수정

@WebServlet("/dXireRpIIlQxXiA_3lIo7")
public class UserPageServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

    public UserPageServlet() {
    	
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doHandle(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doHandle(request, response);
	}

	private void doHandle(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		//ProductDAO의 listProducts 메소드 사용 위함
		ProductDAO productDAO = new ProductDAO();
		List<Product> list = productDAO.listProducts();
		out.print("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\">");
		out.print("<html><body>");
		out.print("<div align=center>");
		out.print("<h1>Admin Page</h1>");
		out.print("</div>");
		out.print("<h3>All Reviews</h3>");
		out.println("<table class='table table-bordered table-dark'>");
		out.println("<thead><tr><th scope='col'>id</th><th scope='col'>name</th><th scope='col'>brand</th><th scope='col'>price</th><th scope='col'>review</th></tr></thead>");
		out.print("<tbody>");
		for(int i=0;i<list.size();i++) {
			Product product = list.get(i);
			int id = product.getProduct_id();
			String name = product.getProduct_name();
			String brand = product.getProduct_brand();
			float price = product.getProduct_price();
			String review = product.getProduct_review();
			out.print("<tr><th scope='row'>"+id+"</th><td>"+name+"</td><td>"+brand+"</td><td>"+price+"</td><td>"+review+"</td></tr>");
		}
		out.println("</tbody>");
		out.print("</table><br><hr><br>");
		//ProductDAO의 listProducts 부분 끝
		
		//UserDAO의 userInfoList 메소드 사용 위함
		UserDAO userDAO = new UserDAO();
		List<User> list2 = userDAO.userInfoList();		

//		out.print("<html><body>");
		out.print("<h3>All Users</h3>");
		out.print("<table class='table table-borderless table-dark'><tr>");
		out.print("<td>first name</td><td>last name</td><td>user ID</td><td>email</td><td>address</td><td>phone</td>");
		
		for(int i=0;i<list2.size();i++) {
			User user= list2.get(i);
			String fname = user.getFirstName();
			String lname = user.getLastName();
			String username = user.getUserName();
			String email = user.getEmail();
			String address = user.getAddress();
			String phone = user.getPhone();
			
				out.print("<tr><td>"+fname+"</td><td>"+lname+"</td><td>"+username+"</td><td>"+email+"</td><td>"+address+"</td><td>"+phone+"</td></tr>");
			
		}
		out.print("</table></body></html>");
		//UserDAO의 userInfoList 부분 끝
		
	}
	
	
	
}
