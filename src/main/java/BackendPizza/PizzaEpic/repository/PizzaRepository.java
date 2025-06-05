package BackendPizza.PizzaEpic.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import BackendPizza.PizzaEpic.bean.Pizza;

public interface PizzaRepository extends JpaRepository<Pizza, Long> {}