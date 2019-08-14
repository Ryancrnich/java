package aa;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


/**
 * Servlet implementation class signIn
 */
@WebServlet("/signIn")
public class signIn extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public signIn() {
        super();
        // TODO Auto-generated constructor stub
    }

			protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				// TODO Auto-generated method stub
				response.getWriter().append("Served at: ").append(request.getContextPath());
			}

			/**
			 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
			 */
			protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				// TODO Auto-generated method stub
				doGet(request, response);

				  String name = request.getParameter("username");
				    String pass = request.getParameter("pasword");
				    PrintWriter out = response.getWriter();

		if (name == null || pass == null) {
			out.print("email empty fields");
			response.sendRedirect("index.jsp");
		}

			
				   
				    			
				    			 try{  
				 				 	
				 			    	Class.forName("com.mysql.jdbc.Driver");  
				 			    	java.sql.Connection con=DriverManager.getConnection(  "jdbc:mysql:@localhost:3306:ryan","root","");  
				 			    	PreparedStatement ps=con.prepareStatement(  
				 					    	"select ID_, superuser from user_ where namee=? OR email= ? AND passwordd =? AND banned =?");  
				 			    	ps.setString(1,name);  
				 			    	ps.setString(2,name);  
				 			    	ps.setString(3,pass);  
				 			    	ps.setBoolean(4,false); 
				 					    	ResultSet rs=ps.executeQuery();  
				 				
				 					    	if(!rs.next()) {
				 					    		out.print("user not found ");
				 					    	  	response.sendRedirect("index.jsp");
				 					    	  	
				 					    	}
				 					    	else {
				 					    		
				 			 			    	
				 			 			    	 int ID = (rs.getInt(1));		 
				 			 			  	 boolean superuser = (rs.getBoolean(2));		 
				 				        
				 			    	  HttpSession session = request.getSession();
				 			    		session.setAttribute("name", name);
				 			    		session.setAttribute("ID", ID);
				 					  	session.setAttribute("superuser", superuser);
				 			      	response.sendRedirect("schedule.jsp");}
				 						 
				 			    	
				 			    	}
				 					    	catch(Exception e){System.out.println(e);}  
				
				 	
			}
	

}
