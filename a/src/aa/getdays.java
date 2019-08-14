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
 * Servlet implementation class getdays
 */
@WebServlet("/getdays")
public class getdays extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getdays() {
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
		  String requested_starttime = request.getParameter("requested_starttime");
		  String requested_length = request.getParameter("requested_length");
		  String length = request.getParameter("length");
			HttpSession session = request.getSession();
		String name	= session.getAttribute("name").toString();
			int ID = (int)session.getAttribute("ID");
		  
		    PrintWriter out = response.getWriter();

if (date == null ) {
	out.print("email empty fields");
	response.sendRedirect("index.jsp");
}
try{  
	 	
	Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
 	java.sql.Connection con=DriverManager.getConnection( "jdbc:ucanaccess:C:\\Users\\Ryan\\eclipse-workspace\\a\\Database1.accdb");  
 	PreparedStatement ps=con.prepareStatement(  
		    	"select * from opened_day where datee=?;");  
 	ps.setString(1,date);  
 
		    	ResultSet rs=ps.executeQuery();  
		    	if(!rs.next()) {
		    		out.print("Day has no time avilable");
		    	}
		    	else {
		    		 ps=con.prepareStatement(  
	 					    	"SELECT AID from appointment WHERE datee=? and starttime=?;");  
	 			    	ps.setString(1,date);
	 			    	ps.setString(2,starttime);
	 			    	
	 			    
	 					     rs=ps.executeQuery();  
	 					    int AID = (rs.getInt(1));

		    		
	 						ps=con.prepareStatement( 
	 			     		    	"UPDATE appointment SET taken = ? WHERE AID =?");
	 				    		String string ="false";
	 			    		 ps.setString(1,string);  
	 			    		 ps.setInt(2,AID);  
	 			 
	 			    		
	 			    		 	 rs=ps.executeQuery();  
	 			
		    		
		    		
		    		 ps=con.prepareStatement( 
		    	"INSERT INTO mydb.taken(UID,AID,namee,datee,length,starttime,dateetaken)(VALUES(?,?,?,?,?,?); ");  
		    		 String string1 = "now()";
		     	ps.setInt(1,ID);  
		    	ps.setInt(2,AID);
		    	ps.setString(3,name);		    
		    	ps.setString(4,date);
		    	ps.setString(5,requested_length);
		    	ps.setString(6,requested_starttime);
		    	ps.setString(7,string1);
					     ps.executeQuery();  
					     
					   
   	response.sendRedirect("schedule.jsp");
   	

		     
		    	
		    	}



 	}
		    	catch(Exception e){System.out.println(e);}  



 

}




	}


