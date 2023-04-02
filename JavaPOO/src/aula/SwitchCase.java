package aula;

import javax.swing.*;
import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um número de 1 a 4");

        int n = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número de 1 a 4"));


        switch (n){
            case 1:
//                System.out.println("Você escolheu 1");
                JOptionPane.showMessageDialog(null, "Você escolheu 1");
                break;

            case 2:
//                System.out.println("Você escolehu 2");
                JOptionPane.showMessageDialog(null, "Você escolheu 1");
                break;

            case 3:
//                System.out.println("Você escolheu 3");
                JOptionPane.showMessageDialog(null, "Você escolheu 1");
                break;

            case 4:
//                System.out.println("Você escolheu 4");
                JOptionPane.showMessageDialog(null, "Você escolheu 1");
                break;

            default:
                System.out.println("Número inválido");
        }
    }
}
