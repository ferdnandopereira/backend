package org.example;

public class Visitante {
    public Visitante(String nome, String cpf, int idade, String tipoIngresso, boolean guiaTuristico, boolean possuiMapa){
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.tipoIngresso = tipoIngresso;
        this.guiaTuristico = guiaTuristico;
        this.possuiMapa = possuiMapa;
    }
    private String nome;
    private String cpf;
    private int idade;
    private String tipoIngresso;
    private boolean guiaTuristico;
    private boolean possuiMapa;
    public String getNome(){
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf(){
        return cpf;
    }
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    public int getIdade(){
        return idade;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    public String getTipoIngresso(){
        return tipoIngresso;
    }
    public void setTipoIngresso(String tipoIngresso) {
        this.tipoIngresso = tipoIngresso;
    }
    public boolean isGuiaTuristico(){
        return guiaTuristico;
    }
    public void setGuiaTuristico(boolean guiaTuristico) {
        this.guiaTuristico = guiaTuristico;
    }
    public boolean isPossuiMapa(){
        return possuiMapa;
    }
    public void setPossuiMapa(boolean possuiMapa) {
        this.possuiMapa = possuiMapa;
    }
}
