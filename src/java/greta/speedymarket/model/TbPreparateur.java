package greta.speedymarket.model;
// Generated 19 sept. 2016 16:48:31 by Hibernate Tools 4.3.1



/**
 * TbPreparateur generated by hbm2java
 */
public class TbPreparateur  implements java.io.Serializable {


     private int idPersonne;
     private TbPersonne tbPersonne;

    public TbPreparateur() {
    }

    public TbPreparateur(TbPersonne tbPersonne) {
       this.tbPersonne = tbPersonne;
    }
   
    public int getIdPersonne() {
        return this.idPersonne;
    }
    
    public void setIdPersonne(int idPersonne) {
        this.idPersonne = idPersonne;
    }
    public TbPersonne getTbPersonne() {
        return this.tbPersonne;
    }
    
    public void setTbPersonne(TbPersonne tbPersonne) {
        this.tbPersonne = tbPersonne;
    }




}


