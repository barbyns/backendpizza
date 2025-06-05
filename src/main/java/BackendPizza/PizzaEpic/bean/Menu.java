package BackendPizza.PizzaEpic.bean;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Menu {
    private Long id;

    @ManyToMany
    private List<Pizza> pizzas;
    @ManyToMany
    private List<Drink> drinks;
    @ManyToMany
    private List<Topping> toppings;
}
