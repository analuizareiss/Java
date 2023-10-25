package espaco2D;

public class Circulo extends Forma {
    private Ponto2D pontos[];
    private double area;
    private double perimetro;

    public Circulo(){
        pontos = new Ponto2D[2];
    }
    
    public Circulo(Ponto2D[] pontos) {
        this.pontos = pontos;
    }

    public Circulo(Ponto2D[] pontos, Ponto2D[] pontos2) {
        super(pontos);
        pontos = pontos2;
    }

    @Override
    public double calculaArea() {
        double raio = pontos[0].calculaDistancia(pontos[1]);
        area = Math.PI*(raio*raio);
        return area;
    }

    @Override
    public double calculaPerimetro() {
        double raio = pontos[0].calculaDistancia(pontos[1]);
        perimetro = 2*Math.PI*raio;
        return perimetro;
    }

    public Ponto2D[] getPontos() {
        return pontos;
    }

    public void setPontos(Ponto2D[] pontos) {
        this.pontos = pontos;
    }

    
    
}
