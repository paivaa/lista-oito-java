public class Gerente extends Funcionario{
    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    public double calcularBonus(){
        return (salario*20)/100;
    }

    @Override
    public void trabalhar(){
        System.out.println("Sou gerente e estou gerenciando.");
    }
}
