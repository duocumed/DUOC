
/**
 * Clase Fecha.
 * 
 * @author David Montero 
 * @version 1.0
 */
public class Fecha
{
    private int dia;
    private String mes;
    private int acno;
    
    public Fecha()
    {
        dia=0;
        mes="";
        acno=0;
    }
    
    public Fecha(int dia,String mes,int acno)
    {
        this.setDia(dia);
        this.setMes(mes);
        this.setAcno(acno);
    }
    
    //Mutadores
    
    public void setDia(int dia)
    {
        if(dia >= 1 || dia <= 30)
        {
            this.dia=dia;
        }
        else
        {
            System.out.println("el día del encuentro debe ser un número entre 1 y 30");
        }
    }

    public void setMes(String mes)
    {
        this.mes = mes;
    }
 
    public void setAcno(int acno)
    {
        this.acno = acno;
    }   
    
    //Accesadores
    
    public int getDia( )
    {
        
        return this.dia;
    }

    public String getMes()
    {
        return this.mes;
    }
 
    public int getAcno()
    {
        return this.acno;
    }   
    
    //Print 
    
    public String printFecha()
    {
        //Un string con la fecha como por ejemplo 10 Julio 2016
        return getDia() + " " + getMes() + " " + getAcno();        
    }
}
