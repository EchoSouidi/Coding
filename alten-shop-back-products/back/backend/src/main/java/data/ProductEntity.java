package data;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
@Setter
@Getter
@Entity(name = "Product")
public class ProductEntity {
        @Id
        Integer id;

        @Column(nullable = false, unique = true, length = 10) //exemple
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
