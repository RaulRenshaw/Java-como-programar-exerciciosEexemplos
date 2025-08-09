package Capitulo_03;

public class EmployeeTest {
    public static void main(String[] args) {
        // Criando dois objetos Employee
        Employee emp1 = new Employee("João", "Silva", 3000.00);
        Employee emp2 = new Employee("Maria", "Souza", 4500.00);

        // Exibindo salários anuais iniciais
        System.out.println("Salário anual dos funcionários:");
        System.out.println(emp1.getName() + " " + emp1.getLastname() + ": R$ " + (emp1.getSalary() * 12));
        System.out.println(emp2.getName() + " " + emp2.getLastname() + ": R$ " + (emp2.getSalary() * 12));
        System.out.println();

        // Aplicando aumento de 10%
        emp1.setSalary(emp1.getSalary() * 1.10);
        emp2.setSalary(emp2.getSalary() * 1.10);

        // Exibindo salários anuais após o aumento
        System.out.println("Salário anual após 10% de aumento:");
        System.out.println(emp1.getName() + " " + emp1.getLastname() + ": R$ " + (emp1.getSalary() * 12));
        System.out.println(emp2.getName() + " " + emp2.getLastname() + ": R$ " + (emp2.getSalary() * 12));
    }
}
