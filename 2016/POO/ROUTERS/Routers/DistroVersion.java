public class DistroVersion 
{
    private String version;
    private String nombre;
    private int memoriaRAMMinima;
    private int memoriaFlashMinima;
    private int velocidadRelojMinima;
    
    public DistroVersion() 
    {
        this.version = "";
        this.nombre = "";
        this.memoriaRAMMinima = 0;
        this.memoriaFlashMinima = 0;
        this.velocidadRelojMinima = 0;
    }
    
    public DistroVersion(String version, String nombre, int memoriaRAMMinima,
            int memoriaFlashMinima, int velocidadRelojMinima) 
    {
        this.setVersion(version);
        this.setNombre(nombre);
        this.setMemoriaRAMMinima(memoriaRAMMinima);
        this.setMemoriaFlashMinima(memoriaFlashMinima);
        this.setVelocidadRelojMinima(velocidadRelojMinima);
    }

    public String getVersion() 
    {
        return version;
    }

    public String getNombre() 
    {
        return nombre;
    }

    public int getMemoriaRAMMinima() 
    {
        return memoriaRAMMinima;
    }

    public int getMemoriaFlashMinima()
    {
        return memoriaFlashMinima;
    }

    public int getVelocidadRelojMinima() 
    {
        return velocidadRelojMinima;
    }
    //Mutadores
    public void setVersion(String version) 
    {
        if(version.trim().length()==0)
        {
             System.out.println("El valor de 'version' no debe estar en vacío");
        }
        else
        {
            this.version = version;
        }
    }

    public void setNombre(String nombre) 
    {
        if(nombre.trim().length()==0)
        {
             System.out.println("El valor de 'nombre' no debe estar en vacío");
        }
        else
        {
            this.nombre = nombre;
        }
    }

    public void setMemoriaRAMMinima(int memoriaRAMMinima) 
    {
        if(memoriaRAMMinima > 0)
        {
            this.memoriaRAMMinima = memoriaRAMMinima;
        }
        else
        {
            System.out.println("El valor de 'memoriaRAMMinima' debe ser mayor que cero.");
        }
    }

    public void setMemoriaFlashMinima(int memoriaFlashMinima) 
    {
        if(memoriaFlashMinima > 0)
        {
            this.memoriaFlashMinima = memoriaFlashMinima;
        }
        else
        {
            System.out.println("El valor de 'memoriaFlashMinima' debe ser mayor que cero.");
        }
    }

    public void setVelocidadRelojMinima(int velocidadRelojMinima) 
    {
        if(velocidadRelojMinima > 0)
        {
            this.velocidadRelojMinima = velocidadRelojMinima;
        }
        else
        {
            System.out.println("El valor de 'velocidadRelojMinima' debe ser mayor que cero.");
        }
    }
    
    public void printDistroVersion()
    {
        System.out.println("");        
        System.out.println("**************************************");
        System.out.println("*          DISTRO VERSION            *");
        System.out.println("**************************************");
        System.out.println("");
        System.out.println("Versión                   : " + this.getVersion());
        System.out.println("Nombre                    : " + this.getNombre());
        System.out.println("Memoria RAM Minima        : " + this.getMemoriaRAMMinima() + " MB");
        System.out.println("Memoria Flash Minima      : " + this.getMemoriaFlashMinima() + " MB");
        System.out.println("Velocidad De Reloj Minima : " + this.getVelocidadRelojMinima() + " MHZ");
        System.out.println("");
    }   
}
