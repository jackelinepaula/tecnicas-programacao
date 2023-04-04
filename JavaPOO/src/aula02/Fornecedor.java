package aula02;

import javax.swing.*;

public class Fornecedor extends Pessoa{
    private float valorCompra;

    public Fornecedor(String nome, String fone, float valorCompra){
        super(nome, fone);
        this.valorCompra = valorCompra;
    }

    public float getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(float valorCompra) {
        this.valorCompra = valorCompra;
    }

    public void print(){
        super.show();
        JOptionPane.showMessageDialog(null, "Valor da compra: "+valorCompra);
    }


    public void calcularImposto(float imposto){
        valorCompra += (valorCompra * imposto/100);
    }
}
