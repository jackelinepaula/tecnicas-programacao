import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Consumo consumo;

        Double valor = Double.parseDouble(JOptionPane.showInputDialog
                (null, "Digite o seu consumo em KWh:"));

        consumo = new Consumo(valor);
        consumo.iniciarCalculos();
    }
}