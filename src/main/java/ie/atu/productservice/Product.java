package ie.atu.productservice;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    private int produtId;
    private String productName;
    private int quantity;
    private int warehouseId;
}
