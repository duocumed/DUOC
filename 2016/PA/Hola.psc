
SubProceso Espera()
	Escribir "                                    ";
	Escribir "Pulse cualquier tecla para seguir...";
	Esperar Tecla;
	Limpiar Pantalla;
FinSubProceso

Proceso SaludoImprimeHolaMundo
	Escribir "Hola Mundo";
	Escribir "Imprimiremos ahora numeros del -100 al 100 de forma paginada"; 
	Escribir "Además diremos si son multiplos de 2, 3, 5, 7, 11 y 13 respectivamente.";
	Espera();
	definir final como entero;//El numero a testear
	definir multi como entero;//Mostrar cantidad de multiplos de variable final
	definir iFila como entero;// Indice para recorrer Filas 
	definir iColu como entero;// Indice para recorrer Filas
	definir Multiplos como entero;
	
	Dimension Multiplos[2000, 3];

	//Inicializar arreglo
	Para iFila <- 0 Hasta 1999 Con Paso 1 Hacer
		Para iColu<-0 Hasta 2 Con Paso 1 Hacer
			Multiplos[iFila,iColu] = 0 ;
		FinPara
	FinPara
	//Inicializar las variables
	final<- -101;
	iFila<-0;
	iColu<-0;
	//Generar la variable final y verificar los multiplos
	//Los cuenta y muestra de que numero es multiplo la variable final
	//muestra la cantidad de multiplos.
	//Pagina la vista en pantalla.
	//desde final hasta 100.
	Repetir
		
		multi <- 0;
		final <- final + 1;
		Multiplos[iFila,iColu]<-final;
		Escribir  "El contador ahora vale: ", final;
		
		si final == 0 Entonces
			Escribir  final, " No tiene múltiplos.";
			multi <- multi + 1;
			Multiplos[iFila,iColu]<-final;
			Multiplos[iFila,iColu+1]<-0;
			Multiplos[iFila,iColu+2]<-multi;
			iFila<-ifila+1;
		FinSi
		
		si final == 1 Entonces
			Escribir  final, " Tiene múltiplos común con Sigo Mismo.";
			multi <- multi + 1;
			Multiplos[iFila,iColu]<-final;
			Multiplos[iFila,iColu+1]<-1;
			Multiplos[iFila,iColu+2]<-multi;
			iFila<-ifila+1;
		FinSi
		
		si final == -1 Entonces
			Escribir  final, " Tiene múltiplos común 1.";
			multi <- multi + 1;
			Multiplos[iFila,iColu]<-final;
			Multiplos[iFila,iColu+1]<--1;
			Multiplos[iFila,iColu+2]<-multi;
			iFila<-ifila+1;
		FinSi
		
		si final mod 2 == 0 entonces
			Escribir  final, " es multiplo de 2.";
			multi <- multi + 1;
			Multiplos[iFila,iColu]<-final;
			Multiplos[iFila,iColu+1]<-2;
			Multiplos[iFila,iColu+2]<-multi;
			iFila<-ifila+1;
		finsi
		
		si final mod 3 == 0 entonces
			Escribir  final, " es multiplo de 3.";
			multi <- multi + 1;
			Multiplos[iFila,iColu]<-final;
			Multiplos[iFila,iColu+1]<-3;
			Multiplos[iFila,iColu+2]<-multi;
			iFila<-ifila+1;
		finsi
		
		si final mod 5 == 0 entonces
			Escribir  final, " es multiplo de 5.";
			multi <- multi + 1;
			Multiplos[iFila,iColu]<-final;
			Multiplos[iFila,iColu+1]<-5;
			Multiplos[iFila,iColu+2]<-multi;
			iFila<-ifila+1;
		FinSi
		
		si final mod 7 == 0 entonces
			Escribir  final, " es multiplo de 7.";
			multi <- multi + 1;
			Multiplos[iFila,iColu]<-final;
			Multiplos[iFila,iColu+1]<-7;
			Multiplos[iFila,iColu+2]<-multi;
			iFila<-ifila+1;
		FinSi
		
		si final mod 11 == 0 entonces
			Escribir  final, " es multiplo de 11.";
			multi <- multi + 1;
			Multiplos[iFila,iColu]<-final;
			Multiplos[iFila,iColu+1]<-11;
			Multiplos[iFila,iColu+2]<-multi;
			iFila<-ifila+1;
		FinSi
		
		si final mod 13 == 0 entonces
			Escribir  final, " es multiplo de 13.";
			multi <- multi + 1;
			Multiplos[iFila,iColu]<-final;
			Multiplos[iFila,iColu+1]<-13;
			Multiplos[iFila,iColu+2]<-multi;
			iFila<-ifila+1;
		FinSi
		
		si final mod 17 == 0 entonces
			Escribir  final, " es multiplo de 17.";
			multi <- multi + 1;
			Multiplos[iFila,iColu]<-final;
			Multiplos[iFila,iColu+1]<-17;
			Multiplos[iFila,iColu+2]<-multi;
			iFila<-ifila+1;
		FinSi
		
		si final mod 19 == 0 entonces
			Escribir  final, " es multiplo de 19.";
			multi <- multi + 1;
			Multiplos[iFila,iColu]<-final;
			Multiplos[iFila,iColu+1]<-17;
			Multiplos[iFila,iColu+2]<-multi;
			iFila<-ifila+1;
		FinSi
		
		//Escribir correctamente la cantidad de multiplos::Singular y plural.}
		//Decidir si uso el -1 como multiplo tambien.
		si final < 0 entonces
			Si multi > 1 entonces
				Escribir  "Y este número tiene ", multi, " Múltiplos Comunes, Además Del -1.";
			Sino
				Escribir  "Y este número tiene ", multi, " Múltiplo en común, Además Del -1.";
			FinSi
		Sino
			Si multi > 1 entonces
				Escribir  "Y este número tiene ", multi, " Múltiplos Comunes.";
			Sino
				Escribir  "Y este número tiene ", multi, " Múltiplo en común.";
			FinSi
		FinSi
		//Paginar la pantalla
		si final Mod 18 == 0 entonces
			Esperar 2 segundos;
		FinSi
	Hasta Que final == 100
	//Imprimir la tabla de valores de forma paginada:
	Para iFila<-0 Hasta 1999 Con Paso 1 Hacer
		si Multiplos[iFila,0]==0 y Multiplos[iFila,1]==0 y Multiplos[iFila,2]==0 Entonces
			iFila<-1999;
		FinSi
		Escribir Multiplos[iFila,0], "    ", Multiplos[iFila,1], "    ", Multiplos[iFila,2];
		si iFila Mod 18 == 0 entonces
			Esperar 2 segundos;
		FinSi
	FinPara
	//Esperar();
FinProceso



	