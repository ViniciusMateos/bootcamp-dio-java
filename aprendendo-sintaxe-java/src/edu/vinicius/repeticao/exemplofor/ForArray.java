package edu.vinicius.repeticao.exemplofor;

public class ForArray {
    
    // Array é um conjunto de elementos de um tipo (String) correspondente.

    public static void main(String[] args) {
        String alunos[] = { "FELIPE", "JONAS", "JULIA", "MARCOS" };
    
        
        for (int x=0; x<alunos.length; x++) { //LENGTH é tamanho, nesse caso, seria o tamanho do array (quantidade de elementos)
            System.out.println("O aluno no indice x=" + x + " é " + alunos[x]); // Juntamente com o valor de x sendo a posição do array ele puxa quem está em determinada posição dentro do mesmo.
        }
    
    }

}
