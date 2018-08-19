
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
    
    @RequestMapping("/helloworld")
    public String helloWorld() {
        return "Hello world from a Spring Controller :)";
    }
    
    @RequestMapping(value="/getAllProducts", method = RequestMethod.GET)
    public Collection<Product> getAllProducts() {
        return productService.getAllProducts();
    }
    
    @RequestMapping(value="/insertProduct", method = RequestMethod.POST)
    public void insertProduct(@RequestBody Product pro) {
        productService.insertProduct(pro);
    }
    
    @RequestMapping(value="/updateProduct", method = RequestMethod.POST)
    public void updateProduct(@RequestBody Product pro) {
        System.out.println(pro);
        productService.updateProduct(pro);
    }
    
}
