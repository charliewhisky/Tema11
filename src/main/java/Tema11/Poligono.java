package Tema11;

import java.util.ArrayList;

public class Poligono {
    private ArrayList<Punto> listaPuntos;

    public Poligono(ArrayList listaPuntos) {
        this.listaPuntos = listaPuntos;
    }

    public void traslada(double x, double y){
        for (int i = 0; i < listaPuntos.size() ; i++) {
            x = listaPuntos.get(i).getX() + x;
            listaPuntos.get(i).setX(x);
            y = listaPuntos.get(i).getY() + y;
            listaPuntos.get(i).setY(y);
        }
    }

    public int numVertex(){
        return listaPuntos.size();
    }

    public double perimetro(){
        double perimetro = 0;
        for (int i = 0; i < listaPuntos.size()-1; i++) {
            perimetro = perimetro + listaPuntos.get(i).distancia(listaPuntos.get(i+1));
        }
        perimetro+=2;
        return perimetro;
    }

    public String toString(){
        return "Esquina 1 = "+"("+ listaPuntos.get(0).getX()+" , "+listaPuntos.get(0).getY()+") \n" +
                "Esquina 2 = "+"("+ listaPuntos.get(1).getX()+" , "+listaPuntos.get(1).getY()+") \n" +
                "Esquina 3 = "+"("+ listaPuntos.get(2).getX()+" , "+listaPuntos.get(2).getY()+") \n" +
                "Esquina 4 = "+"("+ listaPuntos.get(3).getX()+" , "+listaPuntos.get(3).getY()+")";
    }
}
