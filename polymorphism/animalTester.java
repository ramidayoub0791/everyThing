package polymorphism;

public class animalTester {
    public static void main(String[] args) {
        animal[] ans = {new cat(), new horse()};
        for (animal an:ans) {
            an.eat();
            an.speak();
        }
    }
}
