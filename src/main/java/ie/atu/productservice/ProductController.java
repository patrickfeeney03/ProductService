package ie.atu.productservice;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    @PostMapping("/add-product")
    public Object addProduct(@RequestBody )
}
