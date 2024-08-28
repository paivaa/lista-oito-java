public class Gerente extends Funcionario {

    public Gerente(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public double calcularSalario() {
        // Supondo que o gerente tenha um adicional de 50% sobre o salário base
        return getSalarioBase() * 1.5;
    }

    @Override
    public double calcularBonus() {
        // Gerente recebe um bônus de 20% do salário base
        return getSalarioBase() * 0.2;
    }
}
