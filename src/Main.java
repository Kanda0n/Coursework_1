import java.text.DecimalFormat;

public class Main {
    private static Employee[] listOfEmployees;

    public Main() {
        listOfEmployees = new Employee[10];
        listOfEmployees[0] = new Employee("Доу Джон Джонович", "1", 50000);
        listOfEmployees[1] = new Employee("Смит Джейн Альбертовна", "2", 55000);
        listOfEmployees[2] = new Employee("Джонсон Элис Робертовна", "3", 60000);
        listOfEmployees[3] = new Employee("Браун Боб Эрикович", "4", 45000);
        listOfEmployees[4] = new Employee("Дейвис Чарли Робович", "5", 70000);
        listOfEmployees[5] = new Employee("Уайт Ева Джоновна", "1", 48000);
        listOfEmployees[6] = new Employee("Уилсон Фрэнк Джерриевич", "2", 52000);
    }

    public static void main(String[] args) {
        System.out.println("Coursework 1.");

        printAllEmployees();
        System.out.println("Общие затраты на зарплату: " + calculateTotalMonthlyCost());
        System.out.println("Минимальная зарплата: " + findEmployeeWithMinSalary());
        System.out.println("Максимальная зарплата: " + findEmployeeWithMaxSalary());
        DecimalFormat normalAverage = new DecimalFormat("#.##");
        System.out.println("Средняя зарплата: " + normalAverage.format(calculateAverageSalary())
                + " рублей.");
        printFullNames();
    }

    public static void printAllEmployees() {
        System.out.println("Список всех сотрудников:");
        for (byte i = 0; i < Employee.idCounter; i++) {
            System.out.println(listOfEmployees[i]);
        }
    }

    public static double calculateTotalMonthlyCost() {
        double totalCost = 0;
        for (byte i = 0; i < Employee.idCounter; i++) {
            totalCost += listOfEmployees[i].getSalary();
        }
        return totalCost;
    }

    public static Employee findEmployeeWithMinSalary() {
        Employee minSalaryEmployee = listOfEmployees[0];
        for (byte i = 0; i < Employee.idCounter; i++) {
            if (listOfEmployees[i].getSalary() < minSalaryEmployee.getSalary()) {
                minSalaryEmployee = listOfEmployees[i];
            }
        }
        return minSalaryEmployee;
    }

    public static Employee findEmployeeWithMaxSalary() {
        Employee maxSalaryEmployee = listOfEmployees[0];
        for (byte i = 0; i < Employee.idCounter; i++) {
            if (listOfEmployees[i].getSalary() > maxSalaryEmployee.getSalary()) {
                maxSalaryEmployee = listOfEmployees[i];
            }
        }
        return maxSalaryEmployee;
    }

    public static double calculateAverageSalary() {
        double totalCost = calculateTotalMonthlyCost();
        return totalCost / Employee.idCounter;
    }

    public static void printFullNames() {
        System.out.println("ФИО сотрудников:");
        for (byte i = 0; i < Employee.idCounter; i++) {
            System.out.println(listOfEmployees[i].getName());
        }
    }
}