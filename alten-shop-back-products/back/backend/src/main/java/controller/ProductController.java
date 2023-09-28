package controller;


import model.ProductDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import services.ProductServices;

@RestController
@RequestMapping("/products")
//@CrossOrigin(origins = "http://localhost:4200")
public class ProductController {


    @Autowired
    private  ProductServices productService ;

    @PostMapping("/createProduct")
    public void saveProduct(@RequestBody ProductDao productDao) {
            try {
                productService.saveProduct(productDao);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    @GetMapping("/findProduct/{id}")
    public ProductDao findProduct(@PathVariable Integer personId){
        ProductDao productDao = new ProductDao();
        return productDao;
    }


}
