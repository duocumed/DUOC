
/**
 * Clase Dispositivo .
 * 
 * @author David Montero 
 * @version 1.0
 */

public class Dispositivo 
{
    private String codigoDispositivo;
    private String fabricante;
    private Procesador procesador = new Procesador();
    private MemoriaRAM memoriaRAM = new MemoriaRAM();
    private MemoriaFlash memoriaFlash = new MemoriaFlash();
    public Dispositivo() 
    {
        this.codigoDispositivo = "";
        this.fabricante = "";        
    }
    
    public Dispositivo(String codigoDispositivo, String fabricante, 
                       String tipoProcesador, int velocidadReloj,
                       String tipoMemoriaFlash, int cantidadMemoriaFlash, 
                       String tipoMemoriaRAM, int cantidadMemoriaRAM, boolean ampliableRAM ) 
    {
        this.codigoDispositivo = codigoDispositivo;
        this.fabricante = fabricante;
        procesador.setTipo(tipoProcesador);
        MemoriaRAM memoriaRAM = new MemoriaRAM(tipoMemoriaRAM, cantidadMemoriaRAM, ampliableRAM);
        MemoriaFlash Flash = new MemoriaFlash(tipoMemoriaFlash, cantidadMemoriaFlash);
    }

    public String getCodigoDispositivo() 
    {
        return codigoDispositivo;
    }

    public String getFabricante() 
    {
        return fabricante;
    }

    public void setCodigoDispositivo(String codigoDispositivo) 
    {
        if(codigoDispositivo.trim().length()!=0)
        {
            this.codigoDispositivo = codigoDispositivo;
        }
        else
        {
            System.out.println(" El valor de 'codigoDispositivo' en clase 'Dispositivo' no debe estar vacío.");
        }
    }

    public void setFabricante(String fabricante)
    {
        if(fabricante.trim().length()!=0)
        {
            this.fabricante = fabricante;
        }
        else
        {
            System.out.println(" El valor de 'fabricante' en clase 'Dispositivo' no debe estar vacío.");
        }
        this.fabricante = fabricante;
    }
    
    public void printDispositivo()
    {
        
       System.out.println("");
       System.out.println("***********************************");
       System.out.println("*      D I S P O S I T I V O      *");
       System.out.println("***********************************");
       System.out.println("Codigo     : " + this.getCodigoDispositivo());
       System.out.println("Fabricante : " + this.getFabricante());
       procesador.printProcesador();
       memoriaRAM.printMemoriaRAM();
       memoriaFlash.printMemoriaFlash();
       System.out.println("");

    }
      
    public boolean cumpleMinimo(DistroVersion distroVersion)
    {
       return ((distroVersion.getMemoriaRAMMinima() <= memoriaRAM.getCantidad()) && ( distroVersion.getMemoriaFlashMinima() <= memoriaFlash.getCantidad())  && (distroVersion.getVelocidadRelojMinima()<=procesador.getVelocidad()));
    }
    
    public void imprimirReporte(DistroVersion distroVersion)
    {
        distroVersion.printDistroVersion();
        if(cumpleMinimo(distroVersion)==false)
        {
            
            System.out.println("Esta distro versión NO cumple con las especificaciones minimas del Dispositivo. ");
            
        }
        else
        {
            distroVersion.printDistroVersion();            
            System.out.println("Esta distro versión CUMPLE TODAS las especificaciones minimas del Dispositivo: ");            
            this.printDispositivo();
            
        }
    }
}