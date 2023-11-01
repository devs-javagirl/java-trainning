import java.util.Random;

public class RandomAnimalFactory implements AnimalFactory {
    public Animal createAnimal() {
        Random random = new Random();
        int randomAnimalType = random.nextInt(2); // Gere um número aleatório (0 ou 1)

        if (randomAnimalType == 0) {
            return new Dog();
        } else {
            return new Cat();
        }
    }
}
