package ie.atu.productservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductController {
    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping("/add")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public Object addProduct(@RequestBody Product product) {
        System.out.println("HERE");
        System.out.println(productService.addProduct(product));
        return productService.addProduct(product);
    }

    @GetMapping("/get-product/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public Object getProductById(@PathVariable String id) {
        return productService.getProductById(id);
    }
}
