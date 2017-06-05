package Objetos;

public class Jogador {

    private int pk_jogador;
    private String nome_jog;
    private String email_jog;

    public Jogador(int pk_jogador, String nome_jog, String email_jog) {
        this.pk_jogador = pk_jogador;
        this.nome_jog = nome_jog;
        this.email_jog = email_jog;
    }

    public Jogador() {
    }

    @Override
    public String toString() {
        return "Jogador{" + "pk_jogador=" + pk_jogador + ", nome_jog=" + nome_jog + ", email_jog=" + email_jog + '}';
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
