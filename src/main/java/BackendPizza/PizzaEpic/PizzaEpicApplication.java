package BackendPizza.PizzaEpic;

import BackendPizza.PizzaEpic.bean.Drink;
import BackendPizza.PizzaEpic.bean.Pizza;
import BackendPizza.PizzaEpic.bean.Topping;
import BackendPizza.PizzaEpic.repository.DrinkRepository;
import BackendPizza.PizzaEpic.repository.PizzaRepository;
import BackendPizza.PizzaEpic.repository.ToppingRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class PizzaEpicApplication {

    public static void main(String[] args) {
        SpringApplication.run(PizzaEpicApplication.class, args);
    }

    @Bean
    public CommandLineRunner runner(ApplicationContext ctx,
                                    PizzaRepository pizzaRepo,
                                    DrinkRepository drinkRepo,
                                    ToppingRepository toppingRepo) {
        return args -> {
            Pizza margherita = ctx.getBean("pizza_margherita", Pizza.class);
            Pizza salami = ctx.getBean("salami_pizza", Pizza.class);
            Drink water = ctx.getBean("water", Drink.class);
            Topping cheese = ctx.getBean("toppings_cheese", Topping.class);

            pizzaRepo.saveAll(List.of(margherita, salami));
            drinkRepo.save(water);
            toppingRepo.save(cheese);
        };
    }
}
