package espaco2D;

import java.util.ArrayList;

public class Espaco2D {
    private ArrayList<Forma> formas;
    private double perimetroTotal;
    private double areaTotal;

    public Espaco2D(){
        formas = new ArrayList<>();
        areaTotal = 0;
        perimetroTotal = 0;
    }

    public Espaco2D(ArrayList<Forma> formas) {
        this.formas = formas;
    }

    public ArrayList<Forma> getFormas() {
        return formas;
    }

    public void setFormas(ArrayList<Forma> formas) {
        this.formas = formas;
    }

    public boolean addForma(Forma novo){
        formas.add(novo);
        return true;
    }

    

    public double calculaPerimetroTotal(){
        for(Forma forma : formas){
            perimetroTotal += forma.calculaPerimetro();
        }
        return perimetroTotal;
    }

    public double calculaAreaTotal(){
        for(Forma forma : formas){
            areaTotal += forma.calculaArea();
        }
        return areaTotal;
    }


    

    
    
}
