package org.example;

public class Animal {

    public Animal(String nome, String especie, int idade, String habitat, String carteiraVacinacao, String tipoAlimentacao){
        this.nome = nome;
        this.especie = especie;
        this.idade = idade;
        this.habitat = habitat;
        this.carteiraVacinacao = carteiraVacinacao;
        this.tipoAlimentacao = tipoAlimentacao;
    }
    private String nome;
    private String especie;
    private int idade;
    private String habitat;
    private String carteiraVacinacao;
    private String tipoAlimentacao;

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getEspecie(){
        return especie;
    }
    public void setEspecie(String especie){
        this.especie = especie;
    }
    public int getIdade(){
        return idade;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    public String getHabitat(){
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }
    public String getCarteiraVacinacao(){
        return carteiraVacinacao;
    }

    public void setCarteiraVacinacao(String carteiraVacinacao) {
        this.carteiraVacinacao = carteiraVacinacao;
    }
    public String getTipoAlimentacao(){
        return getTipoAlimentacao();
    }

    public void setTipoAlimentacao(String tipoAlimentacao) {
        this.tipoAlimentacao = tipoAlimentacao;
    }
}
