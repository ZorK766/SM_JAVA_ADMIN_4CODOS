package greta.speedymarket.model;
// Generated 19 sept. 2016 16:48:31 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * TbTva generated by hbm2java
 */
public class TbTva  implements java.io.Serializable {


     private Integer idTva;
     private String TLibelle;
     private float TTaux;
     private Set tbArticles = new HashSet(0);

    public TbTva() {
    }

	
    public TbTva(String TLibelle, float TTaux) {
        this.TLibelle = TLibelle;
        this.TTaux = TTaux;
    }
    public TbTva(String TLibelle, float TTaux, Set tbArticles) {
       this.TLibelle = TLibelle;
       this.TTaux = TTaux;
       this.tbArticles = tbArticles;
    }
   
    public Integer getIdTva() {
        return this.idTva;
    }
    
    public void setIdTva(Integer idTva) {
        this.idTva = idTva;
    }
    public String getTLibelle() {
        return this.TLibelle;
    }
    
    public void setTLibelle(String TLibelle) {
        this.TLibelle = TLibelle;
    }
    public float getTTaux() {
        return this.TTaux;
    }
    
    public void setTTaux(float TTaux) {
        this.TTaux = TTaux;
    }
    public Set getTbArticles() {
        return this.tbArticles;
    }
    
    public void setTbArticles(Set tbArticles) {
        this.tbArticles = tbArticles;
    }




}


