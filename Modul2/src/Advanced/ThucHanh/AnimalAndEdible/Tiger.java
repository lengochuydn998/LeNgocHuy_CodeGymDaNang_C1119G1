package Advanced.ThucHanh.AnimalAndEdible;

public class Tiger extends Animal implements Edible{
    @Override
    public String makeSound(){
        return "Tiger: roar roar roar !";
    }
    @Override
    public String howToEat(){
        return "could by eat";
    }
}
