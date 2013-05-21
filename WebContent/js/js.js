function sum(arguments){
	alert("123");
	var n1=parseInt(arguments[2]);
	var n2=parseInt(arguments[1]);
	//alert(n1);
}


$(document).ready(function(){
$('input#search').focus();
$('input#search').addClass('search1');	
    $("li a").mouseover(
      function(){     	
        $(this).addClass('background');
      }
    );
    $("button").mouseover(
      function(){     	
        $(this).css('background','darkorange');
      }
    );
     $("li a").mouseout(
      function(){     	
        $(this).removeClass('background');
      }
    );
    $("button").mouseout(
      function(){     	
        $(this).css('background','orange');
      }
    );
    $("div.3 a").click(
     function($e){
       $e.preventDefault();
       window.open(this.href,"fwefw",'');
     }
    );
    
    $('input.show').click(
      function($e){
          $('h1.hide').hide();
          /*$('h1.hide').att('value','close');*/
      }
    );
    
    $('input.close').click(
      function($e){
          $('h1.hide').slideDown(2000);
          /*$('h1.hide').att('value','close');*/
         
      }
    );
    
    $("input#tmdopen").click(    
     function(){     	
     	
     	$("div#tmdDial").css('display','block');
     	
     }
    );
    $("input#tmdclose").click(    
     function(){     	    	
     	$("div#tmdDial").css('display','none');    	
     }
    );
    
    
    
    $('p').mouseover(    
     function(){    	
     //	$e.preventDefault();    	
        /*$(this).addClass('p1'); */  
     	$(this).css('color','yellow');
     }
    );
    
    $('div').find('p').css('color','red');    
    $('li').find('a').css('color','red');
    $('li.p1').next().css('color','red');
    /*$('li').not('li.p1').css('color','white'); //反选
*/}
);
