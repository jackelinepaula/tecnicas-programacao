package aula02;

import javax.swing.*;

public class Main {
    public static void main(String[] args){

        Cliente cliente = new Cliente("Jaaj", "4002-8922", 1200.49f);
        cliente.print();

        JOptionPane.showMessageDialog(null, "Juros: "+cliente.calcularJuros(1.5f));


        Fornecedor fornecedor = new Fornecedor("Vivo", "2355-6653", 1500.60f);
        fornecedor.calcularImposto(12.5f);

        fornecedor.print();
    }
}
