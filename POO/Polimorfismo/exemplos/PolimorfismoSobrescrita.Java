// Classe pai (superclasse)
class Animal {
    public void fazerSom() {
        System.out.println("Animal faz algum som");
    }
}

// Classe filha (subclasse)
class Cachorro extends Animal {
    @Override
    public void fazerSom() {
        System.out.println("Cachorro late");
    }
}

// Outra classe filha (subclasse)
class Gato extends Animal {
    @Override
    public void fazerSom() {
        System.out.println("Gato mia");
    }
}

public class PolimorfismoSobrescrita {
    public static void main(String[] args) {
        Animal meuAnimal;

        meuAnimal = new Cachorro();
        meuAnimal.fazerSom(); // Chama o método sobrescrito da classe Cachorro

        meuAnimal = new Gato();
        meuAnimal.fazerSom(); // Chama o método sobrescrito da classe Gato
    }
}