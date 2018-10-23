package boletin4_1;

public class Boletin4_1 {

    public static void main(String[] args) {
        Coche obxCons1 = new Coche ();
        obxCons1.setVelocidade(100);
        obxCons1.acelerar(50);
        obxCons1.frenar(75);
        System.out.println("La Velocidad final del coche es de: " + obxCons1.getVelocidade());
        }
    
}
