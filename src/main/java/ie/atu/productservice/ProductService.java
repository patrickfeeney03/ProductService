package ie.atu.productservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@FeignClient(name = "warehouse-service", url = "http://localhost:8081")
public interface ProductService {
    @PostMapping("/add-product")
    Object addProduct(@RequestBody Product product);
}
