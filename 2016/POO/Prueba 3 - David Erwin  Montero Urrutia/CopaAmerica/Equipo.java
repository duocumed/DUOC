
/**
 * Clase Equipo.
 * 
 * @author David Montero U. 
 * @version vers. 1.0
 */
public class Equipo
{
    private String pais;
    private char grupo;
    private int posicionGrupo;
    private int rankingFifa;
    
    public Equipo()
    {
         pais="";
         grupo='A';
         posicionGrupo=0;
         rankingFifa=0;
    }
    
    
    public Equipo(String pais,char grupo,int posicionGrupo,int rankingFifa)
    {
         this.setPais(pais);
         this.setGrupo(grupo);
         this.setPosicionGrupo(posicionGrupo);
         this.setRankingFifa(rankingFifa);
    }
    
    //Mutadores
    
    public void setPais(String pais)
    {
        if(pais.trim().compareTo("") == 0)
        {
            System.out.println("El país no debe venir en blanco.");
        }
        else
        {
            //y no debe tener más de 10 caracteres");
            if(pais.length()>10)
            {
                System.out.println("Pais no debe tener más de 10 caracteres");
            }
            else
            {
                this.pais = pais.toUpperCase();
            }
        }
    }
    
    public void setGrupo(char  grupo)
    {
        this.grupo=grupo;
    }    
    
    public void setPosicionGrupo(int  posicionGrupo)
    {
        if(posicionGrupo >=1 && posicionGrupo<=4)
        {
            this.posicionGrupo=posicionGrupo;
        }
        else
        {
         System.out.println("La posición debe estar comprendida entre 1 y 4.");
        }       
    }    
    
    public void setRankingFifa(int  rankingFifa)
    {
        this.rankingFifa=rankingFifa;
    }       
    
    //Accesadores
    
    public String getPais()
    {
        return this.pais = pais;
    }
    
    public char getGrupo()
    {
        return this.grupo;
    }    
    
    public int getPosicionGrupo()
    {
         return this.posicionGrupo;
    }    
    
    public int getRankingFifa()
    {
        return this.rankingFifa;
    }      
    
    public void printEquipo()
    {
        System.out.println("");
        System.out.println("=== Equipo ===");
        System.out.println("");
        System.out.println("Pais:" + this.getPais());
        System.out.println("Grupo:" + this.getGrupo());
        System.out.println("Posición:" + this.getPosicionGrupo());
        System.out.println("Ranking:" + this.getRankingFifa());
        System.out.println("");
        
    }
}
