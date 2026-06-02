package VetoresListMatriz.exercicio04.entities;

public class Employee {

    private int id;
    private String nameEmployee;
    private double salary;

    public Employee(int id, String nameEmployee, double salary) {
        this.id = id;
        this.nameEmployee = nameEmployee;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameEmployee() {
        return nameEmployee;
    }

    public void setNameEmployee(String nameEmployee) {
        this.nameEmployee = nameEmployee;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee -- " +
                "id: " + id +
                ", employee name: " + nameEmployee +
                ", salary: " + salary;
    }

    public void increasedSalary(double percentage) {
        this.salary += salary * (100 / percentage);


    }



}
