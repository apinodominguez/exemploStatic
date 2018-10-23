package boletin4_1;

public class Coche {
    private int velocidade;
    //Constructor
    public Coche(){
        velocidade = 100;
            
    }
    public void setVelocidade(int v){
        velocidade = v;
    }
    public float getVelocidade(){
        return this.velocidade;
    }
    public void acelerar(int valor){
        velocidade = velocidade + valor;
        
    }
    public void frenar (int menos){
        velocidade = velocidade - menos;
    }
}
