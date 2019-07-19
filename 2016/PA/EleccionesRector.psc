Proceso EleccionesRector
	
	definir res, vota, cargo como caracter;
	definir edad, cVotantes, voto1, voto2, voto3 como entero;
	definir sEdad, pEdad Como Real;
	
	
	
	voto1=0;
	voto2=0;
	voto3=0;
	
	cVotantes=0;
	edad=0;
	sEdad=0;
	pEdad=0;
	
	res="";
	cargo="";
	
	
	Repetir
		
		Limpiar Pantalla;
		
		Escribir "-=== Votacion Elecciones de Rector ===-";
		
		Repetir
			
			Escribir "Ingrese su edad:";
			leer edad;
			si edad <= 0 entonces
				Escribir "Edad debera ser mayor que cero";
			FinSi
		Hasta Que edad >0;
		
		
		
		repetir
			
			Escribir "¿Es usted 1) Docente o 2) Administrativo?: " sin saltar;
			leer cargo;		
			
			si !(cargo == "1" || cargo == "2")  entonces
				Escribir " El cargo debe ser Docente o Administrativo.";
				Esperar 1 segundos;
			sino 
				
				//Para sacar el promedio de edad de "Docentes" del problema 2
				
				si cargo == "1" Entonces
					
					sEdad = sEdad + edad;
					
				FinSi 
				
			FinSi
			
		Hasta Que cargo == "1" || cargo == "2";
		
		Repetir
			
			Escribir "";
			Escribir "1. Luis Ibáñes.";
			Escribir "2. Jaime Salinas.";
			Escribir "3. Roberto Garrido. ";
			Escribir "Indique por quien votara usted:";
			leer vota;
			
			si vota == "1" entonces
				
				voto1 = voto1 + 1;
				
			sino 
				
				si vota=="2" Entonces
					
					voto2 = voto2 + 1;
					
				sino 
					
					si  vota=="3" Entonces
						
						voto3 = voto3 + 1;
						
					Sino
						
						Escribir "No se encuentra en la lista quien quiere usted votar.";
						Esperar 1 segundo;
						
					FinSi
					
				FinSi
				
			FinSi
			
		Hasta Que vota=="1" || vota=="2"  || vota=="3";
		
		cVotantes = cVotantes +1;
		
		Escribir "Desea Realizar otra votacion? (S = si; N = no): " Sin Saltar; 
		leer res;
		Escribir "";
		
	Hasta Que mayusculas(res) == "N";
	
	si voto1 > voto2 Entonces
		
		si voto1 > voto3 Entonces
			
			Escribir " Ha ganado don Luis Ibáñes.";
			
		FinSi
		
	Sino
		
		si voto2 > voto1 Entonces
			
			si voto2 > voto3 Entonces
				
				Escribir " Ha ganado don Jaime Salinas.";
				
			FinSi
			
		Sino 
			
			Escribir " Ha ganado don Roberto Garrido.";
			
		FinSi
		
	FinSi
	
	pEdad= sEdad / cVotantes;
	
	Escribir "Promedio de edad de los Docentes: ",pEdad;
	
FinProceso
