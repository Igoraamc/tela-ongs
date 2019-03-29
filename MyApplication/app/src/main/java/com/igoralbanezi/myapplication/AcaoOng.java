package com.igoralbanezi.myapplication;

public class AcaoOng {
    private String nome;
    private String dataEHora;

    public AcaoOng(String nome, String dataEHora) {
        this.nome = nome;
        this.dataEHora = dataEHora;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataEHora() {
        return dataEHora;
    }

    public void setDataEHora(String dataEHora) {
        this.dataEHora = dataEHora;
    }
}
