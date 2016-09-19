package greta.speedymarket.model;
// Generated 19 sept. 2016 16:48:31 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * TbArticle generated by hbm2java
 */
public class TbArticle  implements java.io.Serializable {


     private Integer idArticle;
     private TbCategorie tbCategorie;
     private TbImage tbImage;
     private TbTva tbTva;
     private String ADesignation;
     private Float APht;
     private String ADescription;
     private Integer AQuantiteStock;
     private boolean AVisible;
     private Set tbLigneCommandes = new HashSet(0);

    public TbArticle() {
    }

	
    public TbArticle(String ADesignation, boolean AVisible) {
        this.ADesignation = ADesignation;
        this.AVisible = AVisible;
    }
    public TbArticle(TbCategorie tbCategorie, TbImage tbImage, TbTva tbTva, String ADesignation, Float APht, String ADescription, Integer AQuantiteStock, boolean AVisible, Set tbLigneCommandes) {
       this.tbCategorie = tbCategorie;
       this.tbImage = tbImage;
       this.tbTva = tbTva;
       this.ADesignation = ADesignation;
       this.APht = APht;
       this.ADescription = ADescription;
       this.AQuantiteStock = AQuantiteStock;
       this.AVisible = AVisible;
       this.tbLigneCommandes = tbLigneCommandes;
    }
   
    public Integer getIdArticle() {
        return this.idArticle;
    }
    
    public void setIdArticle(Integer idArticle) {
        this.idArticle = idArticle;
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
    public TbTva getTbTva() {
        return this.tbTva;
    }
    
    public void setTbTva(TbTva tbTva) {
        this.tbTva = tbTva;
    }
    public String getADesignation() {
        return this.ADesignation;
    }
    
    public void setADesignation(String ADesignation) {
        this.ADesignation = ADesignation;
    }
    public Float getAPht() {
        return this.APht;
    }
    
    public void setAPht(Float APht) {
        this.APht = APht;
    }
    public String getADescription() {
        return this.ADescription;
    }
    
    public void setADescription(String ADescription) {
        this.ADescription = ADescription;
    }
    public Integer getAQuantiteStock() {
        return this.AQuantiteStock;
    }
    
    public void setAQuantiteStock(Integer AQuantiteStock) {
        this.AQuantiteStock = AQuantiteStock;
    }
    public boolean isAVisible() {
        return this.AVisible;
    }
    
    public void setAVisible(boolean AVisible) {
        this.AVisible = AVisible;
    }
    public Set getTbLigneCommandes() {
        return this.tbLigneCommandes;
    }
    
    public void setTbLigneCommandes(Set tbLigneCommandes) {
        this.tbLigneCommandes = tbLigneCommandes;
    }




}


