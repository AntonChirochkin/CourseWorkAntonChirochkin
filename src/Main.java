public class Main {

    private final static Employee[] workers = new Employee[10];

    public static void main(String[] args) {

        workers[0] = new Employee("Иванов", "Иван", "Иванович", 1, 65000);
        workers[1] = new Employee("Петров", "Иван", "Петрович", 2, 55000);
        workers[2] = new Employee("Сидоров", "Андрей", "Викторович", 3, 45000);
        workers[3] = new Employee("Антонов", "Юрий", "Николаевич", 4, 35000);
        workers[4] = new Employee("Сидоров", "Андрей", "Викторович", 5, 67000);
        workers[5] = new Employee("Нифонтов", "Алексей", "Иванович", 1, 78000);
        workers[6] = new Employee("Александров", "Евгений", "Борисович", 3, 54000);
        workers[7] = new Employee("Волков", "Семен", "Николаевич", 2, 87000);
        workers[8] = new Employee("Лосева", "Екатерина", "Вадимовна", 4, 93000);
        workers[9] = new Employee("Каутц", "Анна", "Владимировна", 5, 99000);
        System.out.println();
        System.out.println("Базовая сложность");
        System.out.println();
        System.out.println("Распечатать весь архив");
        allArhiv();
        System.out.println();
        System.out.println("Сумма затрат на зарплаты в месяц");
        sumSalary();
        System.out.println();
        System.out.println("Поиск сотрудника с минимальной зарплатой");
        minSalary();
        System.out.println();
        System.out.println("Поиск сотрудника с максимальной зарплатой");
        maxSalary();
        System.out.println();
        System.out.println("Подсчет среднего значения зарплат");
        averageSalary();
        System.out.println();
        System.out.println(" Фамилия, Имя, Отчество");
        fio();
    }

    public static void allArhiv() {
        for (int i = 0; i < workers.length; i++) {
            System.out.println(workers[i]);
        }
    }

    public static void sumSalary() {
        double salaryTotal = 0;
        for (int i = 0; i < workers.length; i++) {
            salaryTotal += workers[i].getSalary();
        }
        System.out.println(salaryTotal + " рублей.");
    }

    public static void minSalary() {
        double minValueSalary = workers[0].getSalary();
        int minIndex = 0;
        for (int i = 1; i < workers.length; i++) {
            if (workers[i].getSalary() < minValueSalary) {
                minValueSalary = workers[i].getSalary();
                minIndex = i;
            }
        }
        System.out.println("Сотрудник с наименьшей зарплатой " + workers[minIndex].toString());
    }

    public static void maxSalary() {
        double maxValueSalary = workers[0].getSalary();
        int maxIndex = 0;
        for (int i = 1; i < workers.length; i++) {
            if (workers[i].getSalary() > maxValueSalary) {
                maxValueSalary = workers[i].getSalary();
                maxIndex = i;
            }
        }
        System.out.println("Сотрудник с наибольшей зарплатой " + workers[maxIndex].toString());
    }

    public static void averageSalary() {
        double averSalary = 0;
        double salaryTotal = 0;
        for (int i = 0; i < workers.length; i++) {
            salaryTotal += workers[i].getSalary();
            averSalary = salaryTotal / workers[i].getId() ;
        }
        System.out.println(averSalary + " рублей.");
    }

    public static void fio() {
        for (int i = 0; i < workers.length; i++) {

            System.out.println(workers[i].getSurname() + " " + workers[i].getName() + " " + workers[i].getPatronymic());
        }
    }
}




