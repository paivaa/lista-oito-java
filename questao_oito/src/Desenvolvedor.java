public class Desenvolvedor extends Funcionario {

    public Desenvolvedor(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public double calcularSalario() {
        // Desenvolvedor recebe 30% adicional no salário base
        return getSalarioBase() * 1.3;
    }

    @Override
    public double calcularBonus() {
        // Desenvolvedor recebe um bônus de 10% do salário base
        return getSalarioBase() * 0.1;
    }
}
