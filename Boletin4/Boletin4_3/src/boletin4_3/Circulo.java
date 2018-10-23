package boletin4_3;

public class Circulo {
    private double radio;
    final private double pi = 3.14;    
Circulo(){
    radio = 0;
    }    

Circulo(double r){
    radio = r;
}

public void setRadio(double r){
    radio = r;
}

public double getRadio(){
    return radio;
}

public void calcularArea(){
    double area;
    area = Math.pow(radio, 2)*pi;
    System.out.println("El area es de: " + area + "m²");
}

public void calcularLongitud(){
    double longitud;
    longitud = 2*pi*radio;
    System.out.println("El area es de: " + longitud + "m");
}

}
