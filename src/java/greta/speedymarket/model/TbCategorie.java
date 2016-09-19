package greta.speedymarket.model;
// Generated 19 sept. 2016 16:48:31 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * TbCategorie generated by hbm2java
 */
public class TbCategorie  implements java.io.Serializable {


     private Integer idCategorie;
     private TbCategorie tbCategorie;
     private TbImage tbImage;
     private String CLibelle;
     private Set tbArticles = new HashSet(0);
     private Set tbCategories = new HashSet(0);

    public TbCategorie() {
    }

	
    public TbCategorie(String CLibelle) {
        this.CLibelle = CLibelle;
    }
    public TbCategorie(TbCategorie tbCategorie, TbImage tbImage, String CLibelle, Set tbArticles, Set tbCategories) {
       this.tbCategorie = tbCategorie;
       this.tbImage = tbImage;
       this.CLibelle = CLibelle;
       this.tbArticles = tbArticles;
       this.tbCategories = tbCategories;
    }
   
    public Integer getIdCategorie() {
        return this.idCategorie;
    }
    
    public void setIdCategorie(Integer idCategorie) {
        this.idCategorie = idCategorie;
    }
    public TbCategorie getTbCategorie() {
        return this.tbCategorie;
    }
    
    public void setTbCategorie(TbCategorie tbCategorie) {
        this.tbCategorie = tbCategorie;
    }
    public TbImage getTbImage() {
        return this.tbImage;
    }
    
    public void setTbImage(TbImage tbImage) {
        this.tbImage = tbImage;
    }
    public String getCLibelle() {
        return this.CLibelle;
    }
    
    public void setCLibelle(String CLibelle) {
        this.CLibelle = CLibelle;
    }
    public Set getTbArticles() {
        return this.tbArticles;
    }
    
    public void setTbArticles(Set tbArticles) {
        this.tbArticles = tbArticles;
    }
    public Set getTbCategories() {
        return this.tbCategories;
    }
    
    public void setTbCategories(Set tbCategories) {
        this.tbCategories = tbCategories;
    }




}


