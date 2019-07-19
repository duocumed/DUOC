
/**
 * Clase Principal.
 * 
 * @author David Montero
 * @version 1.0
 */
public class CopaAmericA
{
   
    public static void main(String[] args)
    {
        System.out.println(" Creando el objeto partido...");
        Partido partido = new Partido("Sausalito", "Primera",new Fecha(30,"ENERO",2016), new Equipo("ARGENTINA",'A',2,5),new Equipo("CHILE",'A',3,10));
        partido.printPartido();
        System.out.println(" Listo.");
        System.out.println("");
        
        System.out.println("Cambiando la fecha del partido...");
        partido.cambiarFechaPartido();
        
        System.out.println("Listo. Ahora la mostraremos: ");
        System.out.println("");
        
        System.out.println(" Nueva fecha del partido: " + partido.getFechaEncuentro().printFecha());
        System.out.println("Listo. Ahora mostrarenos el mejor país: ");
        System.out.println("");
        
        partido.mostrarMejorPais();
        System.out.println("Listo. Mostrando el partido: ");
        System.out.println("");
        
        partido.listarPartido();
        System.out.println("-========== F I N - T h e E n d ============-");
        
    }
   
}
