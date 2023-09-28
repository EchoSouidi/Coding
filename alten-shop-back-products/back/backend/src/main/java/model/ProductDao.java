package model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
@Setter
@Getter
public class ProductDao {

        Integer id;
        String code;
        String name;
        String description;
        int price;
        int quantity;
        String inventoryStatus;
        String category;
        String image;
        int rating;

}
