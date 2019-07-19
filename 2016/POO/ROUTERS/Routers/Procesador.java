
/**
 * Se realiza la clase Procesador
 * @author David Montero 
 * @version 1.0 *
 */
public class Procesador 
{

    private String tipo;
    private int velocidad;
    
    public Procesador() 
    {
        this.tipo = "";
        this.velocidad = 0;
    }
    
    
    public Procesador(String tipo, int velocidad) 
    {
        this.setTipo(tipo);
        this.setVelocidad(velocidad);
    }

    public String getTipo() 
    {
        return tipo;
    }

    public void setTipo(String tipo) 
    {
        if(tipo.trim().length()!=0)
        {
           this.tipo = tipo;
        }
        else
        {
            System.out.println("El valor de 'tipo' en clase 'Procesador' no debe estar en vacío");
        }
    }

    public int getVelocidad() 
    {
        return velocidad;
    }

    public void setVelocidad(int velocidad) 
    {
        if(velocidad > 0 )
        {
            this.velocidad = velocidad;
        }
        else
        {
            System.out.println("El valor de 'velocidad'  en clase 'Procesador' no debe ser cero (0)");
        }
    }

    public void printProcesador()
    {
        System.out.println("Procesador: " + this.getTipo() + " a " + this.getVelocidad() + " MHZ.");       
    }
}
