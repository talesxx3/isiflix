package ENUM;

public class Loja {
    public static void main(String[] args) {
        Pedido p1 = new Pedido(2980, "20/08/2025", 7, "Cristiano", Status.NOVO);

        System.out.println(p1.exibir());
        p1.setStatus(Status.FINALIZADO);

        System.out.println(p1.exibir());
    }
}
