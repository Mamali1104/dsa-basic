public class OOPS {
    public static void main(String[] args) {
        Pen p1 = new Pen(); // created pen object of p1
        p1.setColor("blue");
        System.out.println(p1.color);
        p1.settip(6);
        System.out.println(p1.tip);

        BankAccount myAcc = new BankAccount();
        myAcc.username = "mama";
        myAcc.setPassword("abcd");

        Student s1 = new Student();
        s1.name = "bubu";
        s1.roll = 99;
        s1.password = "abcd";
        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 80;

        Student s2 = new Student(s1);// copy
        s2.password = "xyz";
        s1.marks[2] = 100;
        for (int i = 0; i < 3; i++) {
            System.out.println(s2.marks[i]);
        }

        // Student s2 = new Student("bubu");
        // Student s3 = new Student(98);
        // Student s4 = new Student("b",98);
        // System.out.println(s1.name);
    }
}

class BankAccount {
    public String username;
    private String password;

    public void setPassword(String pwd) {
        password = pwd;
    }

}

class Pen {
    String color;
    int tip;

    void setColor(String newColor) {
        color = newColor;
    }

    void settip(int newTip) {
        tip = newTip;
    }
}

class Student {
    String name;
    int roll;
    String password;
    int marks[];

    // shallow copy constructor
    // Student(Student s1) {
    // marks = new int[3];
    // this.name = s1.name;
    // this.roll = s1.roll;
    // this.marks = s1.marks;
    // }

    // deep copy constructor
    Student(Student s1) {
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        for (int i = 0; i < marks.length; i++) {
            this.marks[i] = s1.marks[i];
        }
    }

    Student() {
        // this.name = name;
        marks = new int[3];
        System.out.println("constructor is called");
    }

    Student(String name) {
        marks = new int[3];
        this.name = name;

    }

    Student(int roll) {
        marks = new int[3];
        this.roll = roll;
    }

}