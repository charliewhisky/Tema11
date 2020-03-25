package Tema11;

import java.util.ArrayList;

public class Ejercicio2 {
    private ArrayList<Punto> RellenaPoligono = new ArrayList<>();

    public Ejercicio2() {
        rellenador();
        Poligono miPoligono = new Poligono(RellenaPoligono);
        System.out.println(miPoligono.toString());
        System.out.println("Perimetro: "+miPoligono.perimetro());
        miPoligono.traslada(4,-3);
        System.out.println(miPoligono.toString());
        System.out.println("Perimetro: "+miPoligono.perimetro());

    }
    public void rellenador(){
        Punto punto1 = new Punto(0,0);
        Punto punto2 = new Punto(2,0);
        Punto punto3 = new Punto(2,2);
        Punto punto4 = new Punto(0,2);
        RellenaPoligono.add(punto1);
        RellenaPoligono.add(punto2);
        RellenaPoligono.add(punto3);
        RellenaPoligono.add(punto4);
    }
}
