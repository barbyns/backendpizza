package BackendPizza.PizzaEpic.bean;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Drink {
    private Long id;
    private String name;
    private int calories;
    private double price;
}
