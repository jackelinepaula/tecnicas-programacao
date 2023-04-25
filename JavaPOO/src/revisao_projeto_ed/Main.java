package revisao_projeto_ed;

public class Main {

    public static void main( String[] args) throws Exception {
        Vetor vetor = new Vetor(3);

        vetor.adiciona("Jaaj");
        vetor.adiciona("Doug");
        vetor.adiciona("Guga");


        //(1) Alternativa de print
//        int i = 0;
//        while(i < vetor.tamanho()){
//            System.out.println(vetor.toSring(i));
//            i++;
//        }

        System.out.println(vetor.busca(2));
    }

}
