
/**
 * Clase Partido.
 * 
 * @author David Montero 
 * @version 1.0
 */
public class Partido
{
    private String  estadio;
    private String fase;
    private Fecha fechaEncuentro;
    private Equipo equipo1;
    private Equipo equipo2;
    
    public Partido()
    {
        estadio = "";
        fase = "";
        fechaEncuentro = new Fecha();
        equipo1 = new Equipo();
        equipo2 = new Equipo();        
    }
    
    public Partido(String  estadio,String fase,
                   Fecha fechaEncuentro,
                   Equipo equipo1,Equipo equipo2)
    {
        this.setEstadio(estadio);
        this.setFase(fase);
        this.setFechaEncuentro(fechaEncuentro);
        this.setEquipo1(equipo1);
        this.setEquipo2(equipo2);        
    }
    
    //Mutadores
    
    public void setEstadio(String estadio)
    {
       this.estadio = estadio; 
    }
    
    public void setFase(String fase)
    {
       this.fase = fase; 
    }
    
    public void setFechaEncuentro(Fecha fechaEncuentro)
    {
       this.fechaEncuentro = fechaEncuentro; 
    }
    
    public void setEquipo1(Equipo equipo1)
    {
       this.equipo1 = equipo1; 
    }    
     
    public void setEquipo2(Equipo equipo2)
    {
       this.equipo2 = equipo2; 
    }     
    
    
    //Accesadores
    public String getEstadio()
    {
       return this.estadio; 
    }
    
    public String getFase()
    {
       return this.fase; 
    }
    
    public Fecha getFechaEncuentro()
    {
       return this.fechaEncuentro; 
    }
    
    public Equipo getEquipo1()
    {
       return this.equipo1; 
    }    
     
    public Equipo getEquipo2()
    {
       return this.equipo2; 
    }   
    
    //Print 
    
    public void printPartido()
    {
        System.out.println("");
        System.out.println("=== Partido ===");
        System.out.println("");
        System.out.println("Estadio:" + this.getEstadio());
        System.out.println("Fase:" + this.getFase());
        System.out.println("Fecha de encuentro: " + this.getFechaEncuentro().printFecha());
        System.out.println("Equipo 1:" + this.getEquipo1().getPais());
        System.out.println("Equipo 2:" + this.getEquipo2().getPais());
        System.out.println("");
    }
    
    //Customers
    
    public void listarPartido()
    {
        
        System.out.println("");
        System.out.println("          PARTIDO         ");
        System.out.println("_________________________________________________________________________");
        System.out.println(this.getEstadio() + "  " + this.getFechaEncuentro().printFecha() + " " +  this.getEquipo1().getPais() + " vs " + this.getEquipo2().getPais());
        System.out.println("_________________________________________________________________________");        
        System.out.println("");

    }
    
    public boolean validarEncuentro()
    {
        if(this.getEquipo1().getGrupo() == this.getEquipo2().getGrupo())
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public void  mostrarMejorPais()
    {
       if(this.getEquipo1().getRankingFifa()> this.getEquipo2().getRankingFifa())
       {
           System.out.println(" El país mejor ranqueado es " + this.getEquipo1().getPais());
       }
       else
       {
           System.out.println(" El país mejor ranqueado es " + this.getEquipo2().getPais());
       }       
    }
    
    public void cambiarFechaPartido()
    {
        /*           
         * En este método se debe pasar el día del encuentro 
         * para el día siguiente (el día del encuentro debe 
         * ser un número entre 1 y 30). Considerar el cambio
         * de mes.             
         */
        Fecha fecha = this.getFechaEncuentro();
        int dia = fecha.getDia();
        String mes = fecha.getMes();
        int agno= fecha.getAcno();
        
        if(dia >= 1 || dia <= 30)
        {
            
                  
           if (dia == 30)
           {
               
               switch (mes)
               {
                   case "ENERO": mes = "FEBRERO";
                            break;
                   case "FEBRERO": mes = "MARZO";
                            break;
                   case "MARZO": mes = "ABRIL";
                            break;
                   case "ABRIL": mes = "MAYO";
                            break;
                   case "MAYO": mes = "JUNIO";
                            break;
                   case "JUNIO": mes = "JULIO";
                            break;
                   case "JULIO": mes = "AGOSTO";
                            break;
                   case "AGOSTO": mes = "SEPTIEMBRE";
                            break;
                   case "OCTUBRE": mes = "NOVIEMBRE";
                            break;
                   case "NOVIEMBRE": mes = "DICIEMBRE";
                            break;
                   case "DICEMBRE": mes = "ENERO";
                            break;
               }
               
               fecha.setAcno(agno++);
               fecha.setDia(1);
               fecha.setMes(mes);

               this.setFechaEncuentro(fecha);
           }
           else
           {
               fecha.setAcno(agno);
               fecha.setDia(dia++);
               fecha.setMes(mes);

               this.setFechaEncuentro(fecha);
            
           }
        }
        else
        {
            System.out.println(" El día del encuentro debe ser un número entre 1 y 30");
        }
        
    }
    
    
    
    
    
        
}
