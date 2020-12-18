package triangulo;

import java.util.Scanner;

public class Teste {
    private static final int opcaoEncerrarPrograma = 0;
    private static final int quantidadeFinalFuncionalidades = 6;
    private static final int opcaoInstanciaTriangulo = 6;
    
    private static Scanner input;
    public static void main(String[] args) {
        menuApresentacaoPrograma();
        input = new Scanner(System.in);
        int opcaoControleMenuFuncionalidades;
        int opcaoControleMenuTriangulo;
        do{
            var triangulo = instanciarTriangulo();
            do{
                do{
                    menuOpcoesFuncionalidades();
                    opcaoControleMenuFuncionalidades = Integer.parseInt(input.nextLine());
                }while(opcaoControleMenuFuncionalidades < opcaoEncerrarPrograma 
                    || opcaoControleMenuFuncionalidades > quantidadeFinalFuncionalidades);
                switch(opcaoControleMenuFuncionalidades){
                    case 1 -> verificarTrianguloEquilatero(triangulo);
                    case 2 -> verificarTrianguloIsosceles(triangulo);
                    case 3 -> verificarTrianguloEscaleno(triangulo);
                    case 4 -> verificarPerimetroTriangulo(triangulo);
                    case 5 -> verificarAreaTriangulo(triangulo);
                    default -> {}
                }
            }while(opcaoControleMenuFuncionalidades != quantidadeFinalFuncionalidades);
            do{
                menuOpcoesNovoTriangulo();
                opcaoControleMenuTriangulo = Integer.parseInt(input.nextLine());
            }while(opcaoControleMenuTriangulo < opcaoEncerrarPrograma 
                || opcaoControleMenuTriangulo > opcaoInstanciaTriangulo);
        }while(opcaoControleMenuTriangulo != opcaoEncerrarPrograma);
    }
    private static void menuApresentacaoPrograma() {
        System.out.print("\tPrograma Triangulo"
                + "\n\tWarley Júnio Martins Vieira"
                + "\n\tProgramação de Computadores 2");
    }
    private static void menuOpcoesFuncionalidades() {
        System.out.print("\nDigite a opção desejada:"
                       + "\n(1). Verificar se o triangulo é equilatero"
                       + "\n(2). Verificar se o triangulo é isósceles"
                       + "\n(3). Verificar se o triangulo é escaleno"
                       + "\n(4). Verificar o perimetro do triangulo"
                       + "\n(5). Verificar a area do triangulo"
                       + "\n(6). Finalizar testes com esse tringulo"
                       + "\nOpção desejada: ");
    }
    private static void menuOpcoesNovoTriangulo(){
        System.out.print("\nDigite a opção desejada"
                       + "\n(1). Testar novo triangulo"
                       + "\n(0). Encerrar"
                       + "\nOpção: ");
    }
    private static Triangulo instanciarTriangulo(){
        var pontosDoTriangulo = new Ponto2D[3];
        do{
            for(int i = 0; i < 3; i++){
                System.out.println("\n"+(i+1)+"o Ponto:");
                pontosDoTriangulo[i] = instanciarPonto();
            }
        }while(!Triangulo.formaTriangulo(pontosDoTriangulo[0], pontosDoTriangulo[1], pontosDoTriangulo[2]));
        return new Triangulo(pontosDoTriangulo[0], pontosDoTriangulo[1], pontosDoTriangulo[2]);
    }
    private static Ponto2D instanciarPonto(){
        System.out.print("Digite a coordenada X: ");
        double x = Double.parseDouble(input.nextLine());
        System.out.print("Digite a coordenada Y: ");
        double y = Double.parseDouble(input.nextLine());
        return new Ponto2D(x,y);
    }
    private static void verificarTrianguloEquilatero(Triangulo triangulo){
        System.out.println("\nO triangulo é equilatero: "+triangulo.equilatero());
    }
    private static void verificarTrianguloIsosceles(Triangulo triangulo){
        System.out.println("\nO triangulo é isósceles: "+triangulo.isosceles());
    }
    private static void verificarTrianguloEscaleno(Triangulo triangulo){
        System.out.println("\nO triangulo é escaleno: "+triangulo.escaleno());
    }
    private static void verificarPerimetroTriangulo(Triangulo triangulo){
        System.out.printf("\nO perimetro do triangulo é: %02f ", triangulo.perimetro());
    }
    private static void verificarAreaTriangulo(Triangulo triangulo){
        System.out.printf("\nA area do triangulo é: %02f ", triangulo.area());
    } 
}




















