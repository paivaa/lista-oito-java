public class Main {
    public static void main(String[] args) {

        IMeioTransporte[] meiosTransporte = new IMeioTransporte[3];
        meiosTransporte[0] = new Carro();
        meiosTransporte[1] = new Bicicleta();
        meiosTransporte[2] = new Trem();

        // Percorrendo o array e chamando acelerar() e frear() para cada objeto
        for (IMeioTransporte transporte : meiosTransporte) {
            transporte.acelerar();
            transporte.frear();
            System.out.println(); // Apenas para separação de saída no console
        }
    }
}