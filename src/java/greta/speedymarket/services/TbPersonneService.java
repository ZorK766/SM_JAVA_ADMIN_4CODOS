package greta.speedymarket.services;

import greta.speedymarket.dao.TbPersonneDAO;
import greta.speedymarket.model.TbPersonne;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean(name = "TbPersonneService")
@ViewScoped
public class TbPersonneService {

    private TbPersonne selectedPersonne;

    public TbPersonne getSelectedPersonne() {
        return this.selectedPersonne;

    }

    public void setSelectedPersonne(TbPersonne selectedPersonne) {

        this.selectedPersonne = selectedPersonne;

    }

    public void createPersonne() {

        TbPersonne newPersonne = new TbPersonne();
        TbPersonneDAO tbPersonneDAO = new TbPersonneDAO();
        tbPersonneDAO.save(newPersonne);

    }

    public void savePersonne(TbPersonne personne) {

        if (personne != null) {
            TbPersonneDAO tbPersonneDAO = new TbPersonneDAO();
            tbPersonneDAO.update(personne);

        }

    }

    public void deletePersonne(TbPersonne personne) {

        if (personne != null) {

            TbPersonneDAO tbPersonneDAO = new TbPersonneDAO();
            tbPersonneDAO.remove(personne);

        }

    }

    public List<TbPersonne> loadPersonnes() {

        TbPersonneDAO tbPersonneDAO = new TbPersonneDAO();
        return tbPersonneDAO.findAll();

    }

}
