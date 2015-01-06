package com.test.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TestWebServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6773103810638838114L;


	/**
	 * Constructor of the object.
	 */
	public TestWebServlet() {
		super();
	}

	/**
	 * Destruction Test of the servlet. <br>
	 */
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}
	

	/**
	 * The doGet method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

 
		this.doPost(request, response);
	}

	/**
	 * The doPost method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to post.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		
		DBConn dbConn = new DBConn();
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
        request.setCharacterEncoding("utf8");  
        response.setContentType("text/html;charset=utf8");
        

        String sex = request.getParameter("sex");
        int age = Integer.parseInt(request.getParameter("age")); 
        
		try {
	        String query = "SELECT * FROM users WHERE SEX=? and USER_AGE=?";   
	        PreparedStatement pspt = dbConn.getConnection().prepareStatement(query);
			
	        pspt.setString(1, sex);
	        pspt.setInt(2, age);
	        
	        System.out.println(pspt.toString());
	        ResultSet rs=pspt.executeQuery();
	        
			out.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">");
			out.println("<HTML>");
			out.println("  <HEAD><TITLE>A Servlet</TITLE></HEAD>");
			out.println("  <BODY>");
	        while(rs.next())
	        { 
	        	String name = rs.getString("USER_NAME");
	        	out.println("Got available user:" + name);
	        }
			out.println("  </BODY>");
			out.println("</HTML>");
			out.flush();
			out.close();
        }catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}   
      


	}

	/**
	 * Initialization of the servlet. <br>
	 *
	 * @throws ServletException if an error occurs
	 */
	public void init() throws ServletException {
		// Put your code here
	}
	
	
	public void getDatabaseConn(){
		
	}

        public String returnStr(){
           return "";
        }
	

}
