package boletin4_4;

public class PolboPatacas {
    private int polbo;
    private int patacas;
    
    public PolboPatacas (){
       polbo = 0;
       patacas = 0;
    }
    public PolboPatacas(int i, int j){
        polbo = i;
        patacas = j;
    }
    
    public void engadirPolbo(int x){
        polbo+= x;
    }
    
    public void engadirPatacas(int y){
        patacas+= y;
    }
    public int amosarPolbo(){
        return polbo;
    }
    public int amosarPatacas(){
        return patacas;
    }
    public void clientes(){
        int clientes;
        clientes = 3*polbo/2;
        if(clientes <= patacas){
            System.out.println("Podremos dar de comer a " + clientes + " clientes");
        }
        else{
            System.out.println("Necesitaremos más patatas para cubrir la demanda");
        }
    }
}
