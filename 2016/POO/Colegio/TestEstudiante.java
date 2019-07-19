
/**
 * Write a description of class TestEstudiante here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TestEstudiante
{
    public static void main(String args[])
    {
        Estudiante alu = new Estudiante("111-1","Fran Javi","Perez","Gonzalez","21-10-1985",80,1.74,'M',"Alla arriba");
        
        alu.imprimirDatos();
        alu.aumentarPeso(5);
        System.out.println("Su nuevo peso es: "+alu.getPeso());
        //disminuri en 2 cm
        alu.disminuirEstatura(0.02);
        System.out.println("Su nueva estatura es: "+alu.getEstatura());
        System.out.println("Su nuevo peso en gramos es: " + alu.obtenerGramos());
        System.out.println("Su sexo es: "+alu.obtenerSexo());
        
    }
}
