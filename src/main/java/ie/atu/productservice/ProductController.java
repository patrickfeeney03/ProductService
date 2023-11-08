package ie.atu.productservice;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping("/add-product")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public Object addProduct(@RequestBody Product product) {
        return productService.addProduct(product);
    }

    @PostMapping("/get-product-by-id/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public Object getProductById(@PathVariable String id) {
        return productService.getProductById(id);
    }
}
