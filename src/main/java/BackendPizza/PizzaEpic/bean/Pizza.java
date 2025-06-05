package BackendPizza.PizzaEpic.bean;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Pizza {
    private Long id;
    private String name;
    private boolean isXL;

    @ManyToMany
    private List<Topping> toppings;
    private double price;
}
