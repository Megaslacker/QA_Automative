package HomeTasks;

/**
 * Created by kotok_artem on 28.09.2018.
 */
public class Task4_1 {


    public static void main(String[] args) {
        class Person {
            // Variables
            private String name;
            private String surname;
            private int age;
            private String phone;

            // Setters
            public void setName(String name) {
                this.name = name;
            }

            public void setSurname(String surname) {
                this.surname = surname;
            }

            public void setAge(int age) {
                this.age = age;
            }

            public void setPhone(String phone) {
                this.phone = phone;
            }

            // Getters
            public String getName() {
                return this.name;
            }

            public String getSurname() {
                return this.surname;
            }

            public int getAge() {
                return this.age;
            }

            public String getPhone() {
                return this.phone;

            }

        }
        Person person = new Person();
        person.setAge(18);
        person.setName("John");
        person.setSurname("Smith");
        person.setPhone("+(123)-45-67-89");
        System.out.println("person Name: "+ person.getName());
        System.out.println("person Surname: "+ person.getSurname());
        System.out.println("person Age: "+ person.getAge());
        System.out.println("person phone: "+ person.getPhone());
    }
}
