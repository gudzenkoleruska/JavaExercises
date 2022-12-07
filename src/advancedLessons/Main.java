package advancedLessons;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

    Person firstPerson = new Person('M', "John", 1999);
    Person secondPerson = new Person('F',"Jane", 2000);
    firstPerson.setMother(secondPerson);
    firstPerson.setFather('M', "Mike", 40);


//    firstPerson.age = 30;
//    firstPerson.name = "Lera";
//    firstPerson.sex = "Female";

//        System.out.println(String.format("name: %s, sex: %s, age: %s, mother: %s, father: %s", firstPerson.getName(), firstPerson.getSex(), firstPerson.getAge(), secondPerson.getMother().getName(), firstPerson.getFather().getName()));
        System.out.println(String.format("name: %s, sex: %s, age: %s, mother: %s, father: %s", secondPerson.getName(), secondPerson.getSex(), secondPerson.getAge(), firstPerson.getMother().getName(), firstPerson.getFather().getName()));
        firstPerson.printName();
//        secondPerson.name = "Ihor";
        secondPerson.printName();

        Person [] arrAge = {new Person('M', "John", 30), new Person('F',"Jane", 25), new Person('M', "Mike", 40)};

//        Person oldest = null;
//        int maxAge = Integer.MIN_VALUE;
//
//        for (Person person : arrAge){
//            if (person.getAge() > maxAge) {
//                oldest = person;
//                maxAge = person.getAge();
//            }
//        }
//
//        System.out.println("The oldest person is " + oldest.getName() + " with age: " +  + maxAge);


        Employee employee = new Employee(secondPerson.getSex(), secondPerson.getName(),secondPerson.getYearOfBirth(), 150000);
        System.out.println(employee.getName());

        Manager manager = new Manager(employee.getSex(), employee.getName(), employee.getYearOfBirth(), employee.getSalary());
        System.out.println(String.format(String.valueOf(employee.getSex()), employee.getName(), employee.getYearOfBirth(), employee.getSalary()));

    }
}
