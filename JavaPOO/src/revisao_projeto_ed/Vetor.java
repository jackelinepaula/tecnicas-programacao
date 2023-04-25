package revisao_projeto_ed;

import java.util.Arrays;

public class Vetor {
    private String[] elementos;
    private int tamanho;

    public Vetor(int capacidade){
        this.elementos = new String[capacidade];
        this.tamanho = 0;
    }

   /* Sobre posição de métodos
    O que vai diferenciar é a quatidade de parâmetros passados.*/
    public void adiciona(String elemento) throws Exception{
        if(this.tamanho < this.elementos.length){
            elementos[tamanho] = elemento;
            tamanho++;
        } else {
            throw new Exception ("O Vetor está cheio! Informação '"+elemento+"' perdida :(");
        }
    }

    public void adiciona(int posicao, String elemento){

    }

    public void remove(int posicao){

    }

    public String busca(int posicao) throws Exception{
        if(posicao >= 0 && posicao < tamanho){
            return elementos[posicao];
        } else {
            throw new Exception("Posição inválida");
        }
    }

    public int busca(String elemento){
        for(int i = 0; i < this.tamanho; i++) {
            if(elementos[i].equals(elemento)){
                return i;
            }
        }
        return -1;
    }


    public int tamanho(){
        return this.tamanho;
    }

    /*//(1)Print
    public String toSring(int posicao){
        return this.elementos[posicao];
    }*/

    /* (2)Print
    public String toSring(){
        return Arrays.toString(elementos);
    }*/

    /* (3)Print */
    @Override
   /* String Builder é uma biblioteca Java de manipulação de String */
    public String toString(){
        StringBuilder s = new StringBuilder();
        s.append("[");

        for(int i = 0; i < this.tamanho-1; i++){
            s.append(this.elementos[i]);
            s.append(", ");
        }

        if(this.tamanho > 0){
            s.append(elementos[tamanho-1]);
        }

        s.append("]");
        return s.toString();

    }


}
