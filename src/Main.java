//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //Crear un objeto de tipo funciono llamado algoraro
        Funcion algoraro = new Funcion();
        algoraro.altura=8;
        algoraro.base=10;
        algoraro.lado=15;
        algoraro.radio=5;

        short cubo = algoraro.calcularCubo(algoraro.base);
        int area = algoraro.calcularArea(algoraro.lado);
        int areatriangulo = algoraro.calcularAreatriangulo(algoraro.base, algoraro.altura);
        int volumenCubo =  algoraro.calcularVolumenCubo(algoraro.lado);
        double volumenEsfera= algoraro.calcularVolumenEsfera(algoraro.radio);
        double perimetroCirculo= algoraro.calcularPerimetroCirculo(algoraro.radio);
        int perimetroPentagonal= algoraro.calcularPerimetroPentagonal(algoraro.lado);

        //mostar valores de cada calculo
        System.out.println("el cubo es: " +cubo);
        System.out.println("el area es: " +area);
        System.out.println("el area del triangulo es :" +areatriangulo);
        System.out.println("el volumen del cubo es: " +volumenCubo);
        System.out.println("el volumen de la esfera es: " +volumenEsfera);
        System.out.println("el perimetro del circulo es : " +perimetroCirculo);
        System.out.println("el perimetro pentagonal es : " +perimetroPentagonal);

    }

}