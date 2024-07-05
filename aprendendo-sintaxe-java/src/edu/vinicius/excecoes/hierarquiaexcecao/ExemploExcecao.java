package edu.vinicius.excecoes.hierarquiaexcecao;

import java.text.NumberFormat;
import java.text.ParseException;

public class ExemploExcecao {

    /*
     * Uma exceção checada é o risco dela ser disparada, interrompendo a execução
     * 
     */

    public static void main(String[] args) {
        Number valor = Double.valueOf("a1.75");

        try {
            valor = NumberFormat.getInstance().parse("a1.75"); // Nessa linha por ser uma exceção checada, ela terá de ser tratada atravpes de Try/Catch
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        System.out.println(valor);
       
    }
}
