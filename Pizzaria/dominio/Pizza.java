/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pizzaria.dominio;

import java.util.ArrayList;

/**
 * Classe responsável por reunir as informações da pizza
 * @author Ana Luiza, Bianca Pacífico, Letícia Pires, Gabriel Pontes
 */
public class Pizza {
    private String sabor;
    private double valor;
    private String tamanho;

    public Pizza (){
        sabor = "";
        valor = 0;
        tamanho = "";
    }
    
    public Pizza(String sabor, double valor, String tamanho, ArrayList<String> adicionais) {
        this.sabor = sabor;
        this.valor = valor;
        this.tamanho = tamanho;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }
    
    /**
 * metóto que reune as informações sobre a pizza
 *@return informações da pizza
 */
    public String getInfo(){
        return "Pizza: "+ sabor + " Tamanho: "+tamanho+ " Valor: "+valor + "\n";
    }
}