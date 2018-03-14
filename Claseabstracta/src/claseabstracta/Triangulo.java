

package claseabstracta;

public class Triangulo extends Claseabstracta{
    
    int ladoA;
    int ladoB;
    int ladoC;
    int h;

    public Triangulo(int ladoA, int ladoB, int ladoC,int h) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
        this.h = h;
    }
    
    @Override
    int calcularPerimetro(){
        return ladoA+ladoB+ladoC;
    }
    
    @Override
    int calcularArea() {
        return (ladoA*h)/2;
    }
}
