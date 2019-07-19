
/**
 * Clase Cliente.
 * 
 * @author ruth covarubias  
 * @version V1 20160703
 * @revision David Montero 
 * @date 20160703
 * Seria bueno validar los datos de cada clase en los metdos mutadores set...
 * Luego hacer la llamada en el metodo constructor con parametros.
 */
public class Cliente
{
    private String nombre;
    private String rut;

    public Cliente (){//constructor por default
        //Esto ayuda cuando usas composición.
        nombre = " ";
        rut    = " ";
    }

    public Cliente(String nombre, String rut){
        //Constructor con parametros
        this.setNombre(nombre);
        this.setRut(rut);
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    public String getRut(){
        return this.rut;
    }

    public void setRut(String rut){
        
        this.rut=rut;
    }

    public void imprimirEstado(){//Pudo haberse llamado : public void imprimirCliente()
        
        //Cada vez que uses los get recuerda que son metodos, por ende terminan con (), ejemplo: "this.getRut()"
        System.out.println("Nombre o Razon Social Cliente : " + this.getNombre());
        System.out.println("RUT ClienteN°                 : " + this.getRut());
    }
}
