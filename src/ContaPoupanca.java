import javax.swing.*;

public class ContaPoupanca {
    String agencia;
    String conta;
    float saldo;
    float taxa;

    public ContaPoupanca(String agencia, String conta, float saldo, float taxa) {
        this.agencia = agencia;
        this.conta = conta;
        this.saldo = saldo;
        this.taxa = taxa;
    }

    void imprimirDados(){
        JOptionPane.showMessageDialog(null, "Dados na Conta Poupança: "+
                "\nAgência: "+ agencia+
                "\nConta: "+ conta +
                "\nSaldo: "+ saldo +
                "\nTaxa: " + taxa );
    }

    void depositar(float valor){
        saldo = saldo + valor;
    }

    float rendimento(){
        float rendimento;
        rendimento = saldo * taxa/100;
        return rendimento;
    }

}
