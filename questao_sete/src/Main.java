import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<FormaPagamento> formasDePagamento = new ArrayList<>();

        formasDePagamento.add(new CartaoCredito());
        formasDePagamento.add(new Boleto());
        formasDePagamento.add(new Pix());

        double valorPagamento = 150.00;

        for (FormaPagamento forma : formasDePagamento) {
            forma.processarPagamento(valorPagamento);
            System.out.println();
        }
    }
}