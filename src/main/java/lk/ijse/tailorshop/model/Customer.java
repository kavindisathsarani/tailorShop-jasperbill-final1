package lk.ijse.tailorshop.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class Customer {
    private String customerId;
    private String name;
    private String gender;
    private String address;
    private int contactNumber;
    private String email;

}
