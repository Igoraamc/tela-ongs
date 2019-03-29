package com.igoralbanezi.myapplication;

public class ObjOng {
    private String nome;
    private String tel;
    private String end;
    private AcaoOng acao;

    public ObjOng(String nome, String tel, String end, AcaoOng acao) {
        this.nome = nome;
        this.tel = tel;
        this.end = end;
        this.acao = acao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public AcaoOng getAcao() {
        return acao;
    }
}
