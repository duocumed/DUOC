/**
 * Write a description of class Contribuyente here.
 * 
 * @author Ruth Covarrubias 
 * @version V1 20160703
 * @revision David Montero 
 * @date 20160703
 * Seria bueno validar los datos de cada clase en los metdos mutadores set...
 * Luego hacer la llamada en el metodo constructor con parametros.
 * Pero me di cuenta que esta clase esta repetida en cuanto a su estructura por
 * lo tanto en boleta honorarios solo tienes que llamar a cliente 2 veces.
 */
public class Contribuyente
{
    private String nombre;
    private String rut;
    
    public Contribuyente(){

    }
    public Contribuyente(String nombre, String rut){
        this.nombre= nombre;
        this.rut=rut;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
        public String getRut(){
        return rut;
    }
    public void setRut(String rut){
        this.rut=rut;
    }
        public void imprimirEstado(){
        System.out.println("Nombre o Razon Social Contribuyente: "+ nombre);
        System.out.println("RUT Contribuyente                  : N° "+ rut);
    }
   }


