
import java.lang.Thread.*;
/**
 * Utiles es una clase para alojar las utilidades del sistema.
 * Lectura desde pantalla, limpiar pantalla, crear cabeceras, etc, etc.
 * @author David Montero
 * @version 1.0 
 */
public class Utiles
{
    /**
     * Limpiamos la consola de modo texto de BlueJ
     * Para otros sistemas se pueden usar versiones similares de salida de caracteres:
     * a) Runtime.getRuntime().exec("cls"); //Windows
     * b) System.out.print("\033[H\033[2J");//Linux
     *    System.out.flush();
     * Se podria obtener el tipo de sistema o consola para luego usar una de estas alternativas. 
     * Esa fue nuestra opcion, que luego la modificamos para BlueJ. Gracias San Google por los favores concedidos.
     * @param desdeBlueJ de tipo Logico que permite decirle si el borrado ser realizará desde entorno IDE BlueJ
     */
    public static void clrscr(boolean desdeBlueJ)
    {       
        if(desdeBlueJ==true)
        {
            //Valido solo si se usa en BlueJ
            System.out.print("\u000C");
        } 
        else 
        {
            try
            {
                //Averiguamos el S.O- usado
                String sistemaOperativo=System.getProperty("os.name"); //Recogemos en una variable el tipo de su SO                              
                //System.out.println(sistemaOperativo.toString());

                if(sistemaOperativo.contains("Windows")) //Comprobamos si se trata de Windows
                {
                    Runtime.getRuntime().exec("cls"); //cls es el comando de limpieza en Windows, podéis probarlo abriendo cmd.
                }
                else
                {
                    Runtime.getRuntime().exec("clear"); // Clear es el comando de limpieza en linux.
                }
            }
            catch (Exception e)
            {

            }
        }
    }

    public static void Esperar(int milisegundos)
    {
        try
        {
            Thread.sleep(milisegundos);
        }
        catch (Exception e)
        {

        } 
    }

}
