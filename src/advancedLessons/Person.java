package advancedLessons;

import java.util.Calendar;

public class Person {

    private char sex;
    private String name;
    private int age;

    private int yearOfBirth;

    private Person mother;        //Person - это такой же тип, как и String, но только кот мы создали сами и имеет указанные параметры
    private Person father;

    Person(char sex, String name, int yearOfBirth ){
        this.sex = sex;
        this.name = name;
        this.yearOfBirth = yearOfBirth;
    }

    public void printName(){
        System.out.println(this.getName());
    }

    public void setFather(char sex, String name, int age){

        this.father = new Person (sex, name, age);
    }

    public void setMother (Person mother){
        this.mother = mother;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
        }


    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return Calendar.getInstance().get(Calendar.YEAR) - yearOfBirth;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person getMother() {
        return mother;
    }

    public Person getFather() {
        return father;
    }

    public void setFather(Person father) {
        this.father = father;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }
}
