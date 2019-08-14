function adddays() {
    	var x =document.querySelector('#requested_starttimee');
    	var b =document.querySelector('#requested_lengthh');    
    	var length_count ;
		var start_count ;
		var hours ;
    		 if(x.value !=""){
    			 	for (var s = 0; s < x.childElementCount; s++) {
    			 		if(x.value == x[s].value){
       			 			length_count = b.childElementCount;
    			 			start_count = x.childElementCount;
    			 			hours = s;    
    			 			myFunction(hours, b, length_count, start_count);
    			 			break;
    			 		}
       			 	}
    		 	}
    		}
    function myFunction(hours, temp, length_count, start_count){

    	if(start_count-hours !=length_count ){
    		if(start_count-hours > length_count){
      			var differnece = (start_count-hours)-length_count;
      			var last =  temp.lastElementChild.value;
      			for(var i = 0;i < differnece; i++){
    			if(last < 8 ){
    				last++;
    			var option = document.createElement("option");
    			 option.text = option.value = last;
    			temp.add(option);
    			}}

    			}

			if(start_count-hours < length_count){
				
				var differnece =  length_count-(start_count-hours);
				for(var i = 0;i < differnece;i++){
					
					temp.removeChild(temp.lastElementChild)
					
				}
			}

    	}
    	}
   function finder() {

    	var x =document.querySelectorAll('#requested_starttime');
    	var b =document.querySelectorAll('#requested_length');    
    	var c;
    	var temp;    	 
    	var length_count ;
		var start_count ;
		var hours ;
    	
    	for ( var i = 0; i < x.length; i++ ) {
    		 c = x[i];
    		 if(c.value !=""){
    	    		 
    			 	for (var s = 0; s < c.length; s++) {
    			 		if(c.value == c[s].innerHTML){
    			 			temp =b[i];
    			 			length_count = temp.childElementCount;
    			 			start_count = x[i].childElementCount;
    			 			hours = s;    
    			 			myFunction(hours, temp, length_count, start_count);
    			 			break;
    			 		}
       			 	}
    		 	}
    		}
    	}
	
    function action() {
    	var x =document.querySelectorAll('#requested_starttime');
    	for ( var i = 0; i < x.length; i++ ) {
    		x[i].addEventListener('change',finder);
    	}
    	var y =document.querySelector('#requested_starttimee');
    	y.addEventListener('change',adddays);
    }    		
    action();
     