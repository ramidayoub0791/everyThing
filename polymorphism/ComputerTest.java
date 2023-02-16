package polymorphism;

public class ComputerTest {
    public static void main(String[] args) {
        Computer[] pcs = {new Apple(), new Lenovo(), new HP(), new Dell()};

        for (Computer pc : pcs) {
            pc.cpu();
            pc.price();
            pc.screen();

          /*  if (pc instanceof Apple) {
                Apple apple = (Apple) pc;
                apple.appSpecial();
                apple.cpu();*/
            }
        }
   // }
}
