package fooddelivery.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "OrderHistrory_table")
@Data
public class OrderHistrory {

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
}
