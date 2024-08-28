public class Main {
    public static void main(String[] args) {

        Gerente gerente = new Gerente("Alice", 5000.0);
        System.out.println("Bônus do Gerente: R$ " + gerente.calcularBonus());

        Desenvolvedor desenvolvedor = new Desenvolvedor("Bob", 3000.0);
        System.out.println("Bônus do Desenvolvedor: R$ " + desenvolvedor.calcularBonus());

        gerente.trabalhar();
        desenvolvedor.trabalhar();
    }
}