public class Inheritance {
    public static void main(String[] args) {
        Fish jellyfish = new Fish();
        System.out.println(jellyfish.color);
        jellyfish.eat();
        jellyfish.fins = 4;

    }

}

// base class
class Animal {
    Animal() {
        System.out.println("animal constructor is called");
    }

    String color;

    void eat() {
        System.out.println("eating");
    }

    void breath() {
        System.out.println("breathing");
    }
}

// derived class
class Fish extends Animal {
    Fish() {
        super.color = "brown";
        System.out.println("fish constructor is called");
    }

    int fins;

    void swim() {
        System.out.println("swimming");
    }
}
