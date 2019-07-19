Proceso Help
	
	definir plan como caracter;
	definir vPlan, cSuscritos como entero;
	definir vDescuento, tPagar como real;
	
	vPlan=0;
	cSuscritos=0;
	vDescuento=0;
	tPagar=0;
	plan=" ";
	
	escribir "";
	Escribir "Planes Existentes";
	Escribir "=================";
	Escribir "1) Full";
	Escribir "2) Plus";
	escribir "Indique que tipo de plan desea:" Sin Saltar;
	leer plan;
	Escribir "";
	
	si plan == "1" entonces
		
		//Full
		vPlan = 150000;
		
		escribir "Ingrese cantidad de empleados suscritos:" sin saltar;
		leer cSuscritos;
		
		si cSuscritos ==1 entonces
			
			vDescuento=0;
			
		finsi
		si cSuscritos >=2 && cSuscritos <=6 Entonces
				
			vDescuento=0.08;
				
		FinSi
			
		si cSuscritos >=7 && cSuscritos <=15 Entonces
			
			vDescuento=0.10;
			
		FinSi
		
		si cSuscritos >15 Entonces
			
			vDescuento=0.20;
			
		FinSi
		
	FinSi
	
	
	si plan == "2" entonces
		
		//Plus
		vPlan = 230000;
		
		escribir "Ingrese cantidad de empleados suscritos:" sin saltar;
		leer cSuscritos;
		
		si cSuscritos ==1 entonces
			
			vDescuento=0;
			
		finsi
		si cSuscritos >=2 && cSuscritos <=6 Entonces
			
			vDescuento=0.04;
			
		FinSi
		
		si cSuscritos >=7 && cSuscritos <=15 Entonces
			
			vDescuento=0.07;
			
		FinSi
		
		si cSuscritos >15 Entonces
			
			vDescuento=0.11;
			
		FinSi
		
	FinSi
	
	tPagar = vPlan-(vPlan * vDescuento);
	
	Escribir "El valor a pagar por la empresa por el paln es de: $ ", tPagar, " por ", cSuscritos, " suscritos";
	Escribir "";
	
FinProceso
