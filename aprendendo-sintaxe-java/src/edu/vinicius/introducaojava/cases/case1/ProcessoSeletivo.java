package edu.vinicius.introducaojava.cases.case1;

public class ProcessoSeletivo {

    public static void main(String[] args) {
        //salario base maior que salario pretendido
        analisarCandidato(1900.0);
        
        //salario base igual que salario pretendido
        analisarCandidato(2000.0);
        
        //salario base igual que salario pretendido
        analisarCandidato(2200.0);
    }
    
    static void analisarCandidato(double salarioPretendido) {
        
        double salarioBase = 2000.0;

        if(salarioBase > salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO");
        }
        else if(salarioBase == salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
        }
        else {
            System.out.println("AGUARDANDO RESULTADO DOS DEMAIS CANDIDATOS");
        }
        }
    
}
