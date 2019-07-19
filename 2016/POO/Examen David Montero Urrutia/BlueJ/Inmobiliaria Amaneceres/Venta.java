
/**
 * Implementacion de la clase Venta.
 * 
 * @author David Montero
 * @version ver. 1.0
 */
public class Venta
{
    //Atributos
    private String rutComprador;
    private String nombreComprador;//Casa + Terreno
    private String codigoVenta;
    private double montoPie;//true or false
    private Casa casa;

    //Constructores
    public Venta()
    {
        rutComprador = "";
        nombreComprador = "";
        codigoVenta =  "";
        montoPie = 0.0;
        casa = new Casa();
    }

    public Venta(String rutComprador,String nombreComprador,String codigoVenta,
    double montoPie,Casa casa)
    {
        this.setRutComprador(rutComprador);
        this.setNombreComprador(nombreComprador);
        this.codigoVenta = codigoVenta;
        this.montoPie = montoPie;
        this.casa = casa;
    }

    // Mutadores

    public void setRutComprador(String rutComprador)
    {
        if(rutComprador.length()==10)
        {
           this.rutComprador = rutComprador; 
        }
        else
        {
           System.out.println("El run del comprador debe tenr 10 caracteres."); 
           
        }
        
    }

    public void setNombreComprador(String nombreComprador)
    {
        if (nombreComprador.length()>=3)
        {
            this.nombreComprador  = nombreComprador;
        }
        else
        {
            System.out.println("El nombre del comporador debe tener al menos 3 caracteres.");
        }
    }

    public void setCodigoVenta(String codigoVenta)
    {
        this.codigoVenta = codigoVenta;
    }

    public void setMontoPie(double montoPie)
    {
        this.montoPie = montoPie;
    }

    public void setCasa(Casa casa)
    {
        this.casa = casa;
    }

    //Accesadores

      public String getRutComprador()
    {
        return this.rutComprador;         
    }

    public String getNombreComprador()
    {
        return this.nombreComprador;  
    }

    public String getCodigoVenta()
    {
        return this.codigoVenta;
    }

    public double getMontoPie()
    {
        return this.montoPie;
    }

    public Casa getCasa()
    {
        return this.casa;
    }

    //Impresores
    public void printCasa()
    {
        System.out.println("");
        System.out.println("°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°");
        System.out.println("°                   V E N T A                     °");
        System.out.println("°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°");
        System.out.println("");
        System.out.println("Rut del Comprador  : " + this.getRutComprador());
        System.out.println("Nombre del Comrador: " + this.getNombreComprador());
        System.out.println("Código de venta    : " + this.getCodigoVenta());
        System.out.println("Monto del Pie      : " + this.getMontoPie());
        this.getCasa().printCasa();
        System.out.println("");
    }  
    
    //Customers
    
    public double DescuentoUF()
    {
        if (this.getCasa().getEsPareada()==true && this.getCasa().getConstruidos()<80 )
        {
            return 5.05;// cinco punto cero cinco UFs
        }
        else
        {
            return 0; //nada  
        }        
    }
    
    public String asignarCodigoVenta()
    {
        
        
        return "";
    }
    
    public double precioCasa(double precioEnUF, double descuentoUF, double ValorUF)
    {
        return((precioEnUF - descuentoUF) * ValorUF);
    }
    
    public void realizarCodigoYMontoCasa()
    {
        
    }
    
    public void visualizarCasa()
    {
        
    }
    
}
