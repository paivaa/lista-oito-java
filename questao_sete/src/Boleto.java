public class Boleto extends FormaPagamento{
    @Override
    public void processarPagamento(double valor) {
        if (validarPagamento()) {
            System.out.println("Pagamento de R$ " + valor + " realizado com Boleto.");
        } else {
            System.out.println("Falha na validação do pagamento com Boleto.");
        }
    }

    @Override
    public boolean validarPagamento() {
        System.out.println("Validando pagamento com Boleto...");
        return Math.random() > 0.5;
    }
}
