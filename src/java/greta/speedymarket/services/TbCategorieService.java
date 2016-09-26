package greta.speedymarket.services;

import greta.speedymarket.dao.TbCategorieDAO;
import greta.speedymarket.model.TbCategorie;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import org.primefaces.model.DefaultTreeNode;
import org.primefaces.model.TreeNode;

@ManagedBean(name = "TbCategorieService")
@ViewScoped
public class TbCategorieService {
    private TreeNode root = null ;
    private TreeNode selectedNode ;

    public TreeNode getSelectedNode() {
        return selectedNode;
    }

    public void setSelectedNode(TreeNode selectedNode) {
        this.selectedNode = selectedNode;
    }
    
    public TbCategorie getSelectedNodeCategorie(){
        return (TbCategorie) getSelectedNode().getData();
    }
    
    private TbCategorie selectedCategorie;

    public TbCategorie getSelectedCategorie() {
        return this.selectedCategorie;

    }

    public void setSelectedCategorie(TbCategorie selectedCategorie) {

        this.selectedCategorie = selectedCategorie;

    }

    public void createCategorie() {

        TbCategorie newCategorie = new TbCategorie();
        TbCategorieDAO tbCategorieDAO = new TbCategorieDAO();
        tbCategorieDAO.save(newCategorie);

    }

    public void saveCategorie(TbCategorie categorie) {

        if (categorie != null) {
            TbCategorieDAO tbCategorieDAO = new TbCategorieDAO();
            tbCategorieDAO.update(categorie);

        }

    }

    public void deleteCategorie(TbCategorie categorie) {

        if (categorie != null) {

            TbCategorieDAO tbCategorieDAO = new TbCategorieDAO();
            tbCategorieDAO.remove(categorie);

        }
    }

    public List<TbCategorie> loadCategories() {
        
        TbCategorieDAO tbCategorieDAO = new TbCategorieDAO();
        System.out.print ("coucouc:"+tbCategorieDAO.findAll());
        return tbCategorieDAO.findAll();
    }
    
    public List<TbCategorie> loadCategoriesParentes(){
        List<TbCategorie> categories = new ArrayList<>();
        for (TbCategorie category : loadCategories()){
            if(category.getTbCategorie()==null){
                categories.add(category);
            }
        }
        return categories;
    }
    
    public TreeNode getRoot(){
        root = new DefaultTreeNode();
        
        for (TbCategorie categorie : loadCategoriesParentes()){
            TreeNode node = new DefaultTreeNode(categorie, root);
            
            createCategoriesTreeNode(categorie, node);
        }
        return root;
    }
    private void createCategoriesTreeNode(TbCategorie categorie, TreeNode nodeParent){
        for(Object category : categorie.getTbCategories()){
            TbCategorie cat = (TbCategorie) category;
            TreeNode node = new DefaultTreeNode(category, nodeParent);

            createCategoriesTreeNode(cat, node);
    }
}
}
