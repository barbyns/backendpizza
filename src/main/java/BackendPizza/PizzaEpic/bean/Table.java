package BackendPizza.PizzaEpic.bean;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Table {
    private Long id;
    private int tableNumber;
    private int maxCovers;
    private boolean isOccupied;
}
