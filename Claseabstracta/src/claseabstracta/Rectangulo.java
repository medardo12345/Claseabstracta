
package claseabstracta;


public class Rectangulo extends Claseabstracta{

    int ladoA;
    int ladoB;

    public Rectangulo(int ladoA, int ladoB) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
    }
    
    
    @Override
    int calcularPerimetro(){
        return (ladoA+ladoB)*2;
    }
    
    @Override
    int calcularArea() {
        return ladoA*ladoB;
    }
    
    
    
}
