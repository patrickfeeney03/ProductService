package ie.atu.productservice;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    @PostMapping("/add-product")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public Object addProduct(@RequestBody Product product) {
        return product;
    }


    @PostMapping("/get-product-by-id")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public Object getProductById(@RequestBody Warehouse warehouse) {
        return warehouse;
    }
}
