public class Estagiario extends Funcionario {

    public Estagiario(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public double calcularSalario() {
        // Estagiário recebe apenas o salário base
        return getSalarioBase();
    }

    @Override
    public double calcularBonus() {
        // Estagiário não recebe bônus
        return 0;
    }
}
