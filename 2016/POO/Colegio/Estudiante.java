
/**
 * Este es el ejercicio 1
 * 
 * @author Profe Hernan 
 * @version 25-04-2016
 */
public class Estudiante
{
    
    private String rut;
    private String nombres;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String fechaDeNacimiento;
    private int peso;
    private double estatura;
    private char sexo; // F : femenino ; M: masculino
    private String direccion;
    
    public Estudiante(String rut,String nombres,String apellidoPaterno,String apellidoMaterno,String fechaDeNacimiento,int peso,double estatura,char sexo, String direccion)
    {
        this.rut = rut;
        this.nombres = nombres;
        this.apellidoPaterno= apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.peso = peso;
        this.estatura = estatura;
        this.sexo = sexo;
        this.direccion = direccion;
        
    }
    
    public void imprimirDatos()
    {
        //String datos; // de estas dos formas se puede!! 
        //String datos = this.nombres + " "+ this.apellidoPaterno + " "+ apellidoMaterno + " pesa: "+peso+ " y mide:" + estatura;
        //System.out.println(datos);
        System.out.println(this.nombres + " "+ this.apellidoPaterno + " "+ apellidoMaterno + " pesa: "+peso+ " y mide:" + estatura);
        
    }
    
    public void aumentarPeso(int incremento)
    {
        peso = peso + incremento;
        
    }
    
    public void disminuirEstatura(double decremento)
    {
        estatura = estatura - decremento;
    }
    
    public int obtenerGramos()
    {
        int gramos;
        gramos = peso * 1000;
        return gramos;
    }
    
    public String obtenerSexo()
    {
        if(sexo == 'F')
        {
           return "Femenino"; 
           
        }else if (sexo == 'M')
        {
            return "Masculino";
        }else
        {
            return "Sexo debe ser F o M";
        }
    }
    
    public int getPeso()
    {
        return peso;
    }
    
    public double getEstatura()
    {
        return estatura;
    }
}
