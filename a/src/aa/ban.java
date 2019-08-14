package aa;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ban
 */
@WebServlet("/ban")
public class ban extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ban() {
        super();
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
				  
				    PrintWriter out = response.getWriter();

		if (name == null ) {
			out.print("email empty fields");
			response.sendRedirect("index.jsp");
		}

			
				   
				    			
				    			 try{  
				 				 	
				    					Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
				    				 	java.sql.Connection con=DriverManager.getConnection( "jdbc:ucanaccess:C:\\Users\\Ryan\\eclipse-workspace\\a\\Database1.accdb");  
				 			    	PreparedStatement ps=con.prepareStatement(  
				 					    	"select * from user_ where name=?;");  
				 			    	ps.setString(1,name);  
				 			    
				 					    	ResultSet rs=ps.executeQuery();  
				 					    	if(!rs.next()) {
				 					    		out.print("user not found ");
				 					    	  	response.sendRedirect("index.jsp");
				 					    	  	
				 					    	}
				 					    	else {
				 					    	
				 					    		 ps=con.prepareStatement(  
							 					    	"DELETE FROM taken WHERE namee=?; ");  
							 			    	ps.setString(1,name);  
							 			    
							 					     rs=ps.executeQuery();  
							 					     
							 					    ps=con.prepareStatement(  
								 					    	"UPDATE user  SET  banned = true WHERE namee=?; ");  
								 			    	ps.setString(1,name);  
								 			    
								 					     rs=ps.executeQuery();  
				 			      	response.sendRedirect("schedule.jsp");
				 			      	

	 					    		 ps=con.prepareStatement(  
				 					    	"INSERT INTO mydb.banned(namee) VALUES(?); ");  
				 			    	ps.setString(1,name);  
				 			    
				 					     rs=ps.executeQuery();  
				 					     
				 					    	
				 					    	}



				 			    	}
				 					    	catch(Exception e){System.out.println(e);}  
				
				   

				 			    
				    	
							 }
	
	 
	

	}


