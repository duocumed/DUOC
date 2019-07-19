/**
 * Clase MemoriaFlash
 * @author David Montero
 * @version 1.0
 */
public class MemoriaFlash 
{
	private String tipo;
	private int cantidad;
	
	public MemoriaFlash() 
	{
		this.tipo = "";
		this.cantidad = 0;
	}
	
	public MemoriaFlash(String tipo, int cantidad) 
	{
		this.setTipo(tipo);
		this.setCantidad(cantidad);
	}

	public String getTipo() 
	{
		return tipo;
	}

	public int getCantidad() 
	{
		return cantidad;
	}

	public void setTipo(String tipo) 
	{
	    if(tipo.trim().length()==0)
	    {
	         System.out.println("El valor de 'tipo' en clase 'Memoria Flash' no debe estar en vacío");
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
	         System.out.println("El valor de 'cantidad' en clase 'Memoria Flash' no debe ser cero.");
	    }
	}
	
    public void printMemoriaFlash()
    {
        System.out.println("Memoria Flash: " + this.getCantidad() + "MB tipo" + this.getTipo() + ". ");       
    }
	
}