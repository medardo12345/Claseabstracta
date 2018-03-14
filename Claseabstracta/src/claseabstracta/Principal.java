

    package claseabstracta;
    
import java.util.Scanner;

public class Principal {
    public static void main(String[] args){
        Scanner r = new Scanner(System.in);
        
        Triangulo triangulo = new Triangulo(scanner(" ladoA triangulo:"), 
                                            scanner("ladoB triangulo:"), 
                                            scanner("ladoC triangulo:"),
                                            scanner("h triangulo:"));
        
        Cuadrado cuadrado = new Cuadrado(scanner("lado cuadrado:"));
        
        Rectangulo rectangulo = new Rectangulo(scanner("ladoA rectangulo:"),
                                                scanner("ladoB rectangulo:"));
        System.out.println("\n \n");
        System.out.println(triangulo.calcularPerimetro());
        System.out.println(triangulo.calcularArea());
        System.out.println(cuadrado.calcularPerimetro());
        System.out.println(cuadrado.calcularArea());
        System.out.println(rectangulo.calcularPerimetro());
        System.out.println(rectangulo.calcularArea());
    }
    
    public static int scanner(String print){
        System.out.println(print);
        Scanner r = new Scanner(System.in);
        return r.nextInt();
    }
    
}

