public class Desconto extends Produto{

    public Desconto(String nome, double preco, int quantidade) {
        super(nome, preco, quantidade);
    }

    public void aplicarDesconto(double porcentagem){
        if(porcentagem > 50){
            throw new IllegalArgumentException("O desconto não pode ser superior a 50%");
        }
        if(porcentagem < 0){
            throw new IllegalArgumentException("O desconto não pode ser negativo");
        }

        double desconto = (super.getPreco()*porcentagem)/100;
        super.setPreco(super.getPreco()-desconto);
    }
}
