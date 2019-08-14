
<!DOCTYPE html>

<%@page import="aa.adddays"%>

<html>




<link href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">



<head>
<div  style="background:#555c6d;">
<meta charset="ISO-8859-1">
<title>M3 Productions scheduler page</title>
  <center>

<h1 style = "color:#352e9d;">M3<div style ="color:#4d79ff;"> Productions</div></h1>
</div>
  </center>
</head>

<body>
<%
String [] a = aa.adddays.getChoices(3, "9:00AM");
String[] choices = new String[a.length];
for(int i = 0; i < a.length;i++){
	out.print(a[i]);
}
%>




    <div style="width:80%;height:50%;background:#F5F6CE;"class="container">
  <div class="row">
   <h2 style=" "class="text-center"> Get Days</h2>
   <table id="mytable" class="table table-bordred table-striped">
             
                   <thead>                  
                   
                   <th>Date</th>                  
                    <th>StartTime</th>
                     <th>Time in hours</th>
                     <th>Your start time</th>
                     <th>your hours</th>
                      <th>Submit</th>                  
                                            
                   </thead>
    <tbody>     
    <tr>

        	  		     	 <tr>
      <td> date</td>  
        <td> startime</td> 
      <td> length </td> 
           
        	      
        	      	   <form action ="getdays" method="post"   id="rendered-form"><div class="rendered-form"><div >
<td>


                <div style="width:100%; float:left;" class="form-group">
                    <select class="form-control input-lg" name ="requested_starttime" id ="requested_starttime"form="a">

 <option value="9:00">9:00</option>
 <option value="10:00">10:00</option>


</select>
<option value="datee" id = "datee" type ="hidden"></option>
<option value="starttime" id = "starttime" type ="hidden"></option>
<option value="length" id = "length" type ="hidden"></option>
</td><td>

		    	   	<div style=" padding-left:5%;width:100%; float:left;" class="form-group">
                    <select class="form-control input-lg"placeholder="Start Time" required="required" id="requested_length"name="requested_length" form="carform">

<option value="1">1</option>
<option value="2">2</option>
<option value="3">3</option>
<option value="4">4</option>
<option value="5">5</option>
<option value="6">6</option>
<option value="7">7</option>
<option value="8">8</option>

</select>
  </div>
  </td>
<td>
</div>

<div class="fb-text form-group field-Email"><button name="submit" id="submit"value="Submit" type="submit"class="btn btn-primary btn-lg">Submit</button>
</td>

</form>
</tr>
 <tr>

        	  		     	 <tr>
      <td> date</td>  
        <td> startime</td> 
      <td> length </td> 
           
        	      
        	      	   <form action ="getdays" method="post"   id="rendered-form"><div class="rendered-form"><div >
<td>


                <div style="width:100%; float:left;" class="form-group">
                    <select class="form-control input-lg" name ="requested_starttime" id ="requested_starttime"form="a">
 <option value="9:00">9:00</option>
 <option value="10:00">10:00</option>
 <option value="11:00">11:00</option>
 <option value="12:00">12:00</option>

</select>
<option value="datee" id = "datee" type ="hidden"></option>
<option value="starttime" id = "starttime" type ="hidden"></option>
<option value="length" id = "length" type ="hidden"></option>
</td><td>

		    	   	<div style=" padding-left:5%;width:100%; float:left;" class="form-group">
                    <select class="form-control input-lg"placeholder="Start Time" required="required" id="requested_length"name="requested_length" form="carform">


<option value="1">1</option>
<option value="2">2</option>
<option value="3">3</option>
<option value="4">4</option>

</select>
  </div>
  </td>
<td>
</div>

<div class="fb-text form-group field-Email"><button name="submit" id="submit"value="Submit" type="submit"class="btn btn-primary btn-lg">Submit</button>
</td>

</form>
</tr>>
 <tr>

        	  		     	 <tr>
      <td> date</td>  
        <td> startime</td> 
      <td> length </td> 
           
        	      
        	      	   <form action ="getdays" method="post"   id="rendered-form"><div class="rendered-form"><div >
<td>


                <div style="width:100%; float:left;" class="form-group">
                    <select class="form-control input-lg" name ="requested_starttime" id ="requested_starttime"form="a">

 <option value="9:00">9:00</option>
 <option value="10:00">10:00</option>
  <option value="11:00">11:00</option>
 <option value="12:00">12:00</option>
  <option value="1:00">1:00</option>
 <option value="2:00">2:00</option>
  <option value="3:00">3:00</option>
 <option value="400">4:00</option>


</select>
<option value="datee" id = "datee" type ="hidden"></option>
<option value="starttime" id = "starttime" type ="hidden"></option>
<option value="length" id = "length" type ="hidden"></option>
</td><td>

		    	   	<div style=" padding-left:5%;width:100%; float:left;" class="form-group">
                    <select class="form-control input-lg"placeholder="Start Time" required="required" id="requested_length"name="requested_length" form="carform">


<option value="1">1</option>
<option value="2">2</option>
<option value="3">3</option>
<option value="4">4</option>
</select>
  </div>
  </td>
<td>
</div>

<div class="fb-text form-group field-Email"><button name="submit" id="submit"value="Submit" type="submit"class="btn btn-primary btn-lg">Submit</button>
</td>

</form>
</tr>>
      	</tbody>	
		    	
		       </table>	
              </div>
        	      
        	      
        	      
        	      <tbody>

    <div>
  <div class="row">

    <h2 class="text-center">Your Days </h2>
  </div>
  <table id="mytable" class="table table-bordred table-striped">
                   
                   <thead>
                   <th>Date</th>
                    <th>StartTime</th>
                     <th>Time in hours</th>
                     <th>                                                               </th>
                     
                        
                       <th>Delete</th>
                   </thead>
                   
    <tbody>
      <td> date</td>  
       <td> starttime</td>  
      <td> 4  </td> 
      <td>                                                                           </td>
    
      <form action ="deletedays" method="post"   id="rendered-form"><div class="rendered-form"><div >
		    	 
		    

		    	   	<div style=" padding-right:30%;width:25%; float:left;" class="form-group">
     
<option value="starttime" id = "starttime" type ="hidden"></option>
<option value="datee" id = "date" type ="hidden"></option>

      
       <td>
         <div class="fb-text form-group field-Email"><button name="submit" id="submit"value="Submit" type="submit"class="btn btn-primary btn-lg">Delete</button></div>

					</form>
 <td>
</div>					
					
					
					
												 </tbody>
 </table>
            
               
               
               
               
               
               
                      <h2 class="text-center"> ADD Days</h2>
        <table id="mytable" class="table table-bordred table-striped">
                   
                   <thead>
                   
                   
                   <th>Date</th>
                    <th>StartTime</th>
                     <th>Time in hours</th>
                   
                       <th>ADD Day</th>
                   
    
                  
                   </thead>
    <tbody>
    
    
    
    
            
		     	 <tr>
		     	
      <td>
      
	   <form action ="adddays" method="post"   id="rendered-form"><div class="rendered-form"><div >

		    	   	<div style=" padding-left:5%;width:100%; float:left;" class="form-group">

 <input type="text" name="date" required="required" id="txtDate" class="form-control input-lg" placeholder="Date">


  </div>
  </td>
     <td>
      

		    	   	<div style=" padding-left:5%;width:75%; float:left;" class="form-group">
                    <select class="form-control input-lg"placeholder="Start Time" required="required" id="requested_starttimee" name="starttime" form="carform">
<option value="">Time</option>

<option value="8:00">8:00</option>
<option value="9:00">9:00</option>
<option value="10:00">10:00</option>
<option value="11:00">11:00</option>
<option value="12:00">12:00</option>
<option value="1:00">1:00</option>
<option value="2:00">2:00</option>
<option value="3:00">3:00</option>
<option value="4:00">4:00</option>
<option value="5:00">5:00</option>
<option value="6:00">6:00</option>
<option value="7:00">7:00</option>
<option value="8:00">8:00</option>
</select>
  </div>
  </td> 
      <td>
      
	  

		    	   	<div style=" padding-left:5%;width:100%; float:left;" class="form-group">
                    <select class="form-control input-lg"placeholder="Length" required="required" id="requested_lengthh" name="length" form="carform">

<option value="1">1</option>
<option value="2">2</option>
<option value="3">3</option>
<option value="4">4</option>
<option value="5">5</option>
<option value="6">6</option>
<option value="7">7</option>
<option value="8">8</option>
</select>
  </div>
    <option value="length" id = "lengthd" type ="hidden"></option>
<option value="starttime" id = "starttime" type ="hidden"></option>
<option value="date" id = "date" type ="hidden"></option>
  </td>
      
       <td>
        
		    	   	<div style=" padding-left:5%;width:25%; float:left;" class="form-group">
<div class="fb-text form-group field-Email"><button name="submit" id="submit"value="Submit" type="submit"class="btn btn-primary btn-lg">ADD Day</button></div>
	</form>
 </td>
</div>
			

  
							 </tbody>
 </table>

					
					  <h2 class="text-center">Manage Days </h2>
  </div>
  <table id="mytable" class="table table-bordred table-striped">
                   
                   <thead>
                   <th>Date</th>
                       <th>Artist</th>
                       <th>StartTime</th>
                     <th>Time in hours</th>
                       <th>Kick</th>
                        <th>Ban</th>
                   </thead>
                   
      <tbody>
      	 <tr>
		     	 <%String s = "date"; %>
      <td> <%out.print(s); %></td>  
        <td>  <%out.print("name"); %></td> 
       <td>  <%out.print("starttime"); %></td> 
      <td>  <%out.print("length"); %> </td> 
		     
         <form action ="kick" method="post"   id="rendered-form"><div class="rendered-form"><div >
		    	 
		    

		    	   	<div style=" padding-left:5%;width:25%;" class="form-group">
             <option value="nameee" id = "nameee" type ="hidden"></option>
<option value="date" id = "length" type ="hidden"></option>
<option value="name" id = "name" type ="hidden"></option>
<option value="starttime" id = "length" type ="hidden"></option>   
       <td>

<div class="fb-text form-group field-Email"><button name="submit" id="submit"value="Submit" type="submit"class="btn btn-primary btn-lg">Kick</button></div>
	</form>
 </div>
     <form action ="ban" method="post"   ><div>

		    	   	<div style=" padding-left:5%;width:25%; float:left;" class="form-group">            
<option value="username" id = "username" type ="hidden"></option>
 </td>
 <td>
     
			<div class="fb-text form-group field-Email"><button name="submit" id="submit"value="Submit" type="submit"class="btn btn-primary btn-lg">Ban</button></div>
							</div>
							</form>
  
							 </tbody>
 </table>

   </div>

</div>
					
					
					
	</div>			
     	<script type ="text/javascript" src="js.js"> </script>	
     	
     	
     	<script type="text/javascript" src='https://ajax.aspnetcdn.com/ajax/jQuery/jquery-1.8.3.min.js'></script>
<script type="text/javascript" src='https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/3.0.3/js/bootstrap.min.js'></script>
<link rel="stylesheet" href='https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/3.0.3/css/bootstrap.min.css'
    media="screen" />
<!-- Bootstrap -->
<!-- Bootstrap DatePicker -->
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.6.4/css/bootstrap-datepicker.css" type="text/css"/>
<script src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.6.4/js/bootstrap-datepicker.js" type="text/javascript"></script>
<!-- Bootstrap DatePicker -->
<script type="text/javascript">
    $(function () {
        $('[id*=txtDate]').datepicker({
            changeMonth: true,
            changeYear: true,
            format: "mm-dd-yyyy",
            language: "tr"
        });
    });
    


    /**
     * 
     */

</script>

					<footer>
					
					</footer>
					
					
					
					