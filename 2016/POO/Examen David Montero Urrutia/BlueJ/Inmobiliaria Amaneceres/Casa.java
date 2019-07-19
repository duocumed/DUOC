
/**
 * Implementacion de la clase Casa.
 * 
 * @author David Montero
 * @version Vers. 1.0
 */
public class Casa
{
    //Atributos
    private String direccion;
    private double total;//Casa + Terreno
    private double construidos;
    private boolean esPareada;//true or false
    private double precio;

    //Constructores
    public Casa()
    {
        direccion = "";
        total = 0.0;
        construidos = 0.0;
        esPareada = false;
        precio = 0.0;
    }

    public Casa(String direccion,double total,double construidos,
    boolean esPareada,double precio)
    {
        this.direccion = direccion;
        this.total  = total;
        this.construidos = construidos;
        this.esPareada = esPareada;
        this.precio = precio;
    }

    // Mutadores

    public void setDireccion(String direccion)
    {
        this.direccion = direccion;
    }

    public void setTotal(double total)
    {
        this.total  = total;
    }

    public void setConstruidos(double construidos)
    {
        this.construidos = construidos;
    }

    public void setEsPareada(boolean esPareada)
    {
        this.esPareada = esPareada;
    }

    public void setPrecio(double precio)
    {
        this.precio = precio;
    }

    //Accesadores

    public String getDireccion()
    {
        return  this.direccion;
    }

    public double getTotal()
    {
        return this.total;
    }

    public double getConstruidos()
    {
        return this.construidos;
    }

    public boolean getEsPareada()
    {
        return this.esPareada;
    }

    public double getPrecio()
    {
        return this.precio;
    }    

    //Impresores
    public void printCasa()
    {
        System.out.println("");
        System.out.println("°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°");
        System.out.println("°                     C A S A                     °");
        System.out.println("°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°");
        System.out.println("");
        System.out.println("Direccion             : "  + this.getDireccion());
        System.out.println("Total Metros Cuadrados: "  + this.getTotal());
        System.out.println("Metros Construidos    : "  + this.getConstruidos());
        if(this.getEsPareada()==true)
        {        
            System.out.println("Es Pareada            : Si" );
        }
        else
        {
            System.out.println("Es Pareada            : No" );
        }
        System.out.println("                 Precio: $ "  +  this.getPrecio());
        System.out.println("");
    }    
}
