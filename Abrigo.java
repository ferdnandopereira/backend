package org.example;

public class Abrigo {

    public Abrigo(String nomeAbrigo, int capacidadeMaxima, int quantidadeMaxima, String tipoAbrigo, boolean clima){
        this.nomeAbrigo = nomeAbrigo;
        this.capacidadeMaxima = capacidadeMaxima;
        this.quantidadeMaxima = quantidadeMaxima;
        this.tipoAbrigo = tipoAbrigo;
        this.clima = clima;
    }
    private String nomeAbrigo;
    private int capacidadeMaxima;
    private int quantidadeMaxima;
    private String tipoAbrigo;
    private boolean clima;

    public String getNomeAbrigo(){
        return nomeAbrigo;
    }
    public void setNomeAbrigo(String nomeAbrigo){
        this.nomeAbrigo = nomeAbrigo;
    }
    public int getCapacidadeMaxima(){
        return capacidadeMaxima;
    }
    public void setCapacidadeMaxima(int capacidadeMaxima){
        this.capacidadeMaxima = capacidadeMaxima;
    }
    public int getQuantidadeMaxima(){
        return quantidadeMaxima;
    }
    public void setQuantidadeMaxima(int quantidadeMaxima) {
        this.quantidadeMaxima = quantidadeMaxima;
    }
    public String getTipoAbrigo(){
        return tipoAbrigo;
    }
    public void setTipoAbrigo(String tipoAbrigo){
        this.tipoAbrigo = tipoAbrigo;
    }
    public boolean getTipoClima(){
        return clima;
    }
    public void setClima(boolean clima) {
        this.clima = clima;
    }

}
