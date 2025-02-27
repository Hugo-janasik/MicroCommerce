package com.ecomerce.microcommerce.Dao;
import com.ecomerce.microcommerce.model.Product;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

// Represent a Database

@Repository // class managing some data
public class ProductDaoImpl implements ProductDao {

    public static List<Product>products=new ArrayList<>();
    static {
        products.add(new Product(1, new String ("Oridnateur Portable"), 350));
        products.add(new Product(2, new String ("Aspirateur"), 150));
        products.add(new Product(3, new String ("Table de Ping Pong"), 750));
    }

    @Override
    public List<Product>findAll() {
        return products;
    }

    @Override
    public Product findById(int id) {
        for (Product product : products) {
            if (product.getId() == id) {
                return product;
            }
        }
        return null;
    }

    @Override
    public Product save(Product product) {
        products.add(product);
        return product;
    }
}
