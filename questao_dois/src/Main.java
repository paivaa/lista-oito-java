public class Main {
    public static void main(String[] args) {

        Desconto produto1 = new Desconto("arroz", 5, 1);

        System.out.println(produto1.getPreco());
        produto1.aplicarDesconto(-50);
        System.out.println(produto1.getPreco());
    }
}