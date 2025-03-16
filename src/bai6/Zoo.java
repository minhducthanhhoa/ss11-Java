package bai6;

public class Zoo {
    private Animal[]  animals;

    public Zoo(Animal[] animals) {
        this.animals = animals;
    }

    public void showAnimals(){
        for (Animal animal : animals){
            System.out.println("Animal: " + animal.name + ", Age: " + animal.age);
            animal.sound();
            animal.move();
            System.out.println();
        }
    }
}
