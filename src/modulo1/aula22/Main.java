public class Main {
   public static void main(String[] args) {
       Produto prod1 = new Produto();
       Eletrodomestico eletro1 = new Eletrodomestico();
       eletro1.voltagem = "220v";

       Produto produto2 = eletro1;
       Produto produto3 = new Eletrodomestico();

       Eletrodomestico eletro2 = (Eletrodomestico)produto2;

       Object obj1 = eletro2;
       Eletrodomestico eletro3 = (Eletrodomestico)obj1;
       imprimir(eletro3);
   } 
   public static void imprimir(Object obj){
        System.out.println(obj.getClass());
        
   }
}
