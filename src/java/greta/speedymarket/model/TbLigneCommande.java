package greta.speedymarket.model;
// Generated 19 sept. 2016 16:48:31 by Hibernate Tools 4.3.1



/**
 * TbLigneCommande generated by hbm2java
 */
public class TbLigneCommande  implements java.io.Serializable {


     private TbLigneCommandeId id;
     private TbArticle tbArticle;
     private TbCommande tbCommande;
     private int qteCmde;

    public TbLigneCommande() {
    }

    public TbLigneCommande(TbLigneCommandeId id, TbArticle tbArticle, TbCommande tbCommande, int qteCmde) {
       this.id = id;
       this.tbArticle = tbArticle;
       this.tbCommande = tbCommande;
       this.qteCmde = qteCmde;
    }
   
    public TbLigneCommandeId getId() {
        return this.id;
    }
    
    public void setId(TbLigneCommandeId id) {
        this.id = id;
    }
    public TbArticle getTbArticle() {
        return this.tbArticle;
    }
    
    public void setTbArticle(TbArticle tbArticle) {
        this.tbArticle = tbArticle;
    }
    public TbCommande getTbCommande() {
        return this.tbCommande;
    }
    
    public void setTbCommande(TbCommande tbCommande) {
        this.tbCommande = tbCommande;
    }
    public int getQteCmde() {
        return this.qteCmde;
    }
    
    public void setQteCmde(int qteCmde) {
        this.qteCmde = qteCmde;
    }




}


