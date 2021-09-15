package modulo1.Pratica.Exercicio;

import javax.print.attribute.standard.NumberOfDocuments;
import java.util.Scanner;

public class Exercicio4_while {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("-------------------Cadastro Cliente--------------------");
        System.out.println("---------------------Bem vindo-------------------------");
        System.out.println("Escolha uma opção: \n 1-Cadastrar Cliente \n 2-Listar Clientes \n 3-Sair");
        int opcao = sc.nextInt();

        switch(opcao){
            case 1:
                boolean validacaoN = true;
                boolean validacaoS = true ;
                boolean validacaoR = true ;
                boolean validacaoC = true ;

                do{
                    System.out.print("Informe o nome do cliente:");
                    String nome = sc.next();
                    if(nome.length() < 3){
                        System.out.println("O nome cadastrado deve ter no mínimo três caracteres");
                    }else{
                        validacaoN = false;
                    }
                }while(validacaoN);



                do{
                    System.out.print("Informe o sobrenome do cliente:");
                    String nome = sc.next();
                    if(nome.length() < 3){
                        System.out.println("O sobrenome cadastrado deve ter no mínimo três caracteres");
                    }else{
                        validacaoS = false;
                    }
                }while(validacaoS);


                do{
                    System.out.print("Informe o RG do cliente:");
                    String nome = sc.next();
                    if(nome.length() < 4){
                        System.out.println("O RG cadastrado deve ter no mínimo quatro caracteres");
                    }else{
                        validacaoR = false;
                    }
                }while(validacaoR);


                do{
                    System.out.print("Informe o CPF do cliente:");
                    String nome = sc.next();
                    if(nome.length() < 11){
                        System.out.println("O CPF cadastrado deve ter no mínimo onze caracteres");
                    }else{
                        validacaoC = false;
                    }
                }while(validacaoC);
                System.out.println("O cliente foi cadastrado com sucesso!");
            break;

            case 2:
                System.out.println("Listagem de clientes");
            break;

            case 3:
                System.out.println("Saindo");
            break;
        }

    }
}
