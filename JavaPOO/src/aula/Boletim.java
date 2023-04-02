package aula;

import javax.swing.*;

public class Boletim {

    double n1;
    double n2;
    double media;

//    public aula.Boletim(double n1, double n2){
//        this.n1 = n1;
//        this.n2 = n2;
//    }

    public Boletim (){
        n1 = 0;
        n2 = 0;
    }

    void getNotas(){
        n1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a primeira nota"));
        n2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a segunda nota"));
    }

    void imprimeBoletim(){
        getNotas();
        calculaMedia();
        JOptionPane.showMessageDialog(null, "Dados do boletim: "+
                "\nNota 1: "+n1+
                "\nNota 2: "+n2+
                "\nMedia: "+media+
                "\nConceito: "+ verificarConceito());
    }

    void calculaMedia(){
        media=(n1+n2)/2;
    }

    String verificarConceito(){
        String conceito = "";
        if(media >= 8 && media <= 10){
            conceito = "A";
        }
        else if(media >= 6){
            conceito = "B";
        }
        else if(media >= 4){
            conceito = "C";
        }
        else{
            conceito = "D";
        }
        return conceito;
    }

}
