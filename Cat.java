
public class Cat extends Animal {
    public Cat(int run_distance, int swim_distance) {
        super(run_distance, swim_distance);
    }
    public void swim() {
        System.out.println("Кошка не умеет плыть");
    }
}
