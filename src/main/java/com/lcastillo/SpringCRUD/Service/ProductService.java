/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lcastillo.SpringCRUD.Service;

import com.lcastillo.SpringCRUD.DAO.ProductCRUD;
import com.lcastillo.SpringCRUD.Entity.Product;
import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author lenri
 */

@Service
public class ProductService {
    // methods from the ProductCRUD.java (implementation of the interface declared)
    
    @Autowired
    private ProductCRUD productCrud;
    
    public Collection<Product> getAllProducts() {
        System.out.println("hola #2");
        return productCrud.getAllProducts();
    }
    
    public void insertProduct(Product pro) {
        productCrud.insertProduct(pro);
    }
    
}
