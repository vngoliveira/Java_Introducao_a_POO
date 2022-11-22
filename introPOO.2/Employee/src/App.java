import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Employee employee = new Employee();

        System.out.println("Informe os seguintes dados:");
        System.out.print("Nome:");
        employee.nome = sc.nextLine();
        System.out.print("Salario bruto:");
        employee.salario = sc.nextDouble();
        System.out.print("Imposto:");
        employee.imposto = sc.nextDouble();

        System.out.println("Employee: " + employee);
        System.out.print("Qual a porcentagem de aumento no salario?");
        employee.aumento = sc.nextDouble();
        System.out.println("Updated data: " + employee);

        sc.close();
    }
}
