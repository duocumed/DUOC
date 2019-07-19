package Herramientas;
import java.util.Scanner;

/**
 * Clase LeerDesdeTeclado.
 * Desarrollo de un lector de datos con Scanner
 * @author David Montero
 * @version verr.  1.0  
 */
public class LeerDesdeTeclado
{
    
    Scanner teclado;
    
    public LeerDesdeTeclado()
    {
        teclado = new Scanner(System.in);
    }
    
    public LeerDesdeTeclado(Scanner teclado)
    {
        this.setTeclado(teclado);
    }
    
    public void setTeclado(Scanner teclado)
    {
        
        this.teclado=teclado;
    }
    
    public Scanner getTeclado()
    {
        return this.teclado;
    }
    
    public String leerCadena()
    {
        try
        {
            return teclado.nextLine();            
        }
        catch (Exception ex)
        {
            return "";
        }        
    }
    
    public int leerEntero()
    {
        try
        {
            return teclado.nextInt();            
        }
        catch (Exception ex)
        {
            return 0;
        }        
    }
    
    public double leerDoble()
    {
        try
        {
            return teclado.nextDouble();            
        }
        catch (Exception ex)
        {
            return 0.0;
        }        
    }  
    
    public boolean leerLogico()
    {
        try
        {
            return teclado.nextBoolean();            
        }
        catch (Exception ex)
        {
            return false;
        }        
    }
    
    public float leerFlotante()
    {
        try
        {
            return teclado.nextFloat();            
        }
        catch (Exception ex)
        {
            return 0;
        }        
    } 

    public long leerLong()
    {
        try
        {
            return teclado.nextLong();            
        }
        catch (Exception ex)
        {
            return 0;
        }        
    }
    
    public String leerSiguiente()
    {
        try
        {
            return teclado.next();            
        }
        catch (Exception ex)
        {
            return "";
        }        
    } 
}
