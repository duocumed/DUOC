<!DOCTYPE html>
<meta http-equiv=”Content-Type” content=”text/html; charset=UTF-8″ />
<html>
	<head>
		<title>Mostrar en pantalla una tabla de 10 por 10 con los números del 1 al 100</title>
		<style>
			body{
   				-webkit-animation: colorchange 60s infinite; 
    			animation: colorchange 60s infinite;
			}
			@-webkit-keyframes colorchange {
				0%   {background: #33FFF3;}
				25%  {background: #78281F;}
				50%  {background: #117A65;}
				75%  {background: #DC7633;}
				100% {background: #9B59B6;}
			}
			@keyframes colorchange {
				0%  {background: #33FFF3;}
				25%  {background: #78281F;}
				50%  {background: #117A65;}
				75%  {background: #DC7633;}
				100% {background: #9B59B6;}
			}   
			div{
				background-image:linear-gradient(to right, red, #f06d06, rgb(255, 255, 0), green);
				text-align:center; 
				background-color: #B9f074;
				/*-webkit-animation: colorchange 60s infinite; 
    			animation: colorchange 60s infinite;*/
			}
			h3{
				background-color: #C9DCB9;

			}	
		</style>

	</head>
	<body>
		<div>	
		<?php			 
				function listChr(){ 
				  echo "<h3>Listado de Tabla Ascii</h3>";
				  echo "<h4>(Desde el numero 32, son caracteres imprimibles, el resto no)</h3>";
				  //<table border="1" style="margin: 0 auto;">
				  echo "<table  border=0 style ='margin: 0 auto;' bordercolor='yellow' valign='middle' >";
				  echo "<td style='background-color: green;'><strong>Numero ASCII</strong></td>";
				  echo "<td style='background-color: green;'><strong>Caracter</strong></td>";
				  for ($i = 32; $i < 256; ++$i) { 
					  static $genNum; 
					  $genNum++; 
					  static $alpha;
					  $alpha=chr($i);
					  echo "</tr>";
					  if($genNum%2==0){
							echo "<td style ='background-color:blue;'>$i</td>";
							echo "<td style ='background-color:blue;'>$alpha</td>";
					  }else{
							echo "<td style ='background-color:orange;' >$i</td>";
							echo "<td style ='background-color:orange;' >$alpha</td>";
					  }
					  echo "</tr>";
				  } 
				  echo "</table>";
				} 
				listChr(); 
			?> 
		</div>	
	</body>
</html>