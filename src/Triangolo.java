public class Triangolo implements Forma {
    private double base = 3;
    private double altezza = 5;

    public Triangolo (double base, double altezza) {
        this.base = base;
        this.altezza = altezza;

    }

public void calcolaForma() {
    double area = altezza*base;
    System.out.println("Area del Triangolo "+area);

    }
}


