package BackendPizza.PizzaEpic.bean;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {
    private Long id;
    private int orderNumber;

    @Enumerated(EnumType.STRING)
    private OrderState state;
    private int covers;
    private LocalDateTime timestamp;
    private double total;
    @ManyToOne
    private Table table;
    @ManyToMany
    private List<Pizza> items;
    public void calculateTotal(double coverCharge){
        double itemTotal = items.stream().mapToDouble(Pizza::getPrice).sum();
        this.total = itemTotal +(covers* coverCharge);
    }
}
