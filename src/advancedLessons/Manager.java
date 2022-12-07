package advancedLessons;

public class Manager extends Employee{

    public Manager(char sex, String name, int yearOfBirth, int salary) {
        super(sex, name, yearOfBirth, salary);
    }

    @Override
    public int getSalary(){
        return 12000 + super.getSalary();
    }


}
