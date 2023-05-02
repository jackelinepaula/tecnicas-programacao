package revisao_projeto_ed;

import java.util.Arrays;
import java.util.ArrayList;

public class Main {

    public static void main( String[] args){
        Vetor vetor = new Vetor(4);

        //(1) Alternativa de print
//        int i = 0;
//        while(i < vetor.tamanho()){
//            System.out.println(vetor.toSring(i));
//            i++;
//        }

        try{
            vetor.adiciona("Jaaj");
            vetor.adiciona("Doug");
            vetor.adiciona("Guga");


            //Busca por elemento
            System.out.println("Elemento está na posição: "+vetor.buscaString("Jaaj"));

            //Busca por posição
            System.out.println("Elemento encontrado: "+vetor.busca(2));

            //Fura-fila
            vetor.adiciona(1, "Vic");
            System.out.println("Fura-fila: "+vetor.busca(1));

        }catch (Exception erro){
            erro.printStackTrace();
        }


        //------------- Array List -------------

        ArrayList<String> arrayList = new ArrayList<String>();

        arrayList.add("Elemento A");
        arrayList.add("Elemento C");

        System.out.println(arrayList);

        arrayList.add(1, "Elemento B");

        System.out.println("\n" + arrayList);

        System.out.println(arrayList.get(1));

        System.out.printf("tamanho do vetor:"+ arrayList.size());

        boolean existe = arrayList.contains("Elemento ");

        if (existe) {
            System.out.println("\nElemento encontrado no vetor");
        } else {
            System.out.println("\nElemento não existe no vetor");
        }

        int posicao= arrayList.indexOf("Elemento C");
        if (posicao> -1){
            System.out.println("Elemento encontrado na posição: "+ posicao);
        }
        else{
            System.out.println("Elemento não existe no vetor");
        }

        System.out.println(arrayList);

        arrayList.remove(0);
        arrayList.remove("Elemento C");

        System.out.println(arrayList);
    }

}
