package javapoo.metodos;

public class Calculadora {

    public int soma(int n1, int n2){
        return n1 + n2;
    }

    public double multiplicar(double n1, double n2){
        return n1 * n2;
    }

    //Varargs
    public void somaArray(int[] numeros){
        int soma = 0;

        for(int i = 0; i < numeros.length; i++){
            soma += numeros[i];
        }

        System.out.println(soma);
    }
    //Varargs
    public void somaVarargs(int... numeros){
        int soma = 0;

        for(int i = 0; i < numeros.length; i++){
            soma += numeros[i];
        }

        System.out.println(soma);
    }
}
