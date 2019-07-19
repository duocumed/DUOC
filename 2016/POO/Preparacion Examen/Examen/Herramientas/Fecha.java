package Herramientas;
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
            System.out.println("El día del encuentro debe ser un número entre 1 y 30");
        }
    }

    public void setMes(String mes)
    {
        mes = mes.trim().toUpperCase();
        if(mes.compareTo("")!=0 && mes.length() == 0 || mes == null)
        {
            System.out.println("Debe ingresar un valor no nulo a Mes.");     
            //this.mes = "[__¿ Mes ?__]";
        }
        else
        {
            this.mes = mes;
        }
        
    }
 
    public void setAcno(int acno)
    {
        if(acno >=0)
        {
            this.acno=acno;
        }
        else
        {
            System.out.println("Debe ingresar un valor mayor que cero para el año.");             
        }
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
