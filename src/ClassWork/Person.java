package ClassWork;

public class Person {
    int id;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    String name;
    int age;

    public Person() {
    }


    public Person(int id) {
        this.id = id;
    }

    public Person(int id, String name) {
        this(id);
        this.name = name;

    }

    public Person(int id, String name, int age) {
        this(id, name);
        this.age = age;
    }
    public void print(){
        System.out.println(this.id + " "+ this.name + " "+ this.age);
    }

}
