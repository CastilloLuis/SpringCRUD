
package com.lcastillo.SpringCRUD.Controller;

import ch.qos.logback.core.CoreConstants;
import com.lcastillo.SpringCRUD.Entity.Product;
import com.lcastillo.SpringCRUD.Service.ProductService;
import java.util.Collection;
import java.util.Random;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

/**
 *
 * @author lcastillo
 */

@RestController
public class ProductController {
    // we call the respectives services
    @Autowired
    
    private ProductService productService;
    
    @RequestMapping("/products")
    public int helloWorld() {
        System.out.print("hola");
                Random rand = new Random();
        int id = rand.nextInt((151684 - 4) + 1) + 4;
        return id;
    }
    
    @RequestMapping(value="/getAllProducts", method = RequestMethod.GET)
    public Collection<Product> getAllProducts() {
        return productService.getAllProducts();
    }
    
    @RequestMapping(value="/insertProduct", method = RequestMethod.POST)
    public void insertProduct(@RequestBody Product pro) {
        productService.insertProduct(pro);
    }
    
}
