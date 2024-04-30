package lk.ijse.tailorshop.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class Material {
    private String materialId;
    private String description;
    private double qty;
    private double unitPrice;
    private String customerId;
}
