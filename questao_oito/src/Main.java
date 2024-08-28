public class Main {
    public static void main(String[] args) {

        Empresa empresa = new Empresa();

        // Adicionando funcionários à empresa
        Funcionario f1 = new Estagiario("Ana", 1500);
        Funcionario f2 = new Desenvolvedor("Bruno", 4000);
        Funcionario f3 = new Gerente("Carlos", 8000);

        empresa.adicionarFuncionario(f1);
        empresa.adicionarFuncionario(f2);
        empresa.adicionarFuncionario(f3);

        // Calculando a folha de pagamento inicial
        System.out.println("Folha de Pagamento Inicial:");
        empresa.calcularFolhaPagamento();
        System.out.println();

        // Promovendo funcionários
        empresa.promoverFuncionario(f1); // Estagiário para Desenvolvedor
        empresa.promoverFuncionario(f2); // Desenvolvedor para Gerente
        empresa.promoverFuncionario(f3); // Gerente (não pode ser promovido)

        System.out.println("\nFolha de Pagamento Após Promoções:");
        empresa.calcularFolhaPagamento();
    }
}