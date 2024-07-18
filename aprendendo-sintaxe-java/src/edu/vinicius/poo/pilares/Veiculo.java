package edu.vinicius.poo.pilares;

public abstract class Veiculo { // no abstract no nosso exemplo seria o método ligar
                                // Ambas classes precisam ser ligadas, mas de maneira diferente, por exemplo
                                // entao podemos determinar uma classe abstrata "ligar()" dentro da classe Veiculo e todos que herderem dela, terão de ter um método ligar com suas respectivas características próprias.

    /* aqui para simbolizar herança, sendo itens em comuns em diversas classes
     * nesse exemplo de carro e moto, que ambos tem o atributo chassi
     * então ao inves de declarar esse atributo nas duas classes, pode criar uma com atributos em comum (chassi)
     * que servirá de herença para ambas classes.
    */
    
    private String chassi;

    public String getChassi() {
        return chassi;
    }
    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public abstract void ligar(); // como ele é abstrato, ele precisa que seja definido de fato para que ele não seja mais abstrato.

}
