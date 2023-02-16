package polymorphism;

public abstract class animal {
  abstract void speak();

    void eat(){
        System.out.println("animal must eat");
    }
}

class cat extends animal{
    void speak(){
        System.out.println("cat can speak");
    }
}

abstract class dog extends animal{
    void eat(){
        System.out.println("dog must eat");
    }
}

class horse extends animal{
    void speak(){
        System.out.println("horse will speak");
    }

    void eat(){
        System.out.println("horse needs to eat");
    }
}
