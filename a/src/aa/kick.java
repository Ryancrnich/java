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
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class kick
 */
@WebServlet("/kick")
public class kick extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public kick() {
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

		  String date = request.getParameter("datee");
		  String starttime = request.getParameter("starttime");
			HttpSession session = request.getSession();
		String name	= session.getAttribute("name").toString();
		    PrintWriter out = response.getWriter();

if (date == null ) {
	out.print("email empty fields");
	response.sendRedirect("index.jsp");
}
try{  
	 	
	Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
 	java.sql.Connection con=DriverManager.getConnection( "jdbc:ucanaccess:C:\\Users\\Ryan\\eclipse-workspace\\a\\Database1.accdb");  
	PreparedStatement ps=con.prepareStatement(  
		    	"select * from taken WHERE name=? and datee=? and startime=?;");  
		 ps.setString(1,name);  
		 ps.setString(1,date);  
		 ps.setString(1,starttime);   

		    	ResultSet rs=ps.executeQuery();  
		    	 int AID = (rs.getInt(1));
		    	
		    	if(!rs.next()) {
		    		
		    	out.print("there is no appointment for the user at this time.");  
		    	response.sendRedirect("schedue.jsp");
		    	}
		    	else {
		    		ps=con.prepareStatement( 
	     		    	"UPDATE appointment SET taken = ? WHERE AID =?");
		    		String string ="false";
	    		 ps.setString(1,string);  
	    		 ps.setInt(2,AID);  
	 
	    		
	    		 	 rs=ps.executeQuery();  
	    		 	 
	    		     
					    ps=con.prepareStatement(  
	 					    	"DELETE FROM taken WHERE namee=AID; ");  
	 			    	ps.setInt(1,AID);  
	 			    
	 					     rs=ps.executeQuery();  
    	response.sendRedirect("schedule.jsp");
 	
		    	}



	}
		    	catch(Exception e){System.out.println(e);}  





}

	}


