package ie.atu.productservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(name = "warehouse-service", url = "http://localhost:8081")
public interface ProductService {
    @PostMapping("/add-product")
    Object addProduct(@RequestBody Product product);

    @GetMapping("/get-product-by-id/{id}")
    Object getProductById(@PathVariable String id);

    @GetMapping("/get-warehouse/{id}")
    Warehouse getWarehouse(@PathVariable int id);
}
