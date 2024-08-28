public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto("arroz", 1.98, 1);

        System.out.println(produto1.getNome());
        System.out.println(produto1.getPreco());
        System.out.println(produto1.getQuantidade());
    }
}