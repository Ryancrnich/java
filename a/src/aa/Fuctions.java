package aa;

abstract class Fuctions {

	public Fuctions() {
		// TODO Auto-generated constructor stub
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
		if(s != "0") {				
					
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
