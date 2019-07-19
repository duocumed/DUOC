
/**
 * Write a description of class tren here.
 * 
 * Esteban Venegas
 * 15/04/2016
 */
public class Tren
{
    //atributos

    private int codigoTren, cantidadPasajeros, valorCarros, cantidadKm, cantidadCarro;
    private boolean importancia; //true si es importante,false no lo es
    private char tipoDeTren; //'C' si es carga, 'P'si es de pasajero

    //metodos
    //SIN PARAMETROS
    public Tren (){
        codigoTren=0;
        cantidadPasajeros=0;
        valorCarros=0;
        cantidadKm=20000;
        cantidadCarro=0;
        importancia=false;
        tipoDeTren='C';
    }

    //CON PARAMETROS
    public Tren (int codigoTren, int cantidadPasajeros, int valorCarros, int cantidadKm, int cantidadCarro,boolean importancia, char tipoDeTren){
        this.codigoTren=codigoTren;
        this.cantidadPasajeros=cantidadPasajeros;
        this.valorCarros=valorCarros;
        this.cantidadKm=cantidadKm;
        this.cantidadCarro=cantidadCarro;
        this.importancia=importancia;
        this.tipoDeTren=tipoDeTren;

    }
    //accesadores
    public int getCodigoTren(){
        return codigoTren;
    }

    public int getcantidadCarro(){
        return cantidadCarro;
    }

    public int getCantidadPasajeros (){
        return cantidadPasajeros;
    }

    public int getvalorCarro (){
        return valorCarros;
    }

    public int getCantidadKm (){
        return cantidadKm;
    }

    public boolean getImportancia(){
        return importancia;
    }

    public char getTipoDeTren (){
        return tipoDeTren;
    }
    //mutadores
    public void setCodigoTren(int codigoTren){
        this.codigoTren=codigoTren;
    }

    public void setCantidadPasajero (int cantidadPasajeros){
        this.cantidadPasajeros=cantidadPasajeros;
    }

    public void setValorCarros (int valorCarros){
        this.valorCarros=valorCarros;
    }

    public void setCantidadCarros(int cantidadCarros){
        this.valorCarros=valorCarros;
    }

    public void setCantidadKm (int cantidadKm){
        this.cantidadKm=cantidadKm;
    }

    public void setImportancia(boolean importancia){
        this.importancia=importancia;
    }

    public void setTipoDeTren (char tipoDeTren){
        this.tipoDeTren=tipoDeTren;
    }

    //IMPRESION
    public void printlTren (){
        System.out.println ("-----------------------------------------------");
        System.out.println ( " N " + codigoTren +  "" + cantidadPasajeros + " pasajeros " + cantidadKm + " kilometros recorrido ");
    }

    //CUSTOMERS
    public void rebajarValorDeCarros (int rebajavalorCarros){
        valorCarros=valorCarros*cantidadCarro / rebajavalorCarros;
    }

    public void cambioDeNeumaticos (int cambioDeNeumaticos){
        cambioDeNeumaticos=35000-cantidadKm;
    }

    public void valorTotal (int valorTotal){
        valorTotal=valorCarros+cantidadCarro;
    }

}

