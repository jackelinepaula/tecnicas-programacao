import javax.swing.*;

public class Produto {
    String marca;
    float valor;
    int quantidade;

    //Construtor

    public Produto(String marca, float valor){
        this.marca = marca;
        this.valor = valor;
    }

    void imprimirDados(){
        JOptionPane.showMessageDialog(null, "Dados do produto: "+
                "\nMarca: " + marca +
                "\nValor: R$"+ valor);
    }

    float calcularImposto(float p){
        return valor*p/100;
    }

}
