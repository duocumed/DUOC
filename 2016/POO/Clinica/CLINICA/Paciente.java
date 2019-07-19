
/**
 * La clase Paciente.
 * 
 * @author David Montero 
 * @version 1.0
 */
public class Paciente
{
   int rut;
   String nombreCompleto;
   char sexo;
   double peso;
   boolean estaDeAlta;
   
   //Constructores
   public Paciente()
   {
       this.rut = 17987123;
       this.nombreCompleto = "Juan Pérez";
       this.sexo = 'M';
       this.peso = 72.0;
       this.estaDeAlta = true;
   }
   
   public Paciente(
                   int rut, String nombreCompleto, 
                   char sexo, double peso,   
                   boolean estaDeAlta
                  )
   {
       this.rut = rut;
       this.nombreCompleto = nombreCompleto;
       this.sexo = sexo;
       this.peso = peso;
       this.estaDeAlta = estaDeAlta;
   }
   
   //Mutadores
   
   public void setRut(int rut)
   {
       this.rut=rut;
   }
 
   public void setNombreCompleto(String nombreCompleto)
   {
       this.nombreCompleto = nombreCompleto;
   }
         
   public void setSexo(char sexo)
   {
       this.sexo = sexo;
   }
         
   public void setPeso(double peso)
   {
       this.peso = peso;
   }
         
   public void setEstaDeAlta(boolean estaDeAlta)
   {
       this.estaDeAlta = estaDeAlta;
   }
   
   //Accesadores
   
   public int getRut()
   {
       return this.rut;
   }
 
   public String getNombreCompleto()
   {
       return this.nombreCompleto;
   }
         
   public char getSexo()
   {
       return this.sexo;
   }
         
   public double getPeso()
   {
       return this.peso;
   }
         
   public boolean getEstaDeAlta()
   {
       return this.estaDeAlta;
   }
   
   //Impresores
   
   public void ImprimirPaciente()
   {
       System.out.println("");
       System.out.println("******************************************");
       System.out.println("**               PACIENTE               **");
       System.out.println("******************************************");
       System.out.println("  ");
       System.out.println("  Rut         : " + this.getRut());
       System.out.println("  Nombre      : " + this.getNombreCompleto());
       System.out.println("  Sexo        : " + this.getSexo());
       System.out.println("  Peso        : " + this.getPeso());
       System.out.println("  Está de Alta: " + this.getEstaDeAlta());
       System.out.println("");
   }
   
   //Customers
   
   public boolean validarDigito(char dv)
   {       
       String nuevoRut="" + this.getRut();
       
       if(nuevoRut.length()>= 8 )
       {
           // comprobar si está entre 0-9 y K (y la letra k)
           if (dv=='0' || dv == '1' || dv == '2' || dv == '3' || dv == '4' || dv == '5' || dv == '6' || dv == '7' || dv == '8' || dv == '9' || dv == 'K' || dv == 'k')
           {
               return true;
           }
           else
           {
               return false;
           }
       }
       else
       {
           return false;
       }
   }
   
   
   
   
   
   
   //*****************************************************
   //** Va a ser integrada en el metodo maín de Clinica **
   //*****************************************************
   
   
}
