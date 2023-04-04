package aula02;

import javax.swing.*;

public class Cliente extends Pessoa{
    private float valorDivida;

    public Cliente(String nome, String fone, float valorDivida) {
        super(nome, fone);
        this.valorDivida = valorDivida;
    }

    public float getValorDivida() {
        return valorDivida;
    }

    public void setValorDivida(float valorDivida) {
        this.valorDivida = valorDivida;
    }

    public void print(){
        super.show();
        JOptionPane.showMessageDialog(null, "Valor da Divida: "+valorDivida);
    }

    public float calcularJuros(float taxa){
        return valorDivida * (taxa/100);
    }

}
