package espaco2D;

public abstract class Forma {
    private Ponto2D[] pontos;
    private int limite;
    
    public Forma(){
        limite = 30;
        pontos = new Ponto2D[limite];
    }

    public Forma(Ponto2D[] pontos) {
        this.pontos = pontos;
    }

    public Ponto2D[] getPontos() {
        return pontos;
    }

    public void setPontos(Ponto2D[] pontos) {
        this.pontos = pontos;
    }

    public abstract double calculaArea();

    public abstract double calculaPerimetro();

    public static Forma geraForma(Ponto2D[] pontos){
        if(pontos.length == 3){
            double lado1 = pontos[0].calculaDistancia(pontos[1]);
            double lado2 = pontos[1].calculaDistancia(pontos[2]);
            double lado3 = pontos[2].calculaDistancia(pontos[0]);

            if((lado1 + lado2) > lado3 && (lado2 + lado3) > lado1 && (lado1 + lado3) > lado2){
                return new Triangulo(pontos);
            }
        }
        else if(pontos.length == 4){
            double lado1 = pontos[0].calculaDistancia(pontos[1]);
            double lado2 = pontos[1].calculaDistancia(pontos[2]);
            double lado3 = pontos[2].calculaDistancia(pontos[3]);
            double lado4 = pontos[3].calculaDistancia(pontos[0]);

            if((lado1 == lado2) && (lado2 == lado3) && lado3 == lado4){
                return new Quadrado(pontos);
            }
        }
        else if(pontos.length == 2){
            return new Circulo(pontos);
        }
        
        return null;
        



    }
    
}
