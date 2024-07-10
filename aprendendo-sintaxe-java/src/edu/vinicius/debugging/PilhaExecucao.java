package.edu.vinicius.debugging;

public class Main {

    /**
     * Tem o intuito de mostrar como funciona a pilha de execução.
     * Nesse caso será possível ver que os métodos irão finalizando conforme os métodos que estão sendo chamados também forem finalizando.
     */

    public static void main(String[] args) {
        System.out.println("Iniciou do programa no método main.");
        a();
        System.out.println("Finalizou do programa no método main.");
    }

    static void a() {
        System.out.println("Entrou no método a.");
        b();
        System.out.println("Finalizou o método a.");
    }

    static void b() {
        System.out.println("Entrou no método b.");
        for(int i = 0; i <= 4; i++) System.out.println(i);
        c();
        System.out.println("Finalizou o método b.");
    }

    static void c(){
        System.out.println("Entrou no método c.");
        //Thread.dumpStack();
        System.out.println("Finalizou o método c.");
    }

}