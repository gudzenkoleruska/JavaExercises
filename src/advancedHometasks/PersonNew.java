package advancedHometasks;

import java.util.Calendar;

import static java.lang.Character.toLowerCase;
import static java.lang.Character.toUpperCase;

public class PersonNew {
    //Задача №7
    //Необходимо создать класс Person с полями: имя, возраст, пол. Класс должен иметь метод - getName,
    // метод возвращает имя с префиксом “Mr. ” если пол указан как мужской и префикс “Ms. ” если женский.

    private String name;

    private char sex;

    private int yearOfBirth;

    private int age;

    PersonNew(String name, int yearOfBirth, char sex){
        this.name = name;
        this.yearOfBirth = yearOfBirth;
        this.sex = sex;
    }


    public String getName() {
        if (this.sex == 'F') {
            return "Ms." + this.name;
        } else if (this.sex == 'M'){
            return "Mr." + this.name;
        }else{
            return name;
        }
    }

//        switch (this.sex) {
//            case 'F':
//                return "Ms." + this.name;
//            case 'M':
//                return "Mr." + this.name;
//            default:
//                return name;
//        }
//    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public int getAge() {
        return Calendar.getInstance().get(Calendar.YEAR) - yearOfBirth;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }
//    Задача №8
//    В классе Person добавьте поле yearOfBirth (год рождения) и сделайте это поле неизменяемым которое можно задать
//    только через конструктор.
//    Удалите поле age из конструкторов и удалите setter метод для этого поля.
//    Измените getter для поля age чтобы он возвращал возраст как целое количество лет

    PersonNew(){

    }



}
