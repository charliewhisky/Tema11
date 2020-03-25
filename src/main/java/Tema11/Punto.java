package Tema11;

public class Punto {
    private double x;
    private double y;

    public Punto() {
        x = 3.2;
        y = 4.5;
    }

    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
            this.y = y;
    }

    public double distancia(Punto p2) {
        double distancia = Math.sqrt(Math.pow((p2.getX() - this.x), 2) + Math.pow((p2.getY() - this.y), 2));
        return distancia;
    }

    public String toString() {
        return "(" + this.x + "," + this.y + ")";
        }
    }

