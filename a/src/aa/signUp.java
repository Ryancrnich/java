package aa;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.regex.Pattern;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class signup
 */
@WebServlet("/signup")
public class signUp extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @return 
     * @see HttpServlet#HttpServlet()
     */
    public void signup() {
        
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
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
		    String email = request.getParameter("email");
		    String pass = request.getParameter("pasword");
		    String pass2 = request.getParameter("password2");
		    PrintWriter out = response.getWriter();
		  
		    
		    
		    String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+ 
                    "[a-zA-Z0-9_+&*-]+)*@" + 
                    "(?:[a-zA-Z0-9-]+\\.)+[a-z" + 
                    "A-Z]{2,7}$"; 
                      
Pattern pat = Pattern.compile(emailRegex); 

boolean validemail= pat.matcher(email).matches();

	String namee = "^[a-zA-Z0-9_+&*]"; 
	pat = null; 
    pat = Pattern.compile(namee); 

boolean validname= pat.matcher(namee).matches(); 




if (email == null && name == null &&pass == null &&pass2 == null ) {
	out.print("email empty");
	response.sendRedirect("index.jsp");
}

		    			 try{  
		 				 	
		 			    	Class.forName("com.mysql.jdbc.Driver");  
		 			    	java.sql.Connection con=DriverManager.getConnection(  "jdbc:mysql:@localhost:3306:ryan","root","");  
		 			    	PreparedStatement ps=con.prepareStatement(  
		 					    	"select * from user_ where namee=? OR email =?");  
		 			    	ps.setString(1,name);  
		 			    	ps.setString(2,email);  
		 					    	ResultSet rs=ps.executeQuery();  
		 					    	if(rs.next()) {
		 					    		out.print("name already taken");
		 					    	}
		 					    	else {
		 					    		out.print("should have worked");
		 			    	 ps=con.prepareStatement(  
		 			    	"INSERT INTO mydb.user_(namee,email,passwordd,superuser,banned)VALUES(?,?,?,?,?);");  
		 			    	ps.setString(1,name);  
		 			    	ps.setString(2,email);  
		 			    	ps.setString(3,pass);  
		 			    	ps.setBoolean(4,false);  
		 			    	 rs=ps.executeQuery();  
		 			  
		 					    	 ps=con.prepareStatement(  
		 					   "select ID_ from user_ where namee=? OR email =? and banned = false");  
			 			    	ps.setString(1,name);  
			 			    	ps.setString(2,email); 
			 			    	ps.setBoolean(3,false); 
			 			    	 rs=ps.executeQuery();  
			 			    	HttpSession session = request.getSession();
 			 			    	session.setAttribute("name", name);
 			 			  	session.setAttribute("superuser", false);
 			 			    	
 			 			    	 int ID = (rs.getInt(1));
 			 			    	session.setAttribute("ID", ID);
 					    	
 			 			  	  
 			 			      	
			    	String ar = "<h1>welcome"+name+"</h1>";
			    	
			 					    	  }
		 					    	
			 	
		 			    	          
		 			    	}
		 					    	catch(Exception e){System.out.println(e);}  
	   
		 
}}


