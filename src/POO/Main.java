package POO;

public class Main {
    public static void main(String[] args) {
        Carro c1 = new Carro();
        Carro c2 = new Carro();

        c1.setMarca("Porsche");
        c1.setModelo("Cayenne");
        c1.setAno(2025);
        c1.setKm(0);
        c1.setCor("Preto");
        c1.setPreco(2000000);


        c2.setMarca("Ford");
        c2.setModelo("Escort");
        c2.setAno(1994);
        c2.setKm(60000);
        c2.setCor("Azul");
        c2.setPreco(8000);

        c1.exibirAnuncio();
        System.out.println("--------");
        c2.exibirAnuncio();

        c1.simularSeguro(3);

        System.out.println("Calculando Ipva");
        double ipvaC1 = c1.calcularIPVA();
        double ipvaC2 = c2.calcularIPVA();
        System.out.println("O IPVA do C1 É: " + ipvaC1);
        System.out.println("O IPVA do C2 É: " + ipvaC2);
    }
}
