package desginPattern.Structural;
interface Pizza {
    String getDescription();
    double getCost();   
}
class plainPizza implements Pizza{
    @Override
    public String getDescription() {
        return "Plain Pizza";
    }
    @Override
    public double getCost() {
        return 100.0;
    }
}
abstract class PizzaDecorator implements Pizza {
    protected Pizza pizza;

    public PizzaDecorator(Pizza pizza) {
        this.pizza = pizza;
    }
}

class CheeseDecorator extends PizzaDecorator {

    public CheeseDecorator(Pizza pizza) {
        super(pizza);
    }

    public String getDescription() {
        return pizza.getDescription() + ", Cheese";
    }

    public double getCost() {
        return pizza.getCost() + 20;
    }
}

class MushroomDecorator extends PizzaDecorator {

    public MushroomDecorator(Pizza pizza) {
        super(pizza);
    }

    public String getDescription() {
        return pizza.getDescription() + ", Mushroom";
    }

    public double getCost() {
        return pizza.getCost() + 30;
    }
}

public class DecoratorPattern {
    public static void main(String[] args) {

        Pizza pizza = new plainPizza();

        pizza = new CheeseDecorator(pizza);
        pizza = new MushroomDecorator(pizza);

        System.out.println(pizza.getDescription());
        System.out.println("Total Cost: " + pizza.getCost());
    }
}

