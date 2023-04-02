package javapoo.metodos;

public class Main {
    public static void main(String[] args){
        Calculadora calc = new Calculadora();
        //Soma
        System.out.println(calc.soma(2, 6));
        //Multiplicação
        System.out.println(calc.multiplicar(4, 9));

        //Array
        int[] numeros = {1, 2, 3, 4, 5};
        calc.somaArray(numeros);

        //Varargs
        calc.somaVarargs(2, 4, 6);
    }
}
