/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lcastillo.SpringCRUD.DAO;

import com.lcastillo.SpringCRUD.Entity.Product;
import java.util.Collection;

/**
 *
 * @author lenri
 */
public interface ProductCRUDInterface {
 
    public Collection<Product> getAllProducts();
    
    public void insertProduct(Product pro);
    
    public void updateProduct(Product pro);
    
    public void deleteProduct(int pro);
    
    public Product getProductById(int id);
    
}
