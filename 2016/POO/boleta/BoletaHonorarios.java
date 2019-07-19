/**
 * Write a description of class BoletaHonorarios here.
 * 
 * @author ruth covarrubias  
 * @version v1 20160703
 * @revision David Montero 
 * @date 20160703
 * Seria bueno validar los datos de cada clase en los metdos mutadores set...
 * Luego hacer la llamada en el metodo constructor con parametros.
 */
public class BoletaHonorarios
{
    private int nroBoleta;
    //Acá es tu dolor de cabeza
    //private Contribuyente contribuyente;
    private Cliente contribuyente;//un contribuyente tambien puede ser un cliente¿O no?
    private Cliente cliente;
    private String servicio;
    // te sugiero cambiar el tipo de datos a doble(double) o flotante(float) para estos ultimos datos:
    private int monto;
    private int retencion;
    private int totalAPagar;
    
    //Constructores
    public BoletaHonorarios(){
        this.nroBoleta=0;
        this.contribuyente=new Cliente();//el valor es null ahora, es decir su referencia esta en direccion nula.
        this.cliente=new Cliente();//el valor es null ahora, es decir su referencia esta en direccion nula.
        this.monto=0;
        this.retencion=0;
        this.totalAPagar=0;
        
    }
    
    public BoletaHonorarios(String servicio, int monto, Cliente contribuyente, Cliente cliente){
        this.contribuyente=contribuyente;
        this.cliente=cliente;
        this.servicio=servicio;
        this.monto=monto;
        //Sugiero que lo realices en un metodo customer a parte esto ultimo y que pases el parametro en este constructor
        this.retencion=monto * 10 /100;//10%
        this.totalAPagar=monto-retencion;//10% del monto
    }
    
    //Accesadores y mutadores
    public Cliente getContribuyente(){
        return contribuyente;
    }
    public void setContribuyente (Cliente contribuyente){
        this.contribuyente=contribuyente;
    }
    public Cliente getCliente(){
        return cliente;
    }
    public void setCliente(Cliente cliente){
        this.cliente=cliente;
    }
    public String getServicio(){
        return servicio;
    }
    public void setServicio(String servicio){
        this.servicio=servicio;
    }
    public int getMonto(){
        return monto;
    }
    public void setMonto(int monto){
        if (monto>0){
            this.monto=monto;
        }else{
            System.out.println("EL MONTO DEBE SER MAYOR A CERO");
        }
    }
    public int getRetencion(){
        retencion=monto*10/100;
        return retencion;
    }
    public void setRetencion(){
        this.retencion=retencion;
    }
    public int getTotalAPagar(){
        totalAPagar=monto-retencion;
        return totalAPagar;
    }
    public void setTotalAPagar(int totalAPagar){
        this.totalAPagar=totalAPagar;
    }
    public void imprimirBoleta(){
        
         nroBoleta=0;
         nroBoleta=nroBoleta++;
        
        //System.out.println("Boleta de Honorarios N° "+nroBoleta);
        //System.out.println("Nombre Contribuyente : "+ Contribuyente.getNombre());
        //System.out.println("RUT Contribuyente    : N° "+Contribuyente.getRut());
        //System.out.println("Nombre Cliente       : "+ Cliente.getNombre());
        //System.out.println("RUT Cliente          : N° "+Cliente.getRut());
        contribuyente.imprimirEstado();
        cliente.imprimirEstado();
        System.out.println("Detalle Servicio Prestado : " + servicio);
        System.out.println("Monto         : $ "+ monto);
        System.out.println("Retencion     : $ "+ retencion);
        System.out.println("Total a Pagar : $ "+totalAPagar);
        
        
    
    
    }
    }
