package org.example;

public class Produto {
    public Produto(String id, String nome, float preco, String tipoVenda){
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.tipoVenda = tipoVenda;
    }
    private String id;
    private String nome;
    private float preco;
    private String tipoVenda;

    public String getId(){
        return id;
    }
    public void setId(String id){
        this.id = id;
    }
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public float getPreco() {
        return preco;
    }
    public void setPreco(float preco) {
        this.preco = preco;
    }
    public String getTipoVenda() {
        return tipoVenda;
    }
    public void setTipoVenda(String tipoVenda) {
        this.tipoVenda = tipoVenda;
    }
}
