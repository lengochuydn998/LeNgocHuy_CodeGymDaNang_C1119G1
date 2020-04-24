package Advanced.ThucHanh.AnimalAndEdible;

public class Chicken extends Animal implements Edible{
    @Override
    public String makeSound(){
        return "Chicken : chuck chuck chuck";
    }
    @Override
    public String howToEat(){
        return "could be fried";
    }
}
