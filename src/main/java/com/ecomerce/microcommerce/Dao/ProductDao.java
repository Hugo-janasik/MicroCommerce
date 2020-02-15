package com.ecomerce.microcommerce.Dao;
import com.ecomerce.microcommerce.model.Product;
import java.util.List;

public interface ProductDao {
    public List<Product>findAll(); // Renvoie la liste compléte de tous les produits
    public Product findById(int id); // Renvoie un produit par son Id
    public Product save(Product product); // Ajout d'un produit
}
