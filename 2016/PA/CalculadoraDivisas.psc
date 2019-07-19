Proceso CalculadoraDivisas
	
	definir divisas, clp, usd, eur, uf, utm Como Real;
	definir i como entero;
	definir fueEducado Como Logico;
	definir res, opMenu,opMenuDolar,opMenuEuro, opMenuPeso, opMenuUF, opMenuUTM Como Caracter;
	
	dimension divisas[4];
	
	fueEducado = Falso;
	res = " ";
	clp = 0;
	usd = 0;
	eur = 0;
	uf = 0;
	utm = 0;
	opMenuUF = "";
	opMenuUTM = "";
	
	Repetir
		
		Limpiar Pantalla;
		opMenu = " ";
		opMenuDolar = " ";
		opMenuEuro = " ";
		opMenuPeso = " ";
		
		Repetir
			
			Limpiar Pantalla;
			//Escribir las opciones
			Escribir "";
			Escribir ".::::::::::: Calculadora De Divisas :::::::::::.";
			Escribir "";
			Escribir "[1] Educar al sistema.";
			Escribir "[2] USD";
			Escribir "[3] EUR";
			Escribir "[4] CLP";
			Escribir "[5] Salir";
			Escribir "";
			Escribir "Escoja su Opcion[1 al 5]: " Sin Saltar;
			leer opMenu;
			
			opMenu = mayusculas(opMenu);
			
			Escribir "";
			
			si opMenu != "1" && opMenu != "2" && opMenu != "3" &&  opMenu != "4" && opMenu != "5" Entonces
				
				Escribir "Opcion No valida. Intente otra vez.";
			Sino
				//Desarrollar las opciones
				
				//Educar el sistema
				si opMenu == "1" Entonces
					
					//inicializacion de las divisas
					para i = 0 hasta 4-1 Hacer
						
						divisas[i] = 0.0;
						
					FinPara
					
					//eduacion del sistema de divisas
					Escribir "Educando al sistema de divisas.";
					
					para i = 0 hasta 4-1 Hacer
						
						Segun i Hacer
							0:
								
								Escribir "1.- Ingrese el valor de un Dolar(USD) en pesos(CLP): " Sin Saltar;
								fueEducado = Verdadero;								
								leer divisas[i];
								Escribir "";
								
							1:
								
								Escribir "2.- Ingrese el valor de un Euro(EUR) en pesos(CLP): " Sin Saltar;
								fueEducado = Verdadero;								
								leer divisas[i];
								Escribir "";
								
							2:
								
								Escribir "3.- Ingrese el valor de una UF en pesos(CLP): " Sin Saltar;
								fueEducado = Verdadero;								
								leer divisas[i];
								Escribir "";
								
							3:
								Escribir "4.- Ingrese el valor de una UTM en pesos(CLP): " Sin Saltar;
								fueEducado = Verdadero;								
								leer divisas[i];
								Escribir "";
								
							De Otro Modo:
								
								Escribir "Hubo un error no intencionado. ";
								fueEducado = Verdadero;
								
						FinSegun
						
					FinPara					
					
				FinSi
				
				//DOLLAR
				si opMenu == "2"  Entonces
					
					si fueEducado == Falso Entonces
						
						Escribir "Primero debe educar al sistema. Gracias.";	
						Esperar 2 Segundos;
						
					Sino
						
						Repetir
							
							Limpiar Pantalla;
							opMenuDolar = " ";
							
							Escribir "";
							Escribir "-======= Divisa Dolar =======-";
							Escribir "";
							Escribir "1) De USD a CPL.";
							Escribir "2) De CPL a USD.";
							Escribir "3) Volver.";
							Escribir "";
							Escribir "¿Cual es su opcion?(1 al 3): " Sin Saltar;
							Leer opMenuDolar;
							opMenuDolar = Mayusculas(opMenuDolar);
							Escribir "";
							
							si opMenuDolar != "1" && opMenuDolar != "2" && opMenuDolar != "3" Entonces
								
								Escribir "Debe ingresar un numero en el intervalo de 1 hasta 3. Intentelo otra vez.";								
								esperar 2 Segundos;
								
							Sino
								
								si opMenuDolar == "1" Entonces
									
									Escribir "-=== De USD a CPL ===-";	
									
									Repetir
										
										Escribir "¿De cuantos dolares dispone?: " Sin Saltar;
										leer usd;
										Escribir "";
										
										si usd <= 0 Entonces
											
											Escribir "Valor no valido para esta divisa. Intente de nuevo.";
											Esperar 1 Segundos;
											
										Sino
											
											clp = divisas[0] * usd;
											
											escribir "USD$ ", usd, " son CLP$ ", clp;
											Esperar 3 Segundos;
											
										FinSi
										
									Hasta Que usd > 0;
									
								FinSi	
								
								si opMenuDolar == "2" Entonces
									
									Escribir "-=== De CLP a USD ===-";	
									
									Repetir
										
										Escribir "¿De cuantos pesos dispone?: " Sin Saltar;
										leer clp;
										Escribir "";
										
										si clp <= 0 Entonces
											
											Escribir "Valor no valido para esta divisa. Intente de nuevo.";
											Esperar 1 Segundos;
											
										Sino
											
											usd = clp / divisas[0];
											
											escribir "CLP$ ", clp, " son  USD$ ", usd;
											Esperar 3 Segundos;
											
										FinSi
										
									Hasta Que clp > 0;
									
								FinSi
								
								si opMenuDolar == "3" Entonces
									
									Escribir "Volviendo al menu...";
									Esperar 2 Segundos;
									
								FinSi
								
							FinSi
							
						Hasta Que opMenuDolar == "1" || opMenuDolar == "2" || opMenuDolar == "3";						
						
					FinSi
					
				FinSi	
				
				//EURO
				si opMenu == "3" Entonces
					
					si fueEducado == Falso Entonces
						
						Escribir "Primero debe educar al sistema. Gracias.";	
						Esperar 2 Segundos;
						
					Sino
						
						Repetir
							
							Limpiar Pantalla;
							opMenuEuro = " ";
							
							Escribir "";
							Escribir "-======= Divisa Euro =======-";
							Escribir "";
							Escribir "1) De EUR a CPL.";
							Escribir "2) De CPL a EUR.";
							Escribir "3) Volver.";
							Escribir "";
							Escribir "¿Cual es su opcion?(1 al 3): " Sin Saltar;
							Leer opMenuEuro;
							opMenuEuro = Mayusculas(opMenuEuro);
							Escribir "";
							
							si opMenuEuro != "1" && opMenuEuro != "2" && opMenuEuro != "3" Entonces
								
								Escribir "Debe ingresar un numero en el intervalo de 1 hasta 3. Intentelo otra vez.";								
								esperar 2 Segundos;
								
							Sino
								
								si opMenuEuro == "1" Entonces
									
									Escribir "-=== De EUR a CPL ===-";	
									
									Repetir
										
										Escribir "¿De cuantos euros dispone?: " Sin Saltar;
										leer eur;
										Escribir "";
										
										si eur <= 0 Entonces
											
											Escribir "Valor no valido para esta divisa. Intente de nuevo.";
											Esperar 1 Segundos;
											
										Sino
											
											clp = divisas[1] * eur;
											
											escribir "EUR$ ", eur, " son CLP$ ", clp;
											Esperar 3 Segundos;
											
										FinSi
										
									Hasta Que eur > 0;
									
								FinSi	
								
								si opMenuEuro == "2" Entonces
									
									Escribir "-=== De CLP a EUR ===-";	
									
									Repetir
										
										Escribir "¿De cuantos pesos dispone?: " Sin Saltar;
										leer clp;
										Escribir "";
										
										si clp <= 0 Entonces
											
											Escribir "Valor no valido para esta divisa. Intente de nuevo.";
											Esperar 1 Segundos;
											
										Sino
											
											eur = clp / divisas[1];
											
											escribir "CLP$ ", clp, " son  EUR$ ", eur;
											Esperar 3 Segundos;
											
										FinSi
										
									Hasta Que clp > 0;
									
								FinSi
								
								si opMenuEuro == "3" Entonces
									
									Escribir "Volviendo al menu...";
									Esperar 2 Segundos;
									
								FinSi
								
							FinSi
							
						Hasta Que opMenuEuro == "1" || opMenuEuro == "2" || opMenuEuro == "3";						
						
					FinSi				
					
				FinSi
				
				//PESO				
				si opMenu == "4" Entonces
					
					si fueEducado == Falso Entonces
						
						Escribir "Primero debe educar al sistema. Gracias.";	
						Esperar 2 Segundos;
						
					Sino
						
						Repetir
							
							Limpiar Pantalla;
							opMenuPeso = " ";
							
							Escribir "";
							Escribir "-======= Divisa Peso =======-";
							Escribir "";
							Escribir "1) Trabajar con UF.";
							Escribir "2) Trabajar con UTM.";
							Escribir "3) Volver.";
							Escribir "";
							Escribir "¿Cual es su opcion?(1 al 3): " Sin Saltar;
							Leer opMenuPeso;
							opMenuPeso = Mayusculas(opMenuPeso);
							Escribir "";
							
							si opMenuPeso != "1" && opMenuPeso != "2" && opMenuPeso != "3" Entonces
								
								Escribir "Debe ingresar un numero en el intervalo de 1 hasta 3. Intentelo otra vez.";								
								esperar 2 Segundos;
								
							Sino
								//desde aca pare hay que hacer un submenu por cada item
								//Nivel de complejidad extrema...pero viable.
								//
								
								si opMenuPeso == "1" Entonces
									
									Repetir
										
										Limpiar Pantalla;
										
										Escribir "-=== UF ===-";
										Escribir "";
										Escribir "1) De UF a CPL.";
										Escribir "2) De CPL a UF.";
										Escribir "3) Volver.";
										Escribir "";
										Escribir "¿Cual es su opcion?(1 al 3): " Sin Saltar;
										leer opMenuUF;
										Escribir "";
										
										si opMenuUF != "1" && opMenuUF != "2" && opMenuUF != "3" Entonces
											
											Escribir "Debe ingresar un numero en el intervalo de 1 hasta 3. Intentelo otra vez.";								
											esperar 2 Segundos;
											
										Sino
											//Hacer las operaciones de acuerdo al menu
											si opMenuUF == "1" Entonces
												
												Escribir "-=== De UF a CPL ===-";	
												
												Repetir
													
													Escribir "¿De cuantas UF dispone?: " Sin Saltar;
													leer uf;
													Escribir "";
													
													si uf <= 0 Entonces
														
														Escribir "Valor no valido para esta divisa. Intente de nuevo.";
														Esperar 1 Segundos;
														
													Sino
														
														clp = divisas[2] * uf;
														
														escribir "UF ", uf, " son CLP$ ", clp;
														Esperar 3 Segundos;
														
													FinSi
													
												Hasta Que uf > 0;
												
												
											FinSi
											
											si opMenuUF == "2" Entonces
												
												Repetir
													
													
													Escribir "-=== De CPL a UF ===-";	
													
													Escribir "¿De cuantos pesos dispone?: " Sin Saltar;
													leer clp;
													Escribir "";
													
													si clp <= 0 Entonces
														
														Escribir "Valor no valido para esta divisa. Intente de nuevo.";
														Esperar 1 Segundos;
														
													Sino
														
														uf = clp / divisas[2];
														
														escribir "CLP$ ", clp, " son  UF ", uf;
														Esperar 3 Segundos;
														
													FinSi
													
												Hasta Que clp > 0;
												
											FinSi
											
											si opMenuUF == "3" Entonces
												
												Escribir "Volviendo al menu...";
												Esperar 2 Segundos;
												
											FinSi
											
										FinSi									
										
									Hasta Que opMenuUF == "1" || opMenuUF == "2" || opMenuUF == "3";								
									
								FinSi	
								
								si opMenuPeso == "2" Entonces
									
									Repetir
										
										Limpiar Pantalla;
										Escribir "-=== UTM ===-";	
										Escribir "";
										Escribir "1) De UTM a CPL.";
										Escribir "2) De CPL a UTM.";
										Escribir "3) Volver.";
										Escribir "";
										Escribir "¿Cual es su opcion?(1 al 3): " Sin Saltar;
										Esperar 2 Segundos;
										leer opMenuUTM;
										Escribir "";
										
										si opMenuUTM != "1" && opMenuUTM != "2" && opMenuUTM != "3" Entonces
											
											Escribir "Debe ingresar un numero en el intervalo de 1 hasta 3. Intentelo otra vez.";								
											esperar 2 Segundos;
											
										Sino
											//Hacer las operaciones de acuerdo al menu
											si opMenuUTM == "1" Entonces
												
												
												
											FinSi
											
											si opMenuUTM == "2" Entonces
												
												
												
											FinSi
											
											si opMenuUTM == "3" Entonces
												
												Escribir "Volviendo al menu...";
												Esperar 2 Segundos;
												
											FinSi
											
										FinSi									
										
									Hasta Que opMenuUTM == "1" || opMenuUTM == "2" || opMenuUTM == "3";	
									
								FinSi
								
								si opMenuPeso == "3" Entonces
									
									Escribir "Volviendo al menu...";
									Esperar 2 Segundos;
									
								FinSi
								
							FinSi
							
						Hasta Que opMenuPeso == "1" || opMenuPeso == "2" || opMenuPeso == "3"
						
					FinSi
					
				FinSi
				
				// Salir del sistema
				si opMenu == "5" Entonces
					
					Escribir "Desea salir del programa(S = si; N = no): " Sin Saltar;
					Leer res;
					Escribir "";
					
				FinSi
				
			FinSi
			
		Hasta Que opMenu == "1" || opMenu == "2" || opMenu == "3" || opMenu == "4" || opMenu == "5";
		
	Hasta Que Mayusculas(res) == "S";	
	
FinProceso