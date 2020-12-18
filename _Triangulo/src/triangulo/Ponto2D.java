package triangulo;
public class Ponto2D {
    private double coordenadaX;
    private double coordenadaY;
    public Ponto2D(){
        this.coordenadaX = 0.0;
        this.coordenadaY = 0.0;
    }
    public Ponto2D(double coordenadaX, double coordenadaY){
        this.coordenadaX = coordenadaX;
        this.coordenadaY = coordenadaY;
    }
    public Ponto2D(Ponto2D ponto){
        this.coordenadaX = ponto.getCoordenadaX();
        this.coordenadaY = ponto.getCoordenadaY();
    }
    public double getCoordenadaX() {
        return coordenadaX;
    }
    public void setCoordenadaX(double coordenadaX) {
        this.coordenadaX = coordenadaX;
    }
    public double getCoordenadaY() {
        return coordenadaY;
    }
    public void setCoordenadaY(double coordenadaY) {
        this.coordenadaY = coordenadaY;
    }
    public double calculaDistanciaEntreDoisPontos(Ponto2D ponto){
        double somaCoordenadaX = Math.pow((this.coordenadaX - ponto.coordenadaX) , 2.0);
        double somaCoordenadaY = Math.pow((this.coordenadaY - ponto.coordenadaY) ,2.0);
        return Math.sqrt(somaCoordenadaX + somaCoordenadaY);
    }
}












