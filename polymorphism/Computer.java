package polymorphism;

public class Computer {

    void cpu(){
        System.out.println("pc should have a good processor");
    }
    void screen(){
        System.out.println("screen size 15");
    }

    void price(){
        System.out.println("pc price should be acceptable");
    }
}

       class Apple extends Computer{
           void cpu(){
               System.out.println("Apple should have a good processor");
           }

           void appSpecial(){
               System.out.println(" this is Apple method only");
           }
       }

class Lenovo extends Computer{
    void screen(){
        System.out.println("Lenevo screen size 15");
    }
}

class HP extends Computer{
    void price(){
        System.out.println("HP price should be expensive");
    }
}

class Dell extends Computer{
    void cpu(){
        System.out.println("Dell pc have a good processor");
    }
}
  /*  Create a Class Computer that will have 4 subclasses as Apple, Lenovo, HP, Dell.
        Define common behavior within and some fields in parent class and override some of the methods in child classes
        Define some methods specific to child classes
        Create objects of child classes and store them into array. Loop through each object and execute available methods.*/