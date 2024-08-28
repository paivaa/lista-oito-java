public class Trem implements IMeioTransporte{

    @Override
    public void acelerar() {
        System.out.println("O trem está acelerando aumentando a potência.");
    }

    @Override
    public void frear() {
        System.out.println("O trem está freando usando o sistema de freios de ar.");
    }
}
