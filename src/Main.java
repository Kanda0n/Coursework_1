import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        System.out.println("Coursework 1.");
        Employee[] listOfEmployees = new Employee[10];

        listOfEmployees[0] = new Employee("Доу Джон Джонович", "1", 50000);
        listOfEmployees[1] = new Employee("Смит Джейн Альбертовна", "2", 55000);
        listOfEmployees[2] = new Employee("Джонсон Элис Робертовна", "3", 60000);
        listOfEmployees[3] = new Employee("Браун Боб Эрикович", "4", 45000);
        listOfEmployees[4] = new Employee("Дейвис Чарли Робович", "5", 70000);
        listOfEmployees[5] = new Employee("Уайт Ева Джоновна", "1", 48000);
        listOfEmployees[6] = new Employee("Уилсон Фрэнк Джерриевич", "2", 52000);

        printAllEmployees(listOfEmployees);
        System.out.println("Общие затраты на зарплату: " + calculateTotalMonthlyCost(listOfEmployees));
        System.out.println("Минимальная зарплата: " + findEmployeeWithMinSalary(listOfEmployees));
        System.out.println("Максимальная зарплата: " + findEmployeeWithMaxSalary(listOfEmployees));
        DecimalFormat normalAverage = new DecimalFormat("#.##");
        System.out.println("Средняя зарплата: " + normalAverage.format(calculateAverageSalary(listOfEmployees))
                + " рублей.");
        printFullNames(listOfEmployees);
    }

    public static void printAllEmployees(Employee[] employees) {
        System.out.println("Список всех сотрудников:");
        for (byte i = 0; i < Employee.idCounter; i++) {
            System.out.println(employees[i]);
        }
    }

    public static double calculateTotalMonthlyCost(Employee[] employees) {
        double totalCost = 0;
        for (byte i = 0; i < Employee.idCounter; i++) {
            totalCost += employees[i].getSalary();
        }
        return totalCost;
    }

    public static Employee findEmployeeWithMinSalary(Employee[] employees) {
        Employee minSalaryEmployee = employees[0];
        for (byte i = 0; i < Employee.idCounter; i++) {
            if (employees[i].getSalary() < minSalaryEmployee.getSalary()) {
                minSalaryEmployee = employees[i];
            }
        }
        return minSalaryEmployee;
    }

    public static Employee findEmployeeWithMaxSalary(Employee[] employees) {
        Employee maxSalaryEmployee = employees[0];
        for (byte i = 0; i < Employee.idCounter; i++) {
            if (employees[i].getSalary() > maxSalaryEmployee.getSalary()) {
                maxSalaryEmployee = employees[i];
            }
        }
        return maxSalaryEmployee;
    }

    public static double calculateAverageSalary(Employee[] employees) {
        double totalCost = calculateTotalMonthlyCost(employees);
        return totalCost / Employee.idCounter;
    }

    public static void printFullNames(Employee[] employees) {
        System.out.println("ФИО сотрудников:");
        for (byte i = 0; i < Employee.idCounter; i++) {
            System.out.println(employees[i].getName());
        }
    }
}