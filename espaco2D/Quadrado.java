package espaco2D;

public class Quadrado extends Forma {
    private Ponto2D pontos[];
    private double area;
    private double perimetro;

    public Quadrado(){
        pontos = new Ponto2D[4];
    }

    public Quadrado(Ponto2D[] pontos) {
        this.pontos = pontos;
    }

    public Quadrado(Ponto2D[] pontos, Ponto2D[] pontos2) {
        super(pontos);
        pontos = pontos2;
    }

    public Ponto2D[] getPontos() {
        return pontos;
    }

    public void setPontos(Ponto2D[] pontos) {
        this.pontos = pontos;
    }

    @Override
    public double calculaArea() {
        double lado1 = pontos[0].calculaDistancia(pontos[1]);
        area = lado1*lado1; 
        return area;
    }

    @Override
    public double calculaPerimetro() {
        double lado1 = pontos[0].calculaDistancia(pontos[1]);
        perimetro = 4*lado1;  
        return perimetro;
    }

}
