package modulo1;

public class a9 {
    public static void main(String[] args) {
        int repeticao = 0;
        while(repeticao < 5){
            System.out.printf(" \n repeticao %d",repeticao);
            repeticao = repeticao +1; // faz que não fique em loop 
        }

        while(repeticao < 5){
            System.out.printf(" \n repeticao %d",repeticao);
            repeticao +=  1; // não precisa repetir a variavel, se colocar o + na frente, significa que é a variável +1
        }
    }
    
}
