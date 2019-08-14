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
 * Servlet implementation class adddays
 */
@WebServlet("/adddays")
public class adddays extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public adddays() {
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
	@SuppressWarnings("resource")
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		
		  String date = request.getParameter("datee");
		  String starttime = request.getParameter("starttime");
		  String temp = request.getParameter("length");
		  int length = 0;  // replace with whatever default value you want
		  PrintWriter out = response.getWriter();
		  
		  
try{  
	 	
	Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
 	java.sql.Connection con=DriverManager.getConnection( 
 	"jdbc:ucanaccess://Users//Ryan//eclipse-workspace//a//Database1.accdb");
 	PreparedStatement ps=con.prepareStatement( 
		    
		    	"select * from opened_day where datee=?;");  
 	ps.setString(1,date);  
 
		    	ResultSet rs=ps.executeQuery();  
		    	if(!rs.next()) {
		    		 ps=con.prepareStatement( 
		    	"INSERT INTO mydb.opened_day(datee) VALUE(?); ");  
		     	ps.setString(1,date);  
		     	ps.executeQuery();  
		    	}
		    	 
		    	 	 ps=con.prepareStatement( 
		    			    "select starttime, length from opened_day where datee=?;");  
		     	ps.setString(1,date);  
		     	 rs=ps.executeQuery();
		     	 
		    	 String starttime1 = (rs.getString(1));
		    	 int length1 = (rs.getInt(1));
		    	 
		    	 boolean valid = compare(length,starttime,length1,starttime1);
		    	 if(valid) {
		    		 
		    		 
		    		   ps=con.prepareStatement( 
		    			    	"INSERT INTO mydb.appointment(datee,length,starttime,taken)VALUES(?,?,?,?); ");  
		    			    		 String string = "now()";
		    			    	ps.setString(1,date);
		    			    	ps.setInt(2,length);
		    			    	ps.setString(3,starttime);
		    			    	ps.setBoolean(3,false);
  			
		    			    		
		    			    	ps.setString(4,"false");
		    					 ps.executeQuery();  
		    						     


		    		 
		    	 }
		    	 else {
		    		 out.print("conficts with an appoinment");
		    	 }
		    						   
			    	   	response.sendRedirect("schedule.jsp");


 	}
		    	catch(Exception e){System.out.println(e);}  

}


	




	public static  int getInt (String a) {
		  if(a == "8:00AM") 
	    		return 0;
		  else if(a == "9:00AM") 
	    		return 1;
		  else if(a == "10:00AM") 
	    		return 2;
		  else if(a == "11:00AM") 
	    		return 3;
		  else if(a == "12:00PM") 
	    		return 4;
		  else if(a == "1:00PM") 
	    		return 5;
		  else if(a == "2:00PM") 
	    		return 6;
		  else if(a == "3:00PM") 
	    		return 7;
		  else if(a == "4:00PM") 
	    		return 8;
		else if(a == "5:00PM") 
		return 9;
  else if(a == "6:00PM") 
		return 10;
  else if(a == "7:00PM") 
		return 11;
  else if(a == "8:00PM") 
		return 12;
  else return (Integer) null;
	 
	  }
	  public static  String getString (int string) {
		  if(string == 0) 
	    		return "8:00AM";
		  else if(string == 1) 
	    		return "9:00AM";
		  else if(string == 2) 
	    		return "10:00AM";
		  else if(string == 3) 
	    		return "11:00AM";
		  else if(string == 4) 
	    		return "12:00PM";
		  else if(string == 5) 
	    		return "1:00PM";
		  else if(string == 6) 
	    		return "2:00PM";
		  else if(string == 7) 
	    		return "3:00PM";
		  else if(string == 8) 
	    		return "4:00AM";
		else if(string == 9) 
		return "5:00AM";
  else if(string == 10) 
		return "6:00AM";
  else if(string == 11) 
		return "7:00AM";
  else if(string == 12) 
		return "8:00AM";
  else return "0";
	 
	  }
	  

	  public static  boolean compare (int re, String q, int set, String day) {
		  int ne = getInt(q);
		  int g = getInt(day);
		  if (ne == g ) {
			  return false;
		  }
		  if(g >= ne) {
			  if((ne +re )<=(g)) {
				  return true;
				  
			  }
			  else {
				  if((ne )>=(g+set)) {
					  return true;
					  
				  }
				  else {
					  System.out.print("The new runs over the existing ");
					  return false;
				  }
			  }
			  
		  }
		  else {
			  System.out.print("The old runs over the new appointment ");
			  return false;
		  }
		 
	 
	  }

	 
	  
	  
	  
	  
	  
	  
	  public static  String[] getChoices (int re, String q) {
		  int ne = getInt(q);
		  String[] choices = new String[re];
		 
	for(int i = 0; i <re;i++) {
		String s =getString(ne);
		if(s != null) {				
					
		 choices[i] = s;
		 ne++;
				}
				else {
					break;
				}
	}
	return choices;
	
		
	 
	  }


	






}