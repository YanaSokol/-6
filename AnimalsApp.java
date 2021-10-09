public class AnimalsApp {

    public static void main(String[] args) {
        System.out.println("Кошка");
        Animal cat = new Cat(200, 2);
        cat.run();
        cat.swim();
        System.out.println("Собака");
        Animal dog = new Dog(500, 3);
        dog.run();
        dog.swim();
    }
}
