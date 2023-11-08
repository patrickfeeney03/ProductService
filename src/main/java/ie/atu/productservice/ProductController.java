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
        if (productService.getWarehouse(product.getWarehouseId()).getCapacity() != 0 &&
        productService.getWarehouse(product.getWarehouseId()).getCapacity() > product.getQuantity()) {
            productService.addProduct(product);
            return productService.getWarehouse(product.getWarehouseId());
        } else {
            return "No space available to add product.";
        }
    }

    @GetMapping("/get-product/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public Object getProductById(@PathVariable String id) {
        return productService.getProductById(id);
    }
}
