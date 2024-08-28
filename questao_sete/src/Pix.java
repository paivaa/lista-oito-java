public class Pix extends FormaPagamento{
    @Override
    public void processarPagamento(double valor) {
        if (validarPagamento()) {
            System.out.println("Pagamento de R$ " + valor + " realizado com Pix.");
        } else {
            System.out.println("Falha na validação do pagamento com Pix.");
        }
    }

    @Override
    public boolean validarPagamento() {
        System.out.println("Validando pagamento com Pix...");
        return Math.random() > 0.4;
    }
}
