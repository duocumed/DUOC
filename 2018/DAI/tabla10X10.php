<!DOCTYPE html>
<meta http-equiv=”Content-Type” content=”text/html; charset=UTF-8″ />
<html>
	<head>
		<title>Mostrar en pantalla una tabla de 10 por 10 con los números del 1 al 100</title>
	</head>
	<body>
		<?php
			$n=1;
			
			echo '<h1>Tabla de 10 por 10 con los n&uacute;meros del 1 al 100</h1>';
			echo "<table border=1 >";
			
			for ($n1=1; $n1<=10; $n1++)
			{
				echo "<tr>";
				for ($n2=1; $n2<=10; $n2++)
				{
				echo "<td>", $n, "</td>";
				$n=$n+1;
				}
				echo "</tr>";
			}
			echo "</table>";
		?>
	</body>
</html>