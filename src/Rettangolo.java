public class Rettangolo implements Forma {
    private double larghezza = 6;
    private double altezza = 4;

    public Rettangolo(double larghezza, double altezza)  {
        this.larghezza = larghezza;
        this.altezza = altezza;

    }
  public void  calcolaForma(){
        double area = larghezza*altezza;
        System.out.println("Area del rettangolo "+area);
    }
}
