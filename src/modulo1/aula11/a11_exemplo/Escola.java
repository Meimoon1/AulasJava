package a11_exemplo;

public class Escola {
    public static void main(String[] args) {
        Boletim b = new Boletim();
        b.salvarMedia(1, 5.1, 9.0, 8.5);
        b.salvarMedia(2, 4.5, 5.6, 10.0);
        b.imprimirBoletim();

    }
}
