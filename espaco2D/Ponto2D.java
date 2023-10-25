package espaco2D;

public class Ponto2D {
    private double x;
    private double y;
    //private double distancia1;
    
    public Ponto2D(){
        x = 0;
        y = 0;
    }

    public Ponto2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Ponto2D(Ponto2D ponto){
        ponto = new Ponto2D();
    }
    
    public double getX() {
        return x;
    }
    public void setX(double x) {
        this.x = x;
    }
    public double getY() {
        return y;
    }
    public void setY(double y) {
        this.y = y;
    }

    public double calculaDistancia(Ponto2D outroPonto){
        double dx = this.x - outroPonto.getX();
        double dy = this.y - outroPonto.getY();
        
        return Math.sqrt(dx * dx + dy * dy);
    }

    

}
