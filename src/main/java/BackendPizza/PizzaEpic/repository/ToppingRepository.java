package BackendPizza.PizzaEpic.repository;
import BackendPizza.PizzaEpic.bean.Topping;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ToppingRepository extends JpaRepository<Topping, Long> {}