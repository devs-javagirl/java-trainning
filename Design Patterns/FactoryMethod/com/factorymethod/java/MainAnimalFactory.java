public class MainAnimalFactory {
    public static void main(String[] args) {
        AnimalFactory animalFactory = new RandomAnimalFactory();
        Animal randomAnimal = animalFactory.createAnimal();

        randomAnimal.eat(); // Todos os animais podem comer

        if (randomAnimal instanceof Dog) {
            ((Dog) randomAnimal).bark();
        } else if (randomAnimal instanceof Cat) {
            ((Cat) randomAnimal).meow();
        }
    }
}
