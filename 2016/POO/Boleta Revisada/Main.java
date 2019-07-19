
/**
 * Write a description of class Main here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Main
{
    public static void main (String[] args){
        //Usa los parametros:
        /**
         * public BoletaHonorarios(
         *                         String servicio, 
         *                         int monto, 
         *                         Cliente contribuyente,
         *                         Cliente cliente
         *                         )
         * public Cliente(
         *                 String nombre, 
         *                 String rut
         *               )
         */
        BoletaHonorarios boleta = new BoletaHonorarios("Contabilidad Mes de Junio 2016", 1234570, new Cliente("Rosa Cobarubias", "12.234.567-8"), new Cliente("Pedro Fuentes","7.345.123-K"));
        boleta.imprimirBoleta();
         
    }
}
