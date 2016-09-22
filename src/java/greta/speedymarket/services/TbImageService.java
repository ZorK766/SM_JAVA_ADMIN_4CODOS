package greta.speedymarket.services;

import greta.speedymarket.dao.TbImageDAO;
import greta.speedymarket.model.TbImage;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean(name = "TbImageService")
@ViewScoped

public class TbImageService {

    private TbImage selectedImage;

    public TbImage getSelectedImage() {

        return this.selectedImage;

    }

    public void setSelectedImage(TbImage selectedImage) {

        this.selectedImage = selectedImage;

    }

    public void createImage() {

        TbImage newImage = new TbImage();

        TbImageDAO tbImageDAO = new TbImageDAO();

        tbImageDAO.save(newImage);

    }

    public void saveImage(TbImage image) {

        if (image != null) {

            TbImageDAO tbImageDAO = new TbImageDAO();

            tbImageDAO.update(image);

        }

    }

    public void deleteImage(TbImage image) {

        if (image != null) {

            TbImageDAO tbImageDAO = new TbImageDAO();

            tbImageDAO.remove(image);

        }

    }

    public List<TbImage> loadImages() {

        TbImageDAO tbImageDAO = new TbImageDAO();

        return tbImageDAO.findAll();

    }

}
