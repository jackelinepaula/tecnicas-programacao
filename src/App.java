import javax.swing.*;

public class App {
    public static void main(String[] args){

//        ContaPoupanca cp;
//
//        float valorDep, rendimento, saldo, taxa;
//        String agencia, num;
//
//        agencia = JOptionPane.showInputDialog(null, "Digite o número da agência: ");
//        num = JOptionPane.showInputDialog(null, "Digite o número da conta");
//
//        saldo = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o saldo"));
//        taxa = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite a taxa de juros"));
//
//        cp = new ContaPoupanca(agencia, num, saldo, taxa);
//
//        //Usando os métodos da classe Conta Poupança
//        cp.imprimirDados();
//        rendimento = cp.rendimento();
//        JOptionPane.showMessageDialog(null, "O rendimento é: "+ rendimento);
//
//        //Depositando valor
//        valorDep = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o valor a ser depositado"));
//        cp.depositar(valorDep);
//        cp.imprimirDados();
        Produto produto;

        String marca;
        float valorProduto, valorImposto, porcentagem;

        marca = JOptionPane.showInputDialog(null, "Digite a marca do produto:");
        valorProduto = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o valor do produto:"));

        produto = new Produto(marca, valorProduto);

        produto.imprimirDados();

        //Porcentagem de imposto
        porcentagem = Float.parseFloat(JOptionPane.showInputDialog("Digite a porcentagem de imposto"));
        valorImposto = produto.calcularImposto(porcentagem);
        JOptionPane.showMessageDialog(null, "Imposto a pagar: "+ valorImposto);
    }
}
