package modulo1;
public class a6 {
    public static void main(String[] args){
        boolean executa = false;
        if(executa){
            System.out.println("Entrou no if");
        }
        boolean verdade = true;
        // exclamação usada para negar algo;
        if(!verdade){
            System.out.println("Entrou no segundo if");
        }
        
        if(executa || verdade){
            System.out.println("Entrou no terceiro if");
        }
        if(executa && verdade){
            System.out.println("Entrou no quarto if");
        }
    }
}
