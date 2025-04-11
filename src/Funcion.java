public class Funcion {
    //Atributos para nuestro ejemplo
    double radio;
    int altura;
    int lado;
    short base;
    //Metodos para nuestro ejemplo

    public short calcularCubo(short base) {
        return (short) (base * base * base);
    }

    public int calcularArea(int lado) {
        return (lado * lado);
    }

    public int calcularAreatriangulo(int base, int lado) {
        return (base * altura / 2);
    }

    public int calcularVolumenCubo(int lado) {
        return (lado * lado * lado);
    }

    public double calcularVolumenEsfera(double radio){
        return (4/3*Math.PI*radio*radio*radio);
    }
    public double calcularPerimetroCirculo( double radio){
        return (2*Math.PI*radio);
    }
    public int calcularPerimetroPentagonal(int lado){
        return(5*lado);
    }
}
