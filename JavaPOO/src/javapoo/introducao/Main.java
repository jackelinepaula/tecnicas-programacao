package javapoo.introducao;

public class Main {
    public static void main(String [] args){
        Pessoa pessoa = new Pessoa();

        //Variável de referência
        //Variável 'pessoa' é como um controle remoto para acessar atributos e métodos na
        // classe Pessoa
        pessoa.nome = "Jackeline";
        pessoa.sexo = 'F';
        pessoa.idade = 19;

        //Exercício
        Carro carro = new Carro();

        carro.nome = "Fiat";
        carro.modelo = "Uno";
        carro.ano = 2007;

        System.out.println(carro.nome);
        System.out.println(carro.modelo);
        System.out.println(carro.ano);
    }
}
