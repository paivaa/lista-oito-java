import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private List<Funcionario> funcionarios;

    public Empresa() {
        this.funcionarios = new ArrayList<>();
    }

    public void adicionarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    public void promoverFuncionario(Funcionario funcionario) {
        if (funcionario instanceof Estagiario) {
            Desenvolvedor novoDesenvolvedor = new Desenvolvedor(funcionario.getNome(), funcionario.getSalarioBase());
            funcionarios.remove(funcionario);
            funcionarios.add(novoDesenvolvedor);
            System.out.println(funcionario.getNome() + " foi promovido a Desenvolvedor.");
        } else if (funcionario instanceof Desenvolvedor) {
            Gerente novoGerente = new Gerente(funcionario.getNome(), funcionario.getSalarioBase());
            funcionarios.remove(funcionario);
            funcionarios.add(novoGerente);
            System.out.println(funcionario.getNome() + " foi promovido a Gerente.");
        } else {
            System.out.println(funcionario.getNome() + " já é um Gerente e não pode ser promovido.");
        }
    }

    public double calcularFolhaPagamento() {
        double totalSalarios = 0;
        double totalBonus = 0;

        for (Funcionario funcionario : funcionarios) {
            totalSalarios += funcionario.calcularSalario();
            totalBonus += funcionario.calcularBonus();
        }

        double totalFolha = totalSalarios + totalBonus;
        System.out.println("Total de Salários: R$ " + totalSalarios);
        System.out.println("Total de Bônus: R$ " + totalBonus);
        System.out.println("Total da Folha de Pagamento: R$ " + totalFolha);

        return totalFolha;
    }
}
