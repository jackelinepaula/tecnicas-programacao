package aula02.desafio01;

public class Quadrado {
    private float base;

    //Construtor
    public Quadrado(float b){
        this.base = b;
    }

    //Métodos de acesso
    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float perimetro(){
        return base * 4;
    }

    public float area(){
        return base * base;
    }

    public void mostra(){
        System.out.println("Base: "+ base + "\nPerimetro: " + perimetro() + "\nArea: " + area());
    }
}
