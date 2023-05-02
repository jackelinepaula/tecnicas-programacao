package revisao_projeto_ed;

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
    }

}
