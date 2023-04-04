package aula02;

import javax.swing.*;

public class Pessoa {
    private String nome;
    private String fone;

    //Sobrecarga de construtores
    public Pessoa(){}

    public Pessoa(String nome, String fone) {
        this.nome = nome;
        this.fone = fone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }
    //Método void não retorna nada
    public void show(){
//        System.out.println("Nome: "+nome+"\nTelefone: "+fone);
        JOptionPane.showMessageDialog(null,"Nome: "+nome+"\nTelefone: "+fone );
    }
}
