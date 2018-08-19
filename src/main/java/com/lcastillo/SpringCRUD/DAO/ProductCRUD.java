package com.lcastillo.SpringCRUD.DAO;


import com.lcastillo.SpringCRUD.Entity.Product;
import com.lcastillo.SpringCRUD.Helpers.helpers;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author lenri
 */

@Repository
public class ProductCRUD implements ProductCRUDInterface {
    helpers helpers = new helpers();
    @Autowired
    private static Map<Integer, Product> products;
        static {
            products = new HashMap<Integer, Product>() {
                {
                    put(1, (new Product(1, "Headphones", "Sony", 15.5, 10, true)));
                    put(2, (new Product(2, "TV 4K", "Sony TV 4K", 400, 5, true)));
                    put(3, (new Product(3, "Laptop HP", "Laptop HP 16GB RAM", 500, 2, true)));
                }
            };
        }

    @Override
    public Collection<Product> getAllProducts() {
        System.out.println("hola #3");
        System.out.println(this.products);
        return products.values();
    }

    @Override
    public void insertProduct(Product pro) {
        try {
            products.put(this.helpers.generateId(), pro);
            this.getAllProducts();
        } catch (Exception e) {
            System.out.println("Error while inserting product" + e);
        }
    }

    @Override
    public void updateProduct(Product pro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteProduct(Product pro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Product getProductById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
