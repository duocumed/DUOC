
/**
 * Clase Principal 
 * Desde aca se ejecuta el programa.
 * 
 * @author David Montero 
 * @version 1.0
 */
import java.util.Scanner; //Importa la clase Scanner para leer datos desde consola

public class Principal
{
  public static void main(String[] args)
  {
     //Opcion uno:  usar teclado
     //Opcion dos:  usar la misma clase   
     //Datos de dispositivo en el constructor::
     /*
      * public Dispositivo(String codigoDispositivo, String fabricante, 
                       String tipoProcesador, int velocidadReloj,
                       String tipoMemoriaFlash, int cantidadMemoriaFlash, 
                       String tipoMemoriaRAM, int cantidadMemoriaRAM, boolean ampliableRAM )          
     */
      //Variables desde clases
      Scanner teclado = new Scanner(System.in);//instancia de Scanner 
      Dispositivo d1;//= new Dispositivo("","","",0,"",0,"",0,false);
      Dispositivo d2;// = new Dispositivo("","","",0,"",0,"",0,false);
      //variables locales para ingreso de datos
      //Para DistroVersion:
      String version, nombre;
      int memoriaRAMMinima, memoriaFlashMinima,  velocidadRelojMinima;
      //Para dispositivo:
      String codigoDispositivo, fabricante,  tipoProcesador;
      int velocidadReloj;
      String tipoMemoriaFlash;
      int cantidadMemoriaFlash;
      String tipoMemoriaRAM;
      int cantidadMemoriaRAM;
      boolean ampliableRAM; 
      String ramAmpliable;
      int conta = 0,i;//Un contador
      //Opcion es ingresar los datos de la distro por teclado
      /*
       * public DistroVersion(String version, String nombre, int memoriaRAMMinima,
            int memoriaFlashMinima, int velocidadRelojMinima)          
       */
       DistroVersion dv = new DistroVersion("14.0.2","Ubuntu",1,5,1500);
      //Ingreso de los datos de los dispositivos
      System.out.println("Ingreso de datos de los dispositivos:");
      while(conta >= 0 && conta <=1 )
      {
          System.out.println(".:::::::::::: Dispositivo # " + (conta + 1) + "::::::::::::::.");
          System.out.print("Codigo del Dispositivo: ");
          codigoDispositivo = teclado.nextLine();
          System.out.println("");
          
          System.out.print("Fabricante: ");
          fabricante = teclado.nextLine();
          System.out.println("");
          
          System.out.println(".::::::::::: Datos del Procesador ::::::::::::.");
          System.out.print("Tipo Procesador: ");
          tipoProcesador = teclado.nextLine();;
          System.out.println("");         
          
          System.out.print("Velocidad de reloj: ");
          velocidadReloj = teclado.nextInt();
          System.out.println("");
          
          System.out.println(".::::::::::: Datos de la Memoria Flash ::::::::::::.");
          System.out.print("Tipo Memoria Flash: ");
          tipoMemoriaFlash = teclado.next();
          System.out.println(""); 
          
          System.out.print("Cantidad Memoria Flash: ");
          cantidadMemoriaFlash = teclado.nextInt();
          System.out.println("");        
          
          
          System.out.println(".::::::::::: Datos de la Memoria Ram ::::::::::::.");
          System.out.print("Tipo Memoria RAM: ");
          tipoMemoriaRAM = teclado.next();
          System.out.println(""); 
          
          
          System.out.print("Cantidad Memoria RAM:");
          cantidadMemoriaRAM = teclado.nextInt();
          System.out.println("");  
          
          System.out.print("Es ampliable la Memoria RAM(S: si; N: no): ");
          ramAmpliable = teclado.next();
          System.out.println("");   
          
          if(ramAmpliable.trim().toUpperCase().compareTo("S")==0)
          {
              ampliableRAM=true;
          }
          else
          {
              ampliableRAM=false;
          }
              
          
          if(conta == 0)
          {
              d1 = new Dispositivo(codigoDispositivo,fabricante,tipoProcesador,velocidadReloj,tipoMemoriaFlash,cantidadMemoriaFlash,tipoMemoriaRAM,cantidadMemoriaRAM,ampliableRAM);
              d1.printDispositivo();
              d1.imprimirReporte(dv);
          }
          
          if(conta == 1)
          {
              d2 = new Dispositivo(codigoDispositivo,fabricante,tipoProcesador,velocidadReloj,tipoMemoriaFlash,cantidadMemoriaFlash,tipoMemoriaRAM,cantidadMemoriaRAM,ampliableRAM);
              d2.printDispositivo();
              d2.imprimirReporte(dv);
          }
          
          conta++;
      }
      System.out.println(".::::::::::: F I N ::::::::::::.");
   }
}
