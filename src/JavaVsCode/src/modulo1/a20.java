package modulo1;

public class a20 {
    public static void main(String[] args) {
        int s1 = somar(10,8);
        int s2 = somar(2,3);
        int s3 = somar(2,5);
        int media = (s1,s2,s3)/3;
    }
     static int somar(int n1,int n2){
        int resultado = n1+n2;
        System.out.println(resultado);
        return resultado;
     }
    
}
