package controllers;
import modells.Calculadora;

public class CalculadoraController {
    public int soma(Calculadora c){
        int resultado = c.numero1+c.numero2;
        return resultado;

    }
}
