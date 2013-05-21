<%@ page contentType="text/html; charset=utf-8"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<LINK href="css/test.css" type="text/css" rel="stylesheet">
<script type="text/javascript" src="jquery.js"></script>
<script type="text/javascript" src="js/coin-slider.min.js"></script>
<link rel="stylesheet" href="css/coin-slider-styles.css" type="text/css" />

<script type="text/javascript">
 $(document).ready(function(){
     $('div.d1').hover(    	     
        function(){
            $(this).css('background','darkorange');
            $('div.d4').css('display','block');
            },
        function(){
            $(this).css('background','orange');
            $('div.d4').css('display','none');
            }
    	     );	
     $('div.d2').hover(    	     
    	        function(){
    	            $(this).css('background','darkorange');
    	            $('div.d5').css('display','block');
    	            },
    	        function(){
    	            $(this).css('background','orange');
    	            $('div.d5').css('display','none');
    	            }
    	    	     );	
     $('div.d3').hover(    	     
    	        function(){
    	            $(this).css('background','darkorange');
    	            $('div.d6').css('display','block');
    	            },
    	        function(){
    	            $(this).css('background','orange');
    	            $('div.d6').css('display','none');
    	            }
    	    	     );	
       
    	 
     $('#coin-slider').coinslider({ width: 700});
    	
    	     
      }
  );
</script> 

</head>
 
<body>
<div class='d1'>
  <div class='p5'>论坛</div>
</div>
<div class='d2'><div class='p5'>新闻</div></div>
<div class='d3'><div class='p5'>通知</div></div>
<div class='d4'>
  <ul>
    <li>123342342423</li>
    <li>234423424234</li>
    <li>fwe243224232</li>
    <li>123342342423</li>
    <li>234423424234</li>
    <li>fwe243224232</li>   
  </ul>
</div>
<div class='d5'>
  <ul>
    <li>234423424234qwq</li>
    <li>234423424234qwq</li>
    <li>fwe243224232qwq</li>
    <li>123342342423qwq</li>
    <li>234423424234qwq</li>
    <li>fwe243224232qwq</li>   
  </ul>
</div>
<div class='d6'>
  <ul>
    <li>rqwrqw</li>
    <li>234423</li>
    <li>fwe243</li>
    <li>123342</li>
    <li>234423</li>
    <li>fwe243</li>   
  </ul>
</div>

<div id='coin-slider' class='div1'>
	<a href="img01_url" target="_blank">
		<img src='image/ctzhuanji_71307_m.jpg' >
		<span>
			Description for img01
		</span>
	</a>
	<a href="imgN_url">
		<img src='image/hbg1.jpg' >
		<span>
			Description for imgN 
			
		</span>
	</a>

</div>
<div>
<p class='p1'>12312366666666666666666661</p>
<p class='p1'>fwfwef</p>
<p class='p1'>1231231</p>
<p class='p1'>fwfwef</p>
</div>
<div align="center">
 <!-- <embed src="http://player.youku.com/player.php/sid/XNTU0ODE4Nzgw/v.swf" width="640" height="440" /> -->
 <video width="320" height="240" controls="controls">
 <source src="F:\\mv\\Fur Immer.mp4" type="video/ogg">
  <source src="F:\\mv\\Fur Immer.mp4" type="video/mp4">
</video>
</div>
</body>
</html>