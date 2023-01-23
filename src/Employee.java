import java.util.concurrent.atomic.AtomicInteger;

public class Employee {
    String surname;
    String name;
    String patronymic;
    int department;
    double salary;

    public static int counter = 1;
    private  int id;
      public Employee(String surname, String name, String patronymic, int department, double salary) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.department = department;
        this.salary = salary;
        id = counter++;
    }

    public String getSurname() {
        return this.surname;
    }

    public String getName() {
        return this.name;
    }

    public String getPatronymic() {
        return this.patronymic;
    }

    public int getDepartment() {
        return this.department;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getId() {
          return id;
    }

    public String toString() {
        return "Фамилия - " + this.surname + " Имя - " + this.name + " Отчество - " + this.patronymic + ", отдел № " + this.department + ", оклад " + this.salary + " рублей, " + " id " + id;
    }

    public String toString1() {
        return this.name;
    }
}
