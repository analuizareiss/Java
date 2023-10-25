package espaco2D;

public class Triangulo extends Forma {
    private Ponto2D pontos[];
    private double area;
    private double perimetro;
    private double lado1;
    private double lado2;
    private double lado3;

    public Triangulo(){
        pontos = new Ponto2D[3];
    }

    public Triangulo(Ponto2D[] pontos) {
        this.pontos = pontos;
        lado1 = pontos[0].calculaDistancia(pontos[1]);
        lado2 = pontos[1].calculaDistancia(pontos[2]);
        lado3 = pontos[2].calculaDistancia(pontos[0]);
    }

    public Triangulo(Ponto2D[] pontos, Ponto2D[] pontos2) {
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
        //usando Formula de Heron
        double s = 0.5 * calculaPerimetro();
        area = Math.sqrt(s*((s-lado1)*(s-lado2)*(s-lado3)));
        return area;
    }

    @Override
    public double calculaPerimetro() {
        perimetro = lado1 + lado2 + lado3;
        return perimetro;
    }

    public String tipoDoTriangulo(){
        if((lado1 == lado2) && (lado2 == lado3) && (lado3 == lado1)){
            return "Equilátero";
        }
        else if((lado1 != lado2) && (lado2 != lado3) && (lado3 != lado1)){
            return "Escaleno";

        }else{
            return "Isósceles";
        }
    }
    
}
