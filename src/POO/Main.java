package POO;

public class Main {
    public static void main(String[] args) {
        // Inicializando com construtor
        Carro c1 = new Carro("Porsche","Cayenne",2025,"Preto",0,2000000);
        Carro c2 = new Carro("Ford","Escort",1994,"Azul",60000,8000);

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
