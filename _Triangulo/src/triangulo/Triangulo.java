package triangulo;
public class Triangulo {
    private Ponto2D pontoA;
    private Ponto2D pontoB;
    private Ponto2D pontoC;
    public Triangulo(Ponto2D pontoA, Ponto2D pontoB, Ponto2D pontoC){
        this.pontoA = pontoA;
        this.pontoB = pontoB;
        this.pontoC = pontoC;
    }
    public Ponto2D getPontoA() {
        return pontoA;
    }
    public void setPontoA(Ponto2D pontoA) {
        this.pontoA = pontoA;
    }
    public Ponto2D getPontoB() {
        return pontoB;
    }
    public void setPontoB(Ponto2D pontoB) {
        this.pontoB = pontoB;
    }
    public Ponto2D getPontoC() {
        return pontoC;
    }
    public void setPontoC(Ponto2D pontoC) {
        this.pontoC = pontoC;
    }       
    public static boolean formaTriangulo(Ponto2D pontoA, Ponto2D pontoB, Ponto2D pontoC){
        double ladoAB = pontoA.calculaDistanciaEntreDoisPontos(pontoB);
        double ladoAC = pontoA.calculaDistanciaEntreDoisPontos(pontoC);
        double ladoBC = pontoB.calculaDistanciaEntreDoisPontos(pontoC);
        var ladoABLadoACMaiorLadoBC = (ladoAB + ladoAC) > ladoBC;
        var ladoABLadoBCMaiorLadoAC = (ladoAB + ladoBC) > ladoAC;
        var ladoACLadoBCMaiorLadoAB = (ladoAC + ladoBC) > ladoAB;
        return ladoABLadoACMaiorLadoBC
            && ladoABLadoBCMaiorLadoAC
            && ladoACLadoBCMaiorLadoAB;
    }
    public boolean equilatero(){
        double ladoAB = this.pontoA.calculaDistanciaEntreDoisPontos(this.pontoB);
        double ladoAC = this.pontoA.calculaDistanciaEntreDoisPontos(this.pontoC);
        double ladoBC = this.pontoB.calculaDistanciaEntreDoisPontos(this.pontoC);
        return (ladoAB == ladoAC)
            && (ladoAC  == ladoBC);
    }
    public boolean isosceles(){
        double ladoAB = this.pontoA.calculaDistanciaEntreDoisPontos(this.pontoB);
        double ladoAC = this.pontoA.calculaDistanciaEntreDoisPontos(this.pontoC);
        double ladoBC = this.pontoB.calculaDistanciaEntreDoisPontos(this.pontoC);
        boolean ladoABLadoAC = ladoAB == ladoAC;
        boolean ladoABLadoBC = ladoAB == ladoBC;
        boolean ladoBCLadoAC = ladoBC == ladoAC;
        return ladoABLadoAC
                || ladoABLadoBC
                || ladoBCLadoAC;
    }
    public boolean escaleno(){
        double ladoAB = this.pontoA.calculaDistanciaEntreDoisPontos(this.pontoB);
        double ladoAC = this.pontoA.calculaDistanciaEntreDoisPontos(this.pontoC);
        double ladoBC = this.pontoB.calculaDistanciaEntreDoisPontos(this.pontoC);
        boolean ladoABLadoAC = ladoAB != ladoAC;
        boolean ladoABLadoBC = ladoAB != ladoBC;
        boolean ladoBCLadoAC = ladoBC != ladoAC;
        return ladoABLadoAC
            && ladoABLadoBC
            && ladoBCLadoAC;
    }
    public double perimetro() {
        double ladoAB = this.pontoA.calculaDistanciaEntreDoisPontos(this.pontoB);
        double ladoAC = this.pontoA.calculaDistanciaEntreDoisPontos(this.pontoC);
        double ladoBC = this.pontoB.calculaDistanciaEntreDoisPontos(this.pontoC);
        return ladoAB + ladoAC + ladoBC;
    }
    public double area(){
        double ladoAB = this.pontoA.calculaDistanciaEntreDoisPontos(this.pontoB);
        double ladoAC = this.pontoA.calculaDistanciaEntreDoisPontos(this.pontoC);
        double ladoBC = this.pontoB.calculaDistanciaEntreDoisPontos(this.pontoC);
        double semiPerimetro = (ladoAB + ladoAC + ladoBC)/2;
        double multiplicacaoSemiPerimetroLados = (semiPerimetro * (semiPerimetro - ladoAB) * (semiPerimetro - ladoAC) * (semiPerimetro - ladoBC));
        return Math.sqrt(multiplicacaoSemiPerimetroLados);
    }
}















