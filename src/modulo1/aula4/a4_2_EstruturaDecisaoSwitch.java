package modulo1.aula4;

public class a4_2_EstruturaDecisaoSwitch {
    public static void main(String args[]){
        int idade = 20;

        switch (idade){
            case 1:
                System.out.println("Valor 1");
            break;
            case 5:
                System.out.println("Valor 5");
            break;
            case 10:
                System.out.println("Valor 10");
            break;
            default:
                System.out.printf("Valor default %d",idade);
        }
    }
}
