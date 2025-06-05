package BackendPizza.PizzaEpic.repository;
import BackendPizza.PizzaEpic.bean.Drink;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;



public interface DrinkRepository extends JpaRepository<Drink, Long> {}