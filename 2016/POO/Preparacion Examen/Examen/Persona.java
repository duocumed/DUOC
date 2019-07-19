import Herramientas.*;
/**
 * Clase Persona.
 * 
 * @author David Montero
 * @version 1.0
 */
public class Persona
{
    private String razonSocial;
    private String telefono;
    private String direccion;
    private String rut;
    
    //Constructores
    
    public Persona()
    {
        razonSocial="";
        telefono="";
        direccion="";
        rut="";
    }
    
    public Persona(String razonSocial, String telefono, String direccion, String rut)
    {
        this.razonSocial=razonSocial;
        this.telefono=telefono;
        this.direccion=direccion;
        this.rut=rut;         
    }
    
    //Mutadores
    
    
    public void setRazonSocial(String razonSocial)
    {
        this.razonSocial=razonSocial;        
    }
    
    public void setTelefono(String telefono)
    {
        this.telefono=telefono;        
    }   
    
    public void setDireccion(String direccion)
    {
        this.direccion=direccion;       
    }      
    
    public void setRut(String rut)
    {
        this.rut=rut;       
    } 
    
    //Accesadores    
    
    public String getRazonSocial()
    {
        return this.razonSocial;        
    }
    
    public String getTelefono()
    {
        return this.telefono;        
    }   
    
    public String getDireccion()
    {
        return this.direccion;       
    }      
    
    public String getRut()
    {
        return this.rut;       
    }     
    
    //Printer
    
    public void printPersona(String central)
    {
        Utiles.hacerCabecera(central.toString(),"*", 15, 1);
        System.out.println("");
        System.out.println("Razon Social: " + this.getRazonSocial());
        System.out.println("Telefono    : " + this.getTelefono());
        System.out.println("Direccion   : " + this.getDireccion());
        System.out.println("RUT         : " + this.getRut());
        System.out.println("");        
    } 
    
}
