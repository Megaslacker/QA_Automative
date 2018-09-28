package HomeTasks;

/**
 * Created by kotok_artem on 28.09.2018.
 */
public class Task4_1_1 {

    public static void main(String[] args) {
        Person person = new Person();
        person.setName("John");
        person.setSurname("Smith");
        person.setAge(18);
        person.setPhone("+(123)-45-67-89");
        System.out.println("person Name: "+ person.getName());
        System.out.println("person Surname: "+ person.getSurname());
        System.out.println("person Age: "+ person.getAge());
        System.out.println("person phone: "+ person.getPhone());



    }
}
