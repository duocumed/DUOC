Proceso AseoYOrnato
	
	definir sectores,i,j, elAzar, montoInvertido, cantSectores100  como entero;
	definir bandera como logico;
	definir pSectores como real;
	
	dimension sectores[10];
	
	bandera=Falso;
	elAzar=0;
	montoInvertido=0;
	pSectores=0;
	cantSectores100 = 0;
	
	Escribir "Ilustre Municipalidad De Viña Del Mar";
	Escribir "Reporte de plantación por sectores.";
	
	para i = 0 hasta (10-1) hacer
		
		sectores[i]=0;
		
	FinPara
	
	para i = 0 hasta (10-1) hacer		
		
		elAzar = aleatorio(70, 310);
		
		para j = 0 hasta (10-1) hacer
			bandera= falso;
			si sectores[i]==elAzar entonces
				
				bandera= Verdadero;
				i = i - 1;	
				
			FinSi
			
		FinPara
		
		si bandera == falso entonces
			sectores[i]=elAzar;
		FinSi
		
		escribir "Sector ", i+1, ": " ,sectores[i], " Plantas.";
		
	FinPara
	
	para i = 0 hasta (10-1) hacer
		
		montoInvertido= montoInvertido + (sectores[i]*450);
		
		si sectores[i]>100 entonces 
			
			cantSectores100 = cantSectores100 + 1;
			
		FinSi
		
	FinPara
	
	pSectores = (cantSectores100/10)*100;
	
	escribir "";
	Escribir "El monto total invertido en toda la ciudad por concepto de plantas es $ ",montoInvertido;
	Escribir "El porcentaje de sectortes en los que se plantaron mas de 100 plantas fue de un ",pSectores , "%";
	escribir "";
	esperar 1 segundo;
	
FinProceso
