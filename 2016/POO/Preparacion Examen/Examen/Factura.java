import Herramientas.*;
/**
 * Factura
 * Por hacer
 * @author David Montero
 * @version ver. 1.0.
 */
public class Factura
{
    private long numeroFactura;//Puede ser string tambien
    private Persona empresa;//Tienenn los mismos datos
    private Fecha fechaInicio;// dia "mes" año
    private String titulo;//Ver imagen en carpeta del por que
    private Persona cliente;   
    //La idea era en un arreglo de tipo Producto de n elementos, por ahora tres:
    private Producto prod1; 
    private Producto prod2;
    private Producto prod3;
    //Algo asi como esto:
    //private Producto[] productos;//Son muchos productos, o uno solo.

    //     public Factura(int numeroProductos, Producto[] productos)
    //     {
    //         productos = new  Producto[numeroProductos];//Dimensiona el arreglo
    //         
    //         for(int i = 0; i < numeroProductos; i++)
    //         {
    //             productos[i] = new Producto();//inicializa los productos, mas adelante se setean los datos.
    //             
    //         }
    //     }  
    
    //Constructores
    
    public Factura()
    {
        this.numeroFactura=0;
        this.empresa=new Persona();
        this.fechaInicio=new Fecha();
        this.titulo="";
        this.cliente=new Persona();
        this.prod1=new Producto();
        this.prod2=new Producto();
        this.prod3=new Producto();        
    }

    public Factura(long numeroFactura,
                   Persona empresa, 
                   Fecha fechaInicio,
                   String titulo,
                   Persona cliente,
                   Producto prod1,
                   Producto prod2,
                   Producto prod3)
    {
        this.setNumeroFactura(numeroFactura);
        this.setEmpresa(empresa);
        this.setFechaInicio(fechaInicio);
        this.setTitulo(titulo);
        this.setCliente(cliente);
        this.prod1=prod1;
        this.prod2=prod2;
        this.prod3=prod3;        
    }
    
    //Mutadores
    
    public void setNumeroFactura(long numeroFactura)
    {
        this.numeroFactura=numeroFactura;        
    }
    
    public void setEmpresa(Persona empresa)
    {
        this.empresa=empresa;
    }
    
    public void setFechaInicio(Fecha fechaInicio)
    {
       this.fechaInicio=fechaInicio; 
    }
    
    public void setTitulo(String titulo)
    {
        this.titulo=titulo;
    }
    
    public void setCliente(Persona cliente)
    {
        this.cliente=cliente;
    }
    
    public void setProducto(Producto producto, int cualProducto)
    {
        if(cualProducto > 0)
        {
            
        }
        else
        {
           System.out.println(""); 
        }
    }
}
