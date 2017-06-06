package Objetos;

import java.sql.Date;

public class Jogador {

    private int pk_jogador;
    private String nome_jog;
    private String email_jog;
    private String senha_jog;
    private Date dt_registro;
    private Date dt_ultimoLogin;

    public Jogador(String nome_jog, String email_jog, String senha_jog) {
        this.nome_jog = nome_jog;
        this.email_jog = email_jog;
        this.senha_jog = senha_jog;
    }

    public Jogador() {
    }

    @Override

    public String toString() {
        return "Jogador{" + "pk_jogador=" + pk_jogador + ", nome_jog=" + nome_jog + ", email_jog=" + email_jog + ", senha_jog=" + senha_jog + ", dt_registro=" + dt_registro + ", dt_ultimoLogin=" + dt_ultimoLogin + '}';
    }

    public Date getDt_registro() {
        return dt_registro;
    }

    public void setDt_registro(Date dt_registro) {
        this.dt_registro = dt_registro;
    }

    public Date getDt_ultimoLogin() {
        return dt_ultimoLogin;
    }

    public void setDt_ultimoLogin(Date dt_ultimoLogin) {
        this.dt_ultimoLogin = dt_ultimoLogin;
    }

    public String getSenha_jog() {
        return senha_jog;
    }

    public void setSenha_jog(String senha_jog) {
        this.senha_jog = senha_jog;
    }

    public int getPk_jogador() {
        return pk_jogador;
    }

    public void setPk_jogador(int pk_jogador) {
        this.pk_jogador = pk_jogador;
    }

    public String getNome_jog() {
        return nome_jog;
    }

    public void setNome_jog(String nome_jog) {
        this.nome_jog = nome_jog;
    }

    public String getEmail_jog() {
        return email_jog;
    }

    public void setEmail_jog(String email_jog) {
        this.email_jog = email_jog;
    }

}
