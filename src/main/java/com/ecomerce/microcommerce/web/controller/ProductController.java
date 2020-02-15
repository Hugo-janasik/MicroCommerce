package com.ecomerce.microcommerce.web.controller;
import com.ecomerce.microcommerce.Dao.ProductDao;
import com.ecomerce.microcommerce.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class ProductController {

    @Autowired // create an instance
    private ProductDao productDao;

    @RequestMapping(value="/Produits", method = RequestMethod.GET)
    public List<Product> listProduits() {
        return productDao.findAll();
    }

    //Récupérer un produit par son Id
    @GetMapping(value="/Produits/{id}")
    public Product afficherUnProduit(@PathVariable int id) {
        Product product=new Product(id, new String("Aspirateur"), 100 );
        return productDao.findById(id);
    }

    @PostMapping(value = "/Produits")
    public void ajouterProduit(@RequestBody Product product) {
        productDao.save(product);
    }

}