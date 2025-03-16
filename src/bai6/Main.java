package bai6;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = {
                new Lion("Simba", 5),
                new Elephant("Dumbo", 10)
        };

        Zoo zoo = new Zoo(animals);
        zoo.showAnimals();
    }
}
