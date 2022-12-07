package advancedLessons;

import java.util.Calendar;

public class Employee extends Person {
    private int salary;


    public Employee (char sex, String name, int yearOfBirth,  int salary){
        super(sex, name, yearOfBirth);
        this.salary = salary;
    }


    public int getSalary() {
        return salary;

    }


    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String getName() {
        if (this.getSex() == 'F'){
            return "Ms. " + super.getName();
        } else if (this.getSex() == 'M'){
            return "Mr. "+ super.getName();
        } else {
            return getName();
        }
    }

}
