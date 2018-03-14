
package claseabstracta;

public class Cuadrado extends Claseabstracta{
    int ladoA;
    
    public Cuadrado(int ladoA) {
        this.ladoA = ladoA;
    }
    
    @Override
    int calcularPerimetro(){
        return ladoA*4;
    }
    
    @Override
    int calcularArea() {
        return ladoA*ladoA;
    }
}
