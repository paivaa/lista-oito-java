public class CartaoCredito extends FormaPagamento{
    @Override
    public void processarPagamento(double valor) {
        if (validarPagamento()) {
            System.out.println("Pagamento de R$ " + valor + " realizado com Cartão de Crédito.");
        } else {
            System.out.println("Falha na validação do pagamento com Cartão de Crédito.");
        }
    }

    @Override
    public boolean validarPagamento() {
        System.out.println("Validando pagamento com Cartão de Crédito...");
        return Math.random() > 0.8;
    }
}
