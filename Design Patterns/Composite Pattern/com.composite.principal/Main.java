public class Main {
    public static void main(String[] args) {

        var lesson0 = new Lesson("Lesson 00: Introdução");

        var lesson1 = new Lesson("Lesson 01: Sintaxe básica");
        var lesson2 = new Lesson("Lesson 02: Variáveis");

        var module1 = new Module("Module 01: Primeiros passos com Java");
        module1.add(lesson1);
        module1.add(lesson2);

        var completeJavaModule = new Module("Course: Aprendendo Java");

        completeJavaModule.add(lesson0);
        completeJavaModule.add(module1);

        completeJavaModule.display(0);

    }
}
