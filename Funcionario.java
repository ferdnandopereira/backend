package org.example;

public class Funcionario {
    public Funcionario(String id, String nome, String cpf, String cargo, double salario, String turnoTrabalho){
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.cargo = cargo;
        this.salario = salario;
        this.turnoTrabalho = turnoTrabalho;
    }
    private String id;
    private String nome;
    private String cpf;
    private String cargo;
    private double salario;
    private String turnoTrabalho;

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
    public String getCpf(){
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getCargo(){
        return cargo;
    }
    public void setCargo(String cargo){
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getTurnoTrabalho(){
        return turnoTrabalho;
    }
    public void setTurnoTrabalho(String turnoTrabalho) {
        this.turnoTrabalho = turnoTrabalho;
    }
}
