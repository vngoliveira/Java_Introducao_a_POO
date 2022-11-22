package entities;

public class Employee{
    public double salario;
    public String nome;
    public double imposto;
    public double aumento;

    public double novoSalario(){
        return salario - imposto;
    }

    public double salarioComAumento(){
        return salario * (aumento/100);
    }

    public String toString(){
       return nome + ", $ " + salario;
    }
}
