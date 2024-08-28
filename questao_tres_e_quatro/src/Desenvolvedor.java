public class Desenvolvedor extends Funcionario {
    public Desenvolvedor(String nome, double salario) {
        super(nome, salario);
    }

    public double calcularBonus(){
        return (salario*10)/100;
    }

    @Override
    public void trabalhar(){
        System.out.println("Sou dev e estou devendo.");
    }
}
