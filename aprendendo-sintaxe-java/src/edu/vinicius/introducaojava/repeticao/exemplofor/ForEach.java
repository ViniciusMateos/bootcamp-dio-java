package edu.vinicius.introducaojava.repeticao.exemplofor;

public class ForEach {
    public static void main(String[] args) {
        String alunos [] =  {"FELIPE","JONAS","JULIA","MARCOS"};
        
            //Forma abreviada
            // A cada repetição a variável (aluno) terá o valor da posição do array (alunos) em sequência
        for(String aluno : alunos) {
          System.out.println("Nome do aluno é: " + aluno);
        }
    
    }
}
