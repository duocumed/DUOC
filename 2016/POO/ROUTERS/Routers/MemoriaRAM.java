
/**
 * Write a description of class MemoriaRAM here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class MemoriaRAM 
{
	private String tipo;
	private int cantidad;
	private boolean ampliable;
	
	public MemoriaRAM() 
	{
		this.tipo = "";
		this.cantidad = 0;
		this.ampliable = false;
	}	

	public MemoriaRAM(String tipo, int cantidad, boolean ampliable) 
	{
		this.setTipo(tipo);
		this.setCantidad(cantidad);
		this.setAmpliable(ampliable);
	}

	public String getTipo() 
	{
		return tipo;
	}

	public int getCantidad()
	{
		return cantidad;
	}

	public boolean isAmpliable()
	{
		return ampliable;
	}

	public void setTipo(String tipo)
	{
	    if(tipo.trim().length()==0 )
	    {
	         System.out.println("El valor de 'tipo' en clase 'MemoriaRAM' no debe estar en vacío");
	    }
	    else
	    {
	        this.tipo = tipo;
	    }
	}

	public void setCantidad(int cantidad) 
	{
	    if(cantidad > 0)
	    {
	        this.cantidad = cantidad;
	    }
	    else
	    {
	         System.out.println("El valor de 'cantidad' en clase 'MemoriaRAM' debe ser mayor que cero");
	    }	        
	}

	public void setAmpliable(boolean ampliable) 
	{
		this.ampliable = ampliable;
	}
		
    public void printMemoriaRAM()
    {
        String ampliable = "";
        
        if(this.isAmpliable() == true)
        {
            ampliable = " Ampliable";
        }
        else
        {
            ampliable = " No ampliable";
        }
        
        System.out.println("Memoria RAM: " + this.getCantidad() + "MB tipo" + this.getTipo() + " " + ampliable);       
    }	
	
	
}